package cn.tanziquan.produce.cole.projectinfo.service;

import cn.tanziquan.produce.cole.projectinfo.dto.ProjectDto;

import java.util.List;

/**
 * IProjectService
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public interface IProjectService {


    List<ProjectDto> getProjectByUser();
}
