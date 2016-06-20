package cn.tanziquan.produce.cole.projectinfo.dto;

import cn.tanziquan.produce.cole.appinfo.dto.AppDto;
import cn.tanziquan.produce.cole.basic.dto.BasicDto;

import java.util.List;

/**
 * ProjectDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class ProjectDto extends BasicDto {

    private Integer id;

    private String name;

    private List<AppDto> appDtoList;


    public ProjectDto() {
        super();
    }

    public ProjectDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<AppDto> getAppDtoList() {
        return appDtoList;
    }

    public void setAppDtoList(List<AppDto> appDtoList) {
        this.appDtoList = appDtoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
