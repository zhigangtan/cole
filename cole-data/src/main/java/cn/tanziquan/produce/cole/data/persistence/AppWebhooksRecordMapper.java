package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecord;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppWebhooksRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int countByExample(AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int deleteByExample(AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int insert(AppWebhooksRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int insertSelective(AppWebhooksRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    List<AppWebhooksRecord> selectByExampleWithBLOBs(AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    List<AppWebhooksRecord> selectByExample(AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    AppWebhooksRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppWebhooksRecord record, @Param("example") AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") AppWebhooksRecord record, @Param("example") AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppWebhooksRecord record, @Param("example") AppWebhooksRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppWebhooksRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AppWebhooksRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppWebhooksRecord record);
}