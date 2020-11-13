package com.sino.mapper;

import com.sino.pojo.SmsCouponHistory;
import com.sino.pojo.SmsCouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    SmsCouponHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKey(SmsCouponHistory record);
}