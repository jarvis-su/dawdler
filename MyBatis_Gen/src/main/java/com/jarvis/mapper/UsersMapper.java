package com.jarvis.mapper;

import com.jarvis.mapper.entities.Users;
import com.jarvis.mapper.entities.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    long countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    Users selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByPrimaryKey(Users record);
}