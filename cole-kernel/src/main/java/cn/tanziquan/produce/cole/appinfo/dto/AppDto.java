package cn.tanziquan.produce.cole.appinfo.dto;

/**
 * AppDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class AppDto {


    private Integer id;


    private String appNo;


    private String appName;


    public AppDto() {
        super();
    }

    public AppDto(String appName, String appNo, Integer id) {
        super();
        this.appName = appName;
        this.appNo = appNo;
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }
}
