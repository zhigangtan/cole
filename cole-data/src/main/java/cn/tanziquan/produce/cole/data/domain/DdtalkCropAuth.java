package cn.tanziquan.produce.cole.data.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class DdtalkCropAuth implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.corpId
     *
     * @mbggenerated
     */
    private String corpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.permanent_code
     *
     * @mbggenerated
     */
    private String permanentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.is_delete
     *
     * @mbggenerated
     */
    private Short isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.created_at
     *
     * @mbggenerated
     */
    private Timestamp createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ddtalk_corp_auth.updated_at
     *
     * @mbggenerated
     */
    private Timestamp updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_ddtalk_corp_auth
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.id
     *
     * @return the value of tb_ddtalk_corp_auth.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.id
     *
     * @param id the value for tb_ddtalk_corp_auth.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.corpId
     *
     * @return the value of tb_ddtalk_corp_auth.corpId
     *
     * @mbggenerated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.corpId
     *
     * @param corpid the value for tb_ddtalk_corp_auth.corpId
     *
     * @mbggenerated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.permanent_code
     *
     * @return the value of tb_ddtalk_corp_auth.permanent_code
     *
     * @mbggenerated
     */
    public String getPermanentCode() {
        return permanentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.permanent_code
     *
     * @param permanentCode the value for tb_ddtalk_corp_auth.permanent_code
     *
     * @mbggenerated
     */
    public void setPermanentCode(String permanentCode) {
        this.permanentCode = permanentCode == null ? null : permanentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.is_delete
     *
     * @return the value of tb_ddtalk_corp_auth.is_delete
     *
     * @mbggenerated
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.is_delete
     *
     * @param isDelete the value for tb_ddtalk_corp_auth.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.created_at
     *
     * @return the value of tb_ddtalk_corp_auth.created_at
     *
     * @mbggenerated
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.created_at
     *
     * @param createdAt the value for tb_ddtalk_corp_auth.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ddtalk_corp_auth.updated_at
     *
     * @return the value of tb_ddtalk_corp_auth.updated_at
     *
     * @mbggenerated
     */
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ddtalk_corp_auth.updated_at
     *
     * @param updatedAt the value for tb_ddtalk_corp_auth.updated_at
     *
     * @mbggenerated
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}