package cn.tanziquan.produce.cole.appinfo.dto;

import cn.tanziquan.produce.cole.basic.constant.ProEnvironmentEnum;

/**
 * ProEnvironmentDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class ProEnvironmentDto {

    private Integer index;


    private String name;

    private String content;

    private Integer order;

    public ProEnvironmentDto() {
        super();
    }

    public ProEnvironmentDto(ProEnvironmentEnum proEnvironmentEnum) {
        super();
        this.index = proEnvironmentEnum.getIndex();
        this.name = proEnvironmentEnum.name();
        this.content = proEnvironmentEnum.getContent();
        this.order = proEnvironmentEnum.getOrder();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
