package cn.tanziquan.produce.cole.data.persistence;

import cn.tanziquan.produce.cole.data.domain.ProjectInfo;
import cn.tanziquan.produce.cole.data.domain.ProjectInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int countByExample(ProjectInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int deleteByExample(ProjectInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int insert(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int insertSelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    List<ProjectInfo> selectByExample(ProjectInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    ProjectInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_project_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProjectInfo record);
}