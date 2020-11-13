package com.sino.mapper;

import com.sino.pojo.OmsOrderOperateHistory;
import com.sino.pojo.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}