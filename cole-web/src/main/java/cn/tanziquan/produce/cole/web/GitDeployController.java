package cn.tanziquan.produce.cole.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * GitDeployController
 *
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "/deploy")
public class GitDeployController {


    private static final Logger logger = LoggerFactory.getLogger(GitDeployController.class);

    @RequestMapping(value = "/{appId:.+}", method = RequestMethod.POST)
    public void deploy(@PathVariable(value = "appId") String appId, @RequestBody String bodyJson) {
        logger.info("appId:{},bodyJson:{}", appId, bodyJson);
    }

}
