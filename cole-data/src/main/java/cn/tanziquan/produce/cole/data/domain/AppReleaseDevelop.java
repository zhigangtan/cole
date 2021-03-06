package cn.tanziquan.produce.cole.data.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class AppReleaseDevelop implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.release_id
     *
     * @mbggenerated
     */
    private Integer releaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.serial_no
     *
     * @mbggenerated
     */
    private String serialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.compiler_status
     *
     * @mbggenerated
     */
    private Short compilerStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.runtime_status
     *
     * @mbggenerated
     */
    private Short runtimeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.is_delete
     *
     * @mbggenerated
     */
    private Short isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.created_at
     *
     * @mbggenerated
     */
    private Timestamp createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_release_develop.updated_at
     *
     * @mbggenerated
     */
    private Timestamp updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.id
     *
     * @return the value of tb_app_release_develop.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.id
     *
     * @param id the value for tb_app_release_develop.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.release_id
     *
     * @return the value of tb_app_release_develop.release_id
     *
     * @mbggenerated
     */
    public Integer getReleaseId() {
        return releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.release_id
     *
     * @param releaseId the value for tb_app_release_develop.release_id
     *
     * @mbggenerated
     */
    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.serial_no
     *
     * @return the value of tb_app_release_develop.serial_no
     *
     * @mbggenerated
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.serial_no
     *
     * @param serialNo the value for tb_app_release_develop.serial_no
     *
     * @mbggenerated
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.compiler_status
     *
     * @return the value of tb_app_release_develop.compiler_status
     *
     * @mbggenerated
     */
    public Short getCompilerStatus() {
        return compilerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.compiler_status
     *
     * @param compilerStatus the value for tb_app_release_develop.compiler_status
     *
     * @mbggenerated
     */
    public void setCompilerStatus(Short compilerStatus) {
        this.compilerStatus = compilerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.runtime_status
     *
     * @return the value of tb_app_release_develop.runtime_status
     *
     * @mbggenerated
     */
    public Short getRuntimeStatus() {
        return runtimeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.runtime_status
     *
     * @param runtimeStatus the value for tb_app_release_develop.runtime_status
     *
     * @mbggenerated
     */
    public void setRuntimeStatus(Short runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.is_delete
     *
     * @return the value of tb_app_release_develop.is_delete
     *
     * @mbggenerated
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.is_delete
     *
     * @param isDelete the value for tb_app_release_develop.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.created_at
     *
     * @return the value of tb_app_release_develop.created_at
     *
     * @mbggenerated
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.created_at
     *
     * @param createdAt the value for tb_app_release_develop.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_release_develop.updated_at
     *
     * @return the value of tb_app_release_develop.updated_at
     *
     * @mbggenerated
     */
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_release_develop.updated_at
     *
     * @param updatedAt the value for tb_app_release_develop.updated_at
     *
     * @mbggenerated
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}