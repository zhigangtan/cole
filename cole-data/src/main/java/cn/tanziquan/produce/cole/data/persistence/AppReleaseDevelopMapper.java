package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppReleaseDevelop;
import cn.tanziquan.produce.cole.data.domain.AppReleaseDevelopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppReleaseDevelopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int countByExample(AppReleaseDevelopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int deleteByExample(AppReleaseDevelopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int insert(AppReleaseDevelop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int insertSelective(AppReleaseDevelop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    List<AppReleaseDevelop> selectByExample(AppReleaseDevelopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    AppReleaseDevelop selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppReleaseDevelop record, @Param("example") AppReleaseDevelopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppReleaseDevelop record, @Param("example") AppReleaseDevelopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppReleaseDevelop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppReleaseDevelop record);
}