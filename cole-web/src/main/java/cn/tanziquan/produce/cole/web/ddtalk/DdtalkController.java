package cn.tanziquan.produce.cole.web.ddtalk;

import cn.tanziquan.produce.cole.configure.properties.DdtalkEnvProperties;
import cn.tanziquan.produce.cole.data.domain.DdtalkApp;
import cn.tanziquan.produce.cole.data.domain.DdtalkCropAuth;
import cn.tanziquan.produce.cole.ddtalkapp.service.IDdtalkAppService;
import cn.tanziquan.produce.cole.util.DingTalkEncryptException;
import cn.tanziquan.produce.cole.util.DingTalkEncryptor;
import cn.tanziquan.produce.cole.util.Env;
import cn.tanziquan.produce.cole.web.ddtalk.helper.AuthHelper;
import cn.tanziquan.produce.cole.web.ddtalk.helper.ServiceHelper;
import cn.tanziquan.produce.cole.web.ddtalk.vo.Encrypt;
import com.alibaba.fastjson.JSONObject;
import com.dingtalk.open.client.ServiceFactory;
import com.dingtalk.open.client.api.model.corp.CorpUserDetail;
import com.dingtalk.open.client.api.model.corp.CorpUserDetailList;
import com.dingtalk.open.client.api.model.corp.Department;
import com.dingtalk.open.client.api.model.isv.CorpAuthInfo;
import com.dingtalk.open.client.api.model.isv.CorpAuthSuiteCode;
import com.dingtalk.open.client.api.service.corp.CorpDepartmentService;
import com.dingtalk.open.client.api.service.corp.CorpUserService;
import com.dingtalk.open.client.api.service.isv.IsvService;
import com.dingtalk.open.client.common.SdkInitException;
import com.dingtalk.open.client.common.ServiceNotExistException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DdtalkController
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@RestController
public class DdtalkController {

    private static final Logger logger = LoggerFactory.getLogger(DdtalkController.class);

    @Autowired
    private IDdtalkAppService ddtalkAppService;

    @Autowired
    private DdtalkEnvProperties ddtalkEnvProperties;

    @ResponseBody
    @RequestMapping(value = "/isvreceive")
    private Map<String, String> isvreceive(@RequestBody String encrypt, @RequestParam(value = "signature") String signature, @RequestParam(value = "timestamp") String timestamp, @RequestParam(value = "nonce") String nonce) {

        Map<String, String> resultMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        DingTalkEncryptException dingTalkEncryptException = null;
        DingTalkEncryptor dingTalkEncryptor = null;
        String plainText = "";
        Encrypt encryptvo = null;
        try {
            logger.info("encrypt:[{}]", encrypt);
            logger.info("signature:[{}],timestamp;[{}],nonce:[{}]", signature, timestamp, nonce);
            encryptvo = objectMapper.readValue(encrypt, Encrypt.class);
            dingTalkEncryptor = new DingTalkEncryptor(ddtalkEnvProperties.getToken(), ddtalkEnvProperties.getEncodingAesKey(), ddtalkEnvProperties.getSuiteKey());
                /*
                 * 获取从encrypt解密出来的明文
				 */
            plainText = dingTalkEncryptor.getDecryptMsg(signature, timestamp, nonce, encryptvo.getEncrypt());
            logger.info("plainText:{}", plainText);
        } catch (DingTalkEncryptException dte) {
            dingTalkEncryptException = dte;
            logger.error("DingTalkEncryptException", dte);
        } catch (Exception e) {
            logger.error("error", e);
        } finally {
            if (dingTalkEncryptException != null) {
                if (dingTalkEncryptException.code == DingTalkEncryptException.COMPUTE_DECRYPT_TEXT_CORPID_ERROR) {
                    try {
                            /*
                             * 第一次创建套件生成加解密类需要传入Env.CREATE_SUITE_KEY，
							 */
                        dingTalkEncryptor = new DingTalkEncryptor(ddtalkEnvProperties.getToken(), ddtalkEnvProperties.getEncodingAesKey(),
                                ddtalkEnvProperties.getCreateSuiteKey());
                        plainText = dingTalkEncryptor.getDecryptMsg(signature, timestamp, nonce, encryptvo.getEncrypt());
                    } catch (DingTalkEncryptException e) {
                        logger.error("trwo DingTalkEncryptException", e);
                    }
                }
            }
        }
        logger.info("plainText:{}", plainText);
        if (StringUtils.isEmpty(plainText)) {
            return new HashMap<>();
        }
        String resultText = "success";
        try {
            JSONObject plainTextJson = JSONObject.parseObject(plainText);
            String eventType = plainTextJson.getString("EventType");
            switch (eventType) {
                case "suite_ticket":
                /*"suite_ticket"事件每二十分钟推送一次,数据格式如下
                 * {
					  "SuiteKey": "suitexxxxxx",
					  "EventType": "suite_ticket ",
					  "TimeStamp": 1234456,
					  "SuiteTicket": "adsadsad"
					}
				 */
                    //获取到suiteTicket之后需要换取suiteToken，
                    String tmpSuiteKey = plainTextJson.getString("SuiteKey");
                    String tmpSuiteTicket = plainTextJson.getString("SuiteTicket");
                    String suiteToken = ServiceHelper.getSuiteToken(tmpSuiteKey, ddtalkEnvProperties.getSuiteSecret(), tmpSuiteTicket);
                /*
                 * ISV应当把最新推送的suiteTicket做持久化存储，
				 * 以防重启服务器之后丢失了当前的suiteTicket
				 *
				 */
                    DdtalkApp ddtakApp = ddtalkAppService.getDdtalkApp(eventType);
                    if (ddtakApp == null) {
                        ddtakApp = new DdtalkApp();
                        ddtakApp.setSuiteKey(tmpSuiteKey);
                        ddtakApp.setSuiteToken(suiteToken);
                        ddtakApp.setSuiteTicket(tmpSuiteTicket);
                        ddtakApp.setEventType(eventType);
                    } else {
                        ddtakApp.setSuiteKey(tmpSuiteKey);
                        ddtakApp.setSuiteToken(suiteToken);
                        ddtakApp.setSuiteTicket(tmpSuiteTicket);
                    }
                    ddtalkAppService.insertOrUpdate(ddtakApp);
                    break;
                case "tmp_auth_code":
                /*"tmp_auth_code"事件将企业对套件发起授权的时候推送
                 * 数据格式如下
				{
				  "SuiteKey": "suitexxxxxx",
				  "EventType": " tmp_auth_code",
				  "TimeStamp": 1234456,
				  "AuthCode": "adads"
				}
				*/
                    String tmpAuthCode = plainTextJson.getString("AuthCode");

                    String suiteTokenPerm = "";

                    DdtalkApp tddtakApp = ddtalkAppService.getDdtalkApp("suite_ticket");
                    if (tddtakApp != null) {
                        suiteTokenPerm = tddtakApp.getSuiteToken();
                    } else {
                        break;
                    }

                    logger.info("拿到 拿到tmp_auth_code:{}", tmpAuthCode);
				/*
				 * 拿到tmp_auth_code（临时授权码）后，需要向钉钉服务器获取企业的corpId（企业id）和permanent_code（永久授权码）
				 */
                    CorpAuthSuiteCode corpAuthSuiteCode = ServiceHelper.getPermanentCode(tmpAuthCode, suiteTokenPerm);
                    String corpId = corpAuthSuiteCode.getAuth_corp_info().getCorpid();
                    String permanent_code = corpAuthSuiteCode.getPermanent_code();

                    logger.info("拿到 拿到permanent_code:{}", permanent_code);
				/*
				 * 将corpId（企业id）和permanent_code（永久授权码）做持久化存储
				 * 之后在获取企业的access_token时需要使用
				 */
                    //permanentcode
                    logger.info("保存permanent_code:{}", permanent_code);
                    DdtalkCropAuth ddtalkCropAuth = new DdtalkCropAuth();
                    ddtalkCropAuth.setCorpid(corpId);
                    ddtalkCropAuth.setPermanentCode(permanent_code);
                    ddtalkAppService.insertOrUpdateDdtalkCropAuth(ddtalkCropAuth);
				/*
				 * 对企业授权的套件发起激活，
				 */
                    logger.info("激活permanent_code:{}", permanent_code);
                    ServiceHelper.getActivateSuite(suiteTokenPerm, ddtalkEnvProperties.getSuiteKey(), corpId, permanent_code);
				/*
				 * 获取对应企业的access_token，每一个企业都会有一个对应的access_token，访问对应企业的数据都将需要带上这个access_token
				 * access_token的过期时间为两个小时
				 */
                    String corpToken= ServiceHelper.getCorpToken(corpId,permanent_code,suiteTokenPerm);

                    CorpAuthInfo corpAuthInfo= ServiceHelper.getAuthInfo(suiteTokenPerm,ddtalkEnvProperties.getSuiteKey(),corpId,permanent_code);
                   cn.tanziquan.produce.cole.data.domain.CorpAuthInfo corpInfo=new cn.tanziquan.produce.cole.data.domain.CorpAuthInfo();
                    corpInfo.setCorpid(corpAuthInfo.getAuth_corp_info().getCorpid());
                    corpInfo.setCorpName(corpAuthInfo.getAuth_corp_info().getCorp_name());
                    corpInfo.setIndustry(corpAuthInfo.getAuth_corp_info().getIndustry());
                    ddtalkAppService.insertCorpAuthInfo(corpInfo);

                    try {
                        ServiceFactory serviceFactory = ServiceFactory.getInstance();
                        CorpDepartmentService corpDepartmentService = serviceFactory.getOpenService(CorpDepartmentService.class);
                        CorpUserService corpUserService=serviceFactory.getOpenService(CorpUserService.class);
                        List<Department> departments= corpDepartmentService.getDeptList(corpToken,"");
                        for (Department department:departments){
                            CorpUserDetailList corpUserDetailList= corpUserService.getCorpUserList(corpToken,department.getId(),0l,100,"");

                            List<CorpUserDetail> corpUserDetails= corpUserDetailList.getUserlist();

                        }
                    } catch (Exception e) {
                       logger.error("CorpDepartmentService");
                    }


                    break;
                case "change_auth":
				/*"change_auth"事件将在企业授权变更消息发生时推送
				 * 数据格式如下
				{
				  "SuiteKey": "suitexxxxxx",
				  "EventType": " change_auth",
				  "TimeStamp": 1234456,
				  "AuthCorpId": "xxxxx"
				}
				*/

                    // String corpid = plainTextJson.getString("AuthCorpID");
                    // 由于以下操作需要从持久化存储中获得数据，而本demo并没有做持久化存储（因为部署环境千差万别），所以没有具体代码，只有操作指导。
                    // 1.根据corpid查询对应的permanent_code(永久授权码)
                    // 2.调用『企业授权的授权数据』接口（ServiceHelper.getAuthInfo方法），此接口返回数据具体详情请查看文档。
                    // 3.遍历从『企业授权的授权数据』接口中获取所有的微应用信息
                    // 4.对每一个微应用都调用『获取企业的应用信息接口』（ServiceHelper.getAgent方法）
				/*
				 * 5.获取『获取企业的应用信息接口』接口返回值其中的"close"参数，才能得知微应用在企业用户做了授权变更之后的状态，有三种状态码
				 * 	分别为0，1，2.含义如下：
				 *  0:禁用（例如企业用户在OA后台禁用了微应用）
				 *  1:正常 (例如企业用户在禁用之后又启用了微应用)
				 *  2:待激活 (企业已经进行了授权，但是ISV还未为企业激活应用)
				 *  再根据具体状态做具体操作。
				 */

                    break;
                case "check_create_suite_url":
				/*"check_create_suite_url"事件将在创建套件的时候推送
				 * {
					  "EventType":"check_create_suite_url",
					  "Random":"brdkKLMW",
					  "TestSuiteKey":"suite4xxxxxxxxxxxxxxx"
					}
				 */
                    //此事件需要返回的"Random"字段，
                    String tmpRandom = plainTextJson.getString("Random");
                    resultText = tmpRandom;
                    break;

                case "check_update_suite_url":
				/* "check_update_suite_url"事件将在更新套件的时候推送
				 * {
					  "EventType":"check_update_suite_url",
					  "Random":"Aedr5LMW",
					  "TestSuiteKey":"suited6db0pze8yao1b1y"

					}
				 */
                    resultText = plainTextJson.getString("Random");
                    break;
                default: // do something
                    break;
            }
        } catch (Exception e) {
            logger.error("er", e);
        }

        try {
            resultMap = dingTalkEncryptor.getEncryptedMap(resultText, Long.parseLong(timestamp), nonce);
        } catch (DingTalkEncryptException e) {
            logger.error("getEncryptedMap error", e);
        }
        return resultMap;
    }
}
