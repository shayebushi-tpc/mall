package com.sino.mapper;

import com.sino.pojo.CmsMemberReport;
import com.sino.pojo.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(CmsMemberReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(CmsMemberReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}