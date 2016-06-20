package cn.tanziquan.produce.cole.data.domain;

import java.io.Serializable;
import java.util.Date;

public class AppInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.app_no
     *
     * @mbggenerated
     */
    private String appNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.app_name
     *
     * @mbggenerated
     */
    private String appName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.is_delete
     *
     * @mbggenerated
     */
    private Short isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.create_at
     *
     * @mbggenerated
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_info.update_at
     *
     * @mbggenerated
     */
    private Date updateAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.id
     *
     * @return the value of tb_app_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.id
     *
     * @param id the value for tb_app_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.app_no
     *
     * @return the value of tb_app_info.app_no
     *
     * @mbggenerated
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.app_no
     *
     * @param appNo the value for tb_app_info.app_no
     *
     * @mbggenerated
     */
    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.app_name
     *
     * @return the value of tb_app_info.app_name
     *
     * @mbggenerated
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.app_name
     *
     * @param appName the value for tb_app_info.app_name
     *
     * @mbggenerated
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.is_delete
     *
     * @return the value of tb_app_info.is_delete
     *
     * @mbggenerated
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.is_delete
     *
     * @param isDelete the value for tb_app_info.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.create_at
     *
     * @return the value of tb_app_info.create_at
     *
     * @mbggenerated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.create_at
     *
     * @param createAt the value for tb_app_info.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_info.update_at
     *
     * @return the value of tb_app_info.update_at
     *
     * @mbggenerated
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_info.update_at
     *
     * @param updateAt the value for tb_app_info.update_at
     *
     * @mbggenerated
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}