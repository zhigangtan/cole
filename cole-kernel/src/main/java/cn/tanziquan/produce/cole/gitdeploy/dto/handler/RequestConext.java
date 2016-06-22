package cn.tanziquan.produce.cole.gitdeploy.dto.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.github.GitHubRequestBodyDto;

/**
 * RequestConext
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class RequestConext {


    private String appNo;

    private GitHubRequestBodyDto bodyDto;


    private String buildPath;

    private String codePath;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

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

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
    }
}
