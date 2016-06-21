package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubepositoryDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import cn.tanziquan.produce.cole.gitdeploy.helper.CommandLineHelper;
import org.apache.commons.io.FileUtils;
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
            String buildPath = conext.getBuildPath();
            GitHubRequestBodyDto bodyDto = conext.getBodyDto();
            String branch = StringUtils.removeStartIgnoreCase(bodyDto.getRef(), "refs/heads/");
            GitHubepositoryDto repository = bodyDto.getRepository();
            File workFile = new File(buildPath + File.separator + repository.getName() + File.separator + bodyDto.getAfter());
            FileUtils.forceMkdirParent(workFile);
            FileUtils.forceMkdir(workFile);
            CommandLineHelper commandLineHelper = new CommandLineHelper();
            commandLineHelper.executeGitClone(workFile.getPath(), branch, repository.getHtml_url());
        } catch (Exception e) {
            logger.error("git pull error", e);
        }
        return null;
    }
}
