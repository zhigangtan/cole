package cn.tanziquan.produce.cole.gitdeploy.service.impl;

import cn.tanziquan.produce.cole.appinfo.service.IAppInfoService;
import cn.tanziquan.produce.cole.appinfo.service.IAppReleaseService;
import cn.tanziquan.produce.cole.basic.configure.properties.BuildProperties;
import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.basic.constant.ProEnvironmentEnum;
import cn.tanziquan.produce.cole.basic.util.DateUtil;
import cn.tanziquan.produce.cole.data.domain.AppInfo;
import cn.tanziquan.produce.cole.data.domain.AppRelease;
import cn.tanziquan.produce.cole.data.domain.AppReleaseDevelop;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecord;
import cn.tanziquan.produce.cole.data.persistence.AppReleaseDevelopMapper;
import cn.tanziquan.produce.cole.data.persistence.AppReleaseMapper;
import cn.tanziquan.produce.cole.data.persistence.AppWebhooksRecordMapper;
import cn.tanziquan.produce.cole.gitdeploy.dto.github.GitHubHeadCommitDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.github.GitHubRequestBodyDto;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import cn.tanziquan.produce.cole.gitdeploy.handler.AppPackageHandler;
import cn.tanziquan.produce.cole.gitdeploy.handler.GitPullCommandHandler;
import cn.tanziquan.produce.cole.gitdeploy.handler.UploadFileHandler;
import cn.tanziquan.produce.cole.gitdeploy.service.IGitHubDepolyService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

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
    private IAppReleaseService appReleaseService;

    @Autowired
    private AppReleaseDevelopMapper appReleaseDevelopMapper;

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
            GitHubRequestBodyDto bodyDto = objectMapper.readValue(json, GitHubRequestBodyDto.class);
            GitHubHeadCommitDto hubHeadCommitDto = bodyDto.getHead_commit();

            String branch = StringUtils.removeStartIgnoreCase(bodyDto.getRef(), "refs/heads/");
            AppWebhooksRecord record = new AppWebhooksRecord();
            record.setAppId(appInfo.getId());
            record.setContent(json);
            record.setCreatedAt(DateUtil.getCurrentTimestamp());
            record.setCommitAuthor(hubHeadCommitDto.getCommitter().getName());
            record.setCommitDate(hubHeadCommitDto.getTimestamp());
            record.setCommitMessage(hubHeadCommitDto.getMessage());
            record.setFullName(bodyDto.getRepository().getFull_name());
            record.setBranch(branch);

            appWebhooksRecordMapper.insertSelective(record);
            AppRelease appRelease = new AppRelease();
            appRelease.setAppId(appInfo.getId());
            appRelease.setRecordId(record.getId());
            appRelease.setBranch(branch);
            appRelease.setStage(ProEnvironmentEnum.DEVELOP.getIndex().shortValue());
            appRelease.setSerialNo(UUID.randomUUID().toString());
            appReleaseService.insertOrUpdateAppRelease(appRelease);

            AppReleaseDevelop develop = new AppReleaseDevelop();
            develop.setReleaseId(appRelease.getId());
            develop.setRuntimeStatus(Constant.NO_S);
            develop.setCompilerStatus(Constant.COMPILEDING);
            develop.setCreatedAt(DateUtil.getCurrentTimestamp());
            develop.setSerialNo(appRelease.getSerialNo());
            appReleaseDevelopMapper.insertSelective(develop);

            RequestConext requestConext = new RequestConext();
            requestConext.setAppNo(appNo);
            requestConext.setBodyDto(bodyDto);
            requestConext.setBuildPath(buildProperties.getPath());
            GitPullCommandHandler gitPullhandler = new GitPullCommandHandler();
            AppPackageHandler packageHandler = new AppPackageHandler();

            UploadFileHandler uploadFileHandler = new UploadFileHandler();
            packageHandler.setNextHandler(uploadFileHandler);
            gitPullhandler.setNextHandler(packageHandler);
            ResponseDto handlerResponse = gitPullhandler.handleRequest(requestConext);

            develop.setCompilerStatus(Constant.COMPILEDFAIL);
            if (handlerResponse.isSuccess()) {
                develop.setCompilerStatus(Constant.COMPILEDSUESS);
            }
            appReleaseDevelopMapper.updateByPrimaryKeySelective(develop);
        } catch (Exception e) {

            logger.error("gitDepoly error", e);
        }

    }
}
