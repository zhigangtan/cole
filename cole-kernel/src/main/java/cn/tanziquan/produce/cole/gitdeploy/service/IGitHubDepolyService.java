package cn.tanziquan.produce.cole.gitdeploy.service;

/**
 * IGitHubDepolyService
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public interface IGitHubDepolyService {

    void gitDepoly(String appId, String json);
}
