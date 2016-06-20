package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppGroupRelation;
import cn.tanziquan.produce.cole.data.domain.AppGroupRelationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppGroupRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int countByExample(AppGroupRelationCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int deleteByExample(AppGroupRelationCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int insert(AppGroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int insertSelective(AppGroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    List<AppGroupRelation> selectByExample(AppGroupRelationCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    AppGroupRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppGroupRelation record, @Param("example") AppGroupRelationCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppGroupRelation record, @Param("example") AppGroupRelationCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppGroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_group_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppGroupRelation record);
}