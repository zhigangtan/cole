package cn.tanziquan.produce.cole.web;


import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.service.IGitHubDepolyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IGitHubDepolyService gitHubDepolyService;

    @RequestMapping(value = "/github/{appId:.+}", method = RequestMethod.POST)
    public void deploy(@PathVariable(value = "appId") String appId, @RequestBody GitHubRequestBodyDto bodyDto) {
        logger.info("appId:{},bodyDto:{}", appId, bodyDto);
        gitHubDepolyService.gitDepoly(appId, bodyDto);
    }

}
