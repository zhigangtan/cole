package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppWebhooksLog;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppWebhooksLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int countByExample(AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int deleteByExample(AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int insert(AppWebhooksLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int insertSelective(AppWebhooksLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    List<AppWebhooksLog> selectByExampleWithBLOBs(AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    List<AppWebhooksLog> selectByExample(AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    AppWebhooksLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppWebhooksLog record, @Param("example") AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") AppWebhooksLog record, @Param("example") AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppWebhooksLog record, @Param("example") AppWebhooksLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppWebhooksLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AppWebhooksLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppWebhooksLog record);
}