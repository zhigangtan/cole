package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.AppRelease;
import cn.tanziquan.produce.cole.data.domain.AppReleaseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppReleaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int countByExample(AppReleaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int deleteByExample(AppReleaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int insert(AppRelease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int insertSelective(AppRelease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    List<AppRelease> selectByExample(AppReleaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    AppRelease selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppRelease record, @Param("example") AppReleaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppRelease record, @Param("example") AppReleaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppRelease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_release
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppRelease record);
}