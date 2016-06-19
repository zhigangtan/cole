package cn.tanziquan.produce.cole.gitdeploy.service.impl;

import cn.tanziquan.produce.cole.data.domain.ColeRequestBody;
import cn.tanziquan.produce.cole.data.persistence.ColeRequestBodyMapper;
import cn.tanziquan.produce.cole.gitdeploy.service.IGitHubDepolyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GitHubDepolyServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class GitHubDepolyServiceImpl implements IGitHubDepolyService {


    @Autowired
    private ColeRequestBodyMapper coleRequestBodyMapper;

    @Override
    public void gitDepoly(String appId, String json) {
        ColeRequestBody record = new ColeRequestBody();
        record.setAppId(appId);
        record.setPostJson(json);
        coleRequestBodyMapper.insertSelective(record);

    }
}
