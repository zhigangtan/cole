package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppReleaseDevelopServer;
import cn.tanziquan.produce.cole.data.domain.AppReleaseDevelopServerCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppReleaseDevelopServerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int countByExample(AppReleaseDevelopServerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int deleteByExample(AppReleaseDevelopServerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int insert(AppReleaseDevelopServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int insertSelective(AppReleaseDevelopServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    List<AppReleaseDevelopServer> selectByExample(AppReleaseDevelopServerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    AppReleaseDevelopServer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppReleaseDevelopServer record, @Param("example") AppReleaseDevelopServerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppReleaseDevelopServer record, @Param("example") AppReleaseDevelopServerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppReleaseDevelopServer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release_develop_server
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppReleaseDevelopServer record);
}