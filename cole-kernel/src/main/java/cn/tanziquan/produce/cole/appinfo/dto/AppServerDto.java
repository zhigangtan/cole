package cn.tanziquan.produce.cole.appinfo.dto;

import java.sql.Timestamp;

/**
 * AppServerDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class AppServerDto {

    private String serverName;


    private Short serverStatus;


    private String serverGroup;


    private String operateName;

    private Timestamp operateDate;


    public Timestamp getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Timestamp operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Short getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(Short serverStatus) {
        this.serverStatus = serverStatus;
    }

    public String getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(String serverGroup) {
        this.serverGroup = serverGroup;
    }
}
