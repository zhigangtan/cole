package cn.tanziquan.produce.cole.web.ddtalk;

import cn.tanziquan.produce.cole.configure.properties.DdtalkEnvProperties;
import cn.tanziquan.produce.cole.util.DingTalkEncryptException;
import cn.tanziquan.produce.cole.util.DingTalkEncryptor;
import cn.tanziquan.produce.cole.web.ddtalk.vo.Encrypt;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * DdtalkRegisterReceiveController
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "/register")
public class DdtalkRegisterReceiveController {

    private static final Logger logger = LoggerFactory.getLogger(DdtalkRegisterReceiveController.class);
    @Autowired
    private DdtalkEnvProperties ddtalkEnvProperties;

    @ResponseBody
    @RequestMapping(value = "/receive")
    private Map<String, String> receive(@RequestBody String encrypt, @RequestParam(value = "signature") String signature, @RequestParam(value = "timestamp") String timestamp, @RequestParam(value = "nonce") String nonce) {

        Map<String, String> resultMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();

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
            logger.error("DingTalkEncryptException", dte);
        } catch (Exception e) {
            logger.error("error", e);
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
                case "user_modify_org":
                    break;
                case "check_url":
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
