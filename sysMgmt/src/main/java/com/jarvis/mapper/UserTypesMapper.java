package com.jarvis.mapper;

import com.jarvis.mapper.entities.UserTypes;
import com.jarvis.mapper.entities.UserTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    long countByExample(UserTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int deleteByExample(UserTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int deleteByPrimaryKey(Integer userTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int insert(UserTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int insertSelective(UserTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    List<UserTypes> selectByExample(UserTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    UserTypes selectByPrimaryKey(Integer userTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserTypes record, @Param("example") UserTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int updateByExample(@Param("record") UserTypes record, @Param("example") UserTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int updateByPrimaryKeySelective(UserTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    int updateByPrimaryKey(UserTypes record);
}