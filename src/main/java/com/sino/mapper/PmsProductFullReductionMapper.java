package com.sino.mapper;

import com.sino.pojo.PmsProductFullReduction;
import com.sino.pojo.PmsProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<PmsProductFullReduction> selectByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    PmsProductFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKey(PmsProductFullReduction record);
}