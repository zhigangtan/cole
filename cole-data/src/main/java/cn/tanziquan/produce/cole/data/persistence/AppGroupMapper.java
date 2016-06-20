package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppGroup;
import cn.tanziquan.produce.cole.data.domain.AppGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int countByExample(AppGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int deleteByExample(AppGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int insert(AppGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int insertSelective(AppGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    List<AppGroup> selectByExample(AppGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    AppGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppGroup record, @Param("example") AppGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppGroup record, @Param("example") AppGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppGroup record);
}