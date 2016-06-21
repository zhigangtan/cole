package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubepositoryDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import org.apache.commons.exec.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * GitPullCommandHandler
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class GitPullCommandHandler extends AbstractHandler {

    private static final Logger logger = LoggerFactory.getLogger(GitPullCommandHandler.class);

    @Override
    public ResponseDto response(RequestConext conext) {
        try {
            GitHubRequestBodyDto bodyDto = conext.getBodyDto();
            GitHubepositoryDto gitHubepositoryDto = bodyDto.getRepository();
            Map map = new HashMap();
            map.put("branch", "master");
            map.put("url", gitHubepositoryDto.getHtml_url());
            CommandLine cmdLine = new CommandLine("git");
            cmdLine.addArgument("clone");
            cmdLine.addArgument("-b");
            cmdLine.addArgument("${branch}");
            cmdLine.addArgument("${url}");
            cmdLine.setSubstitutionMap(map);
            DefaultExecutor executor = new DefaultExecutor();
            DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
            executor.setExitValue(1);
            ExecuteWatchdog watchdog = new ExecuteWatchdog(60000);
            PumpStreamHandler streamHandler=new PumpStreamHandler();
            executor.setWatchdog(watchdog);
            executor.setStreamHandler(streamHandler);
            executor.execute(cmdLine, resultHandler);

            int exitValue = resultHandler.getExitValue();

        } catch (Exception e) {
            logger.error("git pull error", e);
        }
        return null;
    }
}
