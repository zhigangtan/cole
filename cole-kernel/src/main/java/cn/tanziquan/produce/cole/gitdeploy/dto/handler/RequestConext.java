package cn.tanziquan.produce.cole.gitdeploy.dto.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;

/**
 * RequestConext
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class RequestConext {


    private GitHubRequestBodyDto bodyDto;


    private String buildPath;



    public GitHubRequestBodyDto getBodyDto() {
        return bodyDto;
    }

    public void setBodyDto(GitHubRequestBodyDto bodyDto) {
        this.bodyDto = bodyDto;
    }

    public String getBuildPath() {
        return buildPath;
    }

    public void setBuildPath(String buildPath) {
        this.buildPath = buildPath;
    }
}
