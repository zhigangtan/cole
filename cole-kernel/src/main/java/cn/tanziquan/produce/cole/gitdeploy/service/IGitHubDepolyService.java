package cn.tanziquan.produce.cole.gitdeploy.service;

import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;

/**
 * IGitHubDepolyService
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public interface IGitHubDepolyService {

    void gitDepoly(String appId, GitHubRequestBodyDto dto);
}
