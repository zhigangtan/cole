package cn.tanziquan.produce.cole.data.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class AppWebhooksRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.app_id
     *
     * @mbggenerated
     */
    private Integer appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.full_name
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.branch
     *
     * @mbggenerated
     */
    private String branch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.commit_date
     *
     * @mbggenerated
     */
    private Timestamp commitDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.commit_message
     *
     * @mbggenerated
     */
    private String commitMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.commit_author
     *
     * @mbggenerated
     */
    private String commitAuthor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.created_at
     *
     * @mbggenerated
     */
    private Timestamp createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.updated_at
     *
     * @mbggenerated
     */
    private Timestamp updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_app_webhooks_record.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.id
     *
     * @return the value of tb_app_webhooks_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.id
     *
     * @param id the value for tb_app_webhooks_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.app_id
     *
     * @return the value of tb_app_webhooks_record.app_id
     *
     * @mbggenerated
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.app_id
     *
     * @param appId the value for tb_app_webhooks_record.app_id
     *
     * @mbggenerated
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.full_name
     *
     * @return the value of tb_app_webhooks_record.full_name
     *
     * @mbggenerated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.full_name
     *
     * @param fullName the value for tb_app_webhooks_record.full_name
     *
     * @mbggenerated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.branch
     *
     * @return the value of tb_app_webhooks_record.branch
     *
     * @mbggenerated
     */
    public String getBranch() {
        return branch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.branch
     *
     * @param branch the value for tb_app_webhooks_record.branch
     *
     * @mbggenerated
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.commit_date
     *
     * @return the value of tb_app_webhooks_record.commit_date
     *
     * @mbggenerated
     */
    public Timestamp getCommitDate() {
        return commitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.commit_date
     *
     * @param commitDate the value for tb_app_webhooks_record.commit_date
     *
     * @mbggenerated
     */
    public void setCommitDate(Timestamp commitDate) {
        this.commitDate = commitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.commit_message
     *
     * @return the value of tb_app_webhooks_record.commit_message
     *
     * @mbggenerated
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.commit_message
     *
     * @param commitMessage the value for tb_app_webhooks_record.commit_message
     *
     * @mbggenerated
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage == null ? null : commitMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.commit_author
     *
     * @return the value of tb_app_webhooks_record.commit_author
     *
     * @mbggenerated
     */
    public String getCommitAuthor() {
        return commitAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.commit_author
     *
     * @param commitAuthor the value for tb_app_webhooks_record.commit_author
     *
     * @mbggenerated
     */
    public void setCommitAuthor(String commitAuthor) {
        this.commitAuthor = commitAuthor == null ? null : commitAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.created_at
     *
     * @return the value of tb_app_webhooks_record.created_at
     *
     * @mbggenerated
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.created_at
     *
     * @param createdAt the value for tb_app_webhooks_record.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.updated_at
     *
     * @return the value of tb_app_webhooks_record.updated_at
     *
     * @mbggenerated
     */
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.updated_at
     *
     * @param updatedAt the value for tb_app_webhooks_record.updated_at
     *
     * @mbggenerated
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_app_webhooks_record.content
     *
     * @return the value of tb_app_webhooks_record.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_app_webhooks_record.content
     *
     * @param content the value for tb_app_webhooks_record.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}