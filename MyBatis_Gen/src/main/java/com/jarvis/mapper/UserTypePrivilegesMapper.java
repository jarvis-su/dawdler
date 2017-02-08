package com.jarvis.mapper;

import com.jarvis.mapper.entities.UserTypePrivileges;
import com.jarvis.mapper.entities.UserTypePrivilegesExample;
import com.jarvis.mapper.entities.UserTypePrivilegesKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTypePrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    long countByExample(UserTypePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int deleteByExample(UserTypePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int deleteByPrimaryKey(UserTypePrivilegesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int insert(UserTypePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int insertSelective(UserTypePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    List<UserTypePrivileges> selectByExample(UserTypePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    UserTypePrivileges selectByPrimaryKey(UserTypePrivilegesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserTypePrivileges record, @Param("example") UserTypePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByExample(@Param("record") UserTypePrivileges record, @Param("example") UserTypePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByPrimaryKeySelective(UserTypePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TYPE_PRIVILEGES
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    int updateByPrimaryKey(UserTypePrivileges record);
}