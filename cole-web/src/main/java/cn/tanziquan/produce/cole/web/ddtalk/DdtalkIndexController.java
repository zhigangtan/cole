package cn.tanziquan.produce.cole.web.ddtalk;

import com.dingtalk.open.client.ServiceFactory;
import com.dingtalk.open.client.api.model.corp.SsoUserInfo;
import com.dingtalk.open.client.api.service.corp.SsoService;
import com.dingtalk.open.client.api.service.isv.IsvService;
import com.dingtalk.open.client.common.SdkInitException;
import com.dingtalk.open.client.common.ServiceNotExistException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private SsoUserInfo userInfo;


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
            SsoUserInfo userInfo=  ssoService.getSSOUserinfo("r9HWfoFsQT3Y9LoGFgpPqnFHXqjuGX73VTcwAeR7DbQGnKEAJid125nFgf2c-VwB",code);
          logger.info("user:{},corpid", userInfo.getName());
        } catch (Exception e) {
            logger.error("get sso error", e);
        }

        return "ok admin ";
    }
}
