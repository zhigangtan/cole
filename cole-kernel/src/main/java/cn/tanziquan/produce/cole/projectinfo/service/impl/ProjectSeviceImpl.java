package cn.tanziquan.produce.cole.projectinfo.service.impl;

import cn.tanziquan.produce.cole.appinfo.dto.AppDto;
import cn.tanziquan.produce.cole.appinfo.service.IAppInfoService;
import cn.tanziquan.produce.cole.data.domain.AppInfo;
import cn.tanziquan.produce.cole.data.domain.ProjectInfo;
import cn.tanziquan.produce.cole.data.domain.ProjectInfoCriteria;
import cn.tanziquan.produce.cole.data.persistence.ProjectInfoMapper;
import cn.tanziquan.produce.cole.projectinfo.dto.ProjectDto;
import cn.tanziquan.produce.cole.projectinfo.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProjectSeviceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class ProjectSeviceImpl implements IProjectService {

    @Autowired
    private IAppInfoService appInfoService;

    @Autowired
    private ProjectInfoMapper projectInfoMapper;


    @Override
    public List<ProjectDto> getProjectByUser() {
        List<ProjectDto> projectDtos = new ArrayList<>();
        Map<Integer, List<AppDto>> tempAppDtoMap = new HashMap<>();
        List<Integer> tempProjectIds = new ArrayList<>();
        List<AppInfo> appInfos = appInfoService.getAllAppInfo();
        for (AppInfo appInfo : appInfos) {
            AppDto appDto = new AppDto(appInfo.getAppName(), appInfo.getAppNo(), appInfo.getId());
            Integer projectId = appInfo.getProjectId();
            List<AppDto> appDtoList = tempAppDtoMap.get(projectId);
            if (appDtoList == null) {
                appDtoList = new ArrayList<>();
            }
            appDtoList.add(appDto);
            tempAppDtoMap.put(projectId, appDtoList);
            if (!tempProjectIds.contains(projectId)) {
                tempProjectIds.add(projectId);
            }
        }
        if(tempProjectIds.size()>0) {
            ProjectInfoCriteria criteria = new ProjectInfoCriteria();
            criteria.createCriteria().andIdIn(tempProjectIds);
            List<ProjectInfo> projectInfos = projectInfoMapper.selectByExample(criteria);

            for (ProjectInfo projectInfo : projectInfos) {
                ProjectDto projectDto = new ProjectDto(projectInfo.getId(), projectInfo.getName());
                projectDto.setAppDtoList(tempAppDtoMap.get(projectInfo.getId()));
                projectDtos.add(projectDto);
            }
        }
        return projectDtos;
    }
}
