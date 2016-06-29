package cn.tanziquan.produce.cole.web.ddtalk;

import cn.tanziquan.produce.cole.basic.util.HttpUtil;
import cn.tanziquan.produce.cole.configure.properties.DdtalkEnvProperties;
import cn.tanziquan.produce.cole.ddtalkapp.dto.GetUserInfoResponse;
import cn.tanziquan.produce.cole.ddtalkapp.dto.SSOUserInfo;
import com.dingtalk.open.client.ServiceFactory;
import com.dingtalk.open.client.api.service.corp.SsoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DdtalkController
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "/ddalk")
public class DdtalkIndexController {

    private static final Logger logger = LoggerFactory.getLogger(DdtalkIndexController.class);


    @Autowired
    private DdtalkEnvProperties ddtalkEnvProperties;


    @RequestMapping(value = "/index")
    private String index(@RequestParam(value = "corpid") String corpid) {
        logger.info("index corpid:{}", corpid);
        return "ok index";
    }


    @RequestMapping(value = "/admin")
    private String admin(@RequestParam(value = "code") String code) {
        logger.info("admin code:{}", code);
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            SsoService ssoService = serviceFactory.getOpenService(SsoService.class);
            String token = ssoService.getSSOToken(ddtalkEnvProperties.getCorpId(), ddtalkEnvProperties.getCorpSecret());
            logger.info("token:{},", token);
            GetUserInfoResponse response = HttpUtil.execution("/sso/getuserinfo?access_token="+token+"&code="+code , GetUserInfoResponse.class);
            SSOUserInfo userInfo = response.getUser_info();
            logger.info("userid:{},userName:{}", userInfo.getUserid(), userInfo.getName());
        } catch (Exception e) {
            logger.error("get sso error", e);
        }

        return "ok admin ";
    }
}
