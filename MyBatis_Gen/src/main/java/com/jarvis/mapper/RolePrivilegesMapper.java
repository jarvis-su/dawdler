package com.jarvis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jarvis.mapper.entities.RolePrivileges;
import com.jarvis.mapper.entities.RolePrivilegesExample;
import com.jarvis.mapper.entities.RolePrivilegesKey;

public interface RolePrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    long countByExample(RolePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByExample(RolePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByPrimaryKey(RolePrivilegesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insert(RolePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insertSelective(RolePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    List<RolePrivileges> selectByExample(RolePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    RolePrivileges selectByPrimaryKey(RolePrivilegesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") RolePrivileges record, @Param("example") RolePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExample(@Param("record") RolePrivileges record, @Param("example") RolePrivilegesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKeySelective(RolePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_privileges
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKey(RolePrivileges record);
}