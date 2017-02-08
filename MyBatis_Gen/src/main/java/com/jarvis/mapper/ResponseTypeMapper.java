package com.jarvis.mapper;

import com.jarvis.mapper.entities.ResponseType;
import com.jarvis.mapper.entities.ResponseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResponseTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    long countByExample(ResponseTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByExample(ResponseTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int deleteByPrimaryKey(Integer responseTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insert(ResponseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int insertSelective(ResponseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    List<ResponseType> selectByExample(ResponseTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    ResponseType selectByPrimaryKey(Integer responseTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") ResponseType record, @Param("example") ResponseTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByExample(@Param("record") ResponseType record, @Param("example") ResponseTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKeySelective(ResponseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table response_type
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    int updateByPrimaryKey(ResponseType record);
}