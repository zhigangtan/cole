package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.BuildDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import cn.tanziquan.produce.cole.gitdeploy.helper.CommandLineHelper;
import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
        String codePath = conext.getCodePath();
        try {
            String projectBuildFileName = conext.getAppNo() + "_build.yml";
            File projectBuildFile = new File(FilenameUtils.concat(codePath, projectBuildFileName));
            if (projectBuildFile.exists()) {
                Constructor constructor = new Constructor(BuildDto.class);
                InputStream input = new FileInputStream(projectBuildFile);
                Yaml yaml = new Yaml(constructor);
                BuildDto data = (BuildDto) yaml.load(input);
                List<String> scripts = data.getScript();
                logger.info("scripts:{}", scripts);
                if (!CollectionUtils.isEmpty(scripts)) {
                    CommandLineHelper commandLineHelper = new CommandLineHelper();
                    for (String script : scripts) {
                        commandLineHelper.executeScript(codePath, script);
                    }
                }
            }
            FileUtils.forceDeleteOnExit(new File(codePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
