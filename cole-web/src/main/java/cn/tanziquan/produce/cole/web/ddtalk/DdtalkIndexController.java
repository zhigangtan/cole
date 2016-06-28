package cn.tanziquan.produce.cole.web.ddtalk;

import cn.tanziquan.produce.cole.configure.properties.DdtalkEnvProperties;
import cn.tanziquan.produce.cole.ddtalkapp.service.IDdtalkAppService;
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


    @RequestMapping(value = "/index")
    private String index(@RequestParam(value = "corpid") String corpid) {
        logger.info("index corpid:{}", corpid);

        return "ok";
    }


    @RequestMapping(value = "/admin")
    private String admin(@RequestParam(value = "corpid") String corpid) {
        logger.info("admin corpid:{}", corpid);

        return "ok";
    }
}
