package com.jarvis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jarvis.mapper.entities.UserTrxHis;
import com.jarvis.mapper.entities.UserTrxHisExample;
import com.jarvis.mapper.entities.UserTrxHisKey;

public interface UserTrxHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    long countByExample(UserTrxHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int deleteByExample(UserTrxHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int deleteByPrimaryKey(UserTrxHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int insert(UserTrxHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int insertSelective(UserTrxHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    List<UserTrxHis> selectByExample(UserTrxHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    UserTrxHis selectByPrimaryKey(UserTrxHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserTrxHis record, @Param("example") UserTrxHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int updateByExample(@Param("record") UserTrxHis record, @Param("example") UserTrxHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int updateByPrimaryKeySelective(UserTrxHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    int updateByPrimaryKey(UserTrxHis record);
}