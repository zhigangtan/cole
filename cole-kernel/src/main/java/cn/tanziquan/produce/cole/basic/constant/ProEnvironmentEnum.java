package cn.tanziquan.produce.cole.basic.constant;

/**
 * ProEnvironmentEnum
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public enum ProEnvironmentEnum {


    DEVELOP(1, "", 1), BETA(2, "", 2), PRE(3, "", 3), PRO(4, "", 4);


    ProEnvironmentEnum(Integer index, String content, Integer order) {
        this.index = index;
        this.content = content;
        this.order=order;
    }

    private Integer index;

    private String content;

    private Integer order;

    public Integer getIndex() {
        return index;
    }

    public Integer getOrder() {
        return order;
    }

    public String getContent() {
        return content;
    }
}
