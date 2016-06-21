package cn.tanziquan.produce.cole.gitdeploy.service.impl;

import cn.tanziquan.produce.cole.appinfo.service.IAppInfoService;
import cn.tanziquan.produce.cole.basic.configure.properties.BuildProperties;
import cn.tanziquan.produce.cole.basic.util.DateUtil;
import cn.tanziquan.produce.cole.data.domain.AppInfo;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecord;
import cn.tanziquan.produce.cole.data.persistence.AppWebhooksRecordMapper;
import cn.tanziquan.produce.cole.gitdeploy.dto.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.handler.GitPullCommandHandler;
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
    private IAppInfoService appInfoService;

    @Autowired
    private AppWebhooksRecordMapper appWebhooksRecordMapper;

    @Autowired
    private BuildProperties buildProperties;


    @Override
    public void gitDepoly(String appNo, String json) {
        try {
            AppInfo appInfo = appInfoService.getAppInfoByAppNo(appNo);
            if (appInfo == null) {
                return;
            }
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            AppWebhooksRecord record = new AppWebhooksRecord();
            record.setAppId(appInfo.getId());
            record.setContent(json);
            record.setCreatedAt(DateUtil.getCurrentTimestamp());
            GitHubRequestBodyDto bodyDto = objectMapper.readValue(json, GitHubRequestBodyDto.class);
            RequestConext requestConext = new RequestConext();
            requestConext.setBodyDto(bodyDto);
            requestConext.setBuildPath(buildProperties.getPath());
            GitPullCommandHandler handler = new GitPullCommandHandler();
            handler.response(requestConext);
            appWebhooksRecordMapper.insertSelective(record);
        } catch (IOException e) {
            logger.error("gitDepoly error", e);
        }

    }
}
