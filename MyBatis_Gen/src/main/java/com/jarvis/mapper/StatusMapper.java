package com.jarvis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jarvis.mapper.entities.Status;
import com.jarvis.mapper.entities.StatusExample;

public interface StatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    long countByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByPrimaryKey(Integer statusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insert(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insertSelective(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    List<Status> selectByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    Status selectByPrimaryKey(Integer statusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") Status record, @Param("example") StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKeySelective(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKey(Status record);
}