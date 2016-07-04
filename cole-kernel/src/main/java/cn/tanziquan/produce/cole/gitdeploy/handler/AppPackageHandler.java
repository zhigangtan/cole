package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.BuildDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import cn.tanziquan.produce.cole.gitdeploy.helper.CommandLineHelper;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * AppPackageHandler
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class AppPackageHandler extends AbstractHandler {

    private static final Logger logger = LoggerFactory.getLogger(AppPackageHandler.class);

    @Override
    public ResponseDto response(RequestConext conext) {
        ResponseDto responseDto = new ResponseDto();
        String codePath = conext.getCodePath();
        try {
            String projectBuildFileName = conext.getAppNo() + "_build.yml";
            File projectBuildFile = new File(FilenameUtils.concat(codePath, projectBuildFileName));
            if (projectBuildFile.exists()) {
                CommandLineHelper commandLineHelper = new CommandLineHelper();
                Constructor constructor = new Constructor(BuildDto.class);
                InputStream input = new FileInputStream(projectBuildFile);
                Yaml yaml = new Yaml(constructor);
                BuildDto data = (BuildDto) yaml.load(input);
                List<String> scripts = data.getScript();
                logger.info("scripts:{}", scripts);

                if (!CollectionUtils.isEmpty(scripts)) {
                    responseDto.setSuccess(commandLineHelper.executeScript(codePath, scripts));
                }
                if (responseDto.isSuccess()) {
                    if(StringUtils.isNotBlank(data.getOutfile())){
                        commandLineHelper.executeScript(codePath,"mkdir "+data.getOutfile());
                    }
                    conext.setOutfile(data.getOutfile());
                    List<String> afterSuccesScripts = data.getAfter_success();
                    if (!CollectionUtils.isEmpty(afterSuccesScripts)) {
                        responseDto.setSuccess(commandLineHelper.executeScript(codePath, afterSuccesScripts));
                    }
                }
            }
        } catch (Exception e) {
            logger.error("AppPackageHandler error ", e);
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
