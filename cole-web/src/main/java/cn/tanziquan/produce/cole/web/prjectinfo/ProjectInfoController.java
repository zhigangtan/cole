package cn.tanziquan.produce.cole.web.prjectinfo;

import cn.tanziquan.produce.cole.projectinfo.dto.ProjectDto;
import cn.tanziquan.produce.cole.projectinfo.service.IProjectService;
import cn.tanziquan.produce.cole.web.GitDeployController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ProjectInfoController
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "/cole-api/project")
public class ProjectInfoController {


    private static final Logger logger = LoggerFactory.getLogger(ProjectInfoController.class);


    @Autowired
    private IProjectService projectService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<List<ProjectDto>> getProjectAll() {
        List<ProjectDto> projectDtos = projectService.getProjectByUser();
        return ResponseEntity.ok(projectDtos);
    }
}
