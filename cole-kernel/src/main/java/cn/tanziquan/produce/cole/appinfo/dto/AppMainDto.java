package cn.tanziquan.produce.cole.appinfo.dto;

import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.basic.constant.ProEnvironmentEnum;

import java.sql.Timestamp;
import java.util.List;

/**
 * AppMainDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class AppMainDto {

    private String appNo;


    private List<ProEnvironmentDto> proEnvironmentDtos;


    private Integer curEnvironment= ProEnvironmentEnum.DEVELOP.getIndex();

    private String fullName;


    private String branch;


    private Timestamp commitDate;


    private String commitMessage;


    private String commitAuthor;


    private Short compilerStatus= Constant.UNCOMPILED;


    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public List<ProEnvironmentDto> getProEnvironmentDtos() {
        return proEnvironmentDtos;
    }

    public void setProEnvironmentDtos(List<ProEnvironmentDto> proEnvironmentDtos) {
        this.proEnvironmentDtos = proEnvironmentDtos;
    }

    public Integer getCurEnvironment() {
        return curEnvironment;
    }

    public void setCurEnvironment(Integer curEnvironment) {
        this.curEnvironment = curEnvironment;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCommitAuthor() {
        return commitAuthor;
    }

    public void setCommitAuthor(String commitAuthor) {
        this.commitAuthor = commitAuthor;
    }

    public Timestamp getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Timestamp commitDate) {
        this.commitDate = commitDate;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Short getCompilerStatus() {
        return compilerStatus;
    }

    public void setCompilerStatus(Short compilerStatus) {
        this.compilerStatus = compilerStatus;
    }
}
