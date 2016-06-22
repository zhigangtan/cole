package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.github.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.github.GitHubepositoryDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import cn.tanziquan.produce.cole.gitdeploy.helper.CommandLineHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

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
            GitHubepositoryDto repository = bodyDto.getRepository();
            String branch = StringUtils.removeStartIgnoreCase(bodyDto.getRef(), "refs/heads/");
            String buildPath = conext.getBuildPath();
            File workFile = new File(buildPath + File.separator + repository.getName() + File.separator + bodyDto.getAfter());
            CommandLineHelper commandLineHelper = new CommandLineHelper();
            commandLineHelper.executeGitClone(workFile.getPath(), branch, repository.getHtml_url());
            conext.setCodePath(workFile.getPath());
        } catch (Exception e) {
            logger.error("git pull error", e);
        }
        return null;
    }
}
