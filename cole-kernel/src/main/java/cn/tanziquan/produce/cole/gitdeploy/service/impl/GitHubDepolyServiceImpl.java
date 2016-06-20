package cn.tanziquan.produce.cole.gitdeploy.service.impl;

import cn.tanziquan.produce.cole.data.domain.AppWebhooksLog;
import cn.tanziquan.produce.cole.data.persistence.AppInfoMapper;
import cn.tanziquan.produce.cole.data.persistence.AppWebhooksLogMapper;
import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.service.IGitHubDepolyService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * GitHubDepolyServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class GitHubDepolyServiceImpl implements IGitHubDepolyService {

    private static final Logger logger = LoggerFactory.getLogger(GitHubDepolyServiceImpl.class);


    @Autowired
    private AppInfoMapper appInfoMapper;

    @Autowired
    private AppWebhooksLogMapper appWebhooksLogMapper;


    @Override
    public void gitDepoly(String appId, String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            AppWebhooksLog record = new AppWebhooksLog();
            //record.setAppId(appId);
            record.setContent(json);
            GitHubRequestBodyDto bodyDto = objectMapper.readValue(json, GitHubRequestBodyDto.class);
            appWebhooksLogMapper.insertSelective(record);
        } catch (IOException e) {
            logger.error("gitDepoly error", e);
        }

    }
}
