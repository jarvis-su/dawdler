package com.jarvis.mapper.entities;

import java.util.Date;

public class UserTypes extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_types.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer userTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_types.TYPE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_types.TYPE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String typeDescr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_types.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Date insertDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_types.USER_TYPE_ID
     *
     * @return the value of user_types.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_types.USER_TYPE_ID
     *
     * @param userTypeId the value for user_types.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_types.TYPE_NAME
     *
     * @return the value of user_types.TYPE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_types.TYPE_NAME
     *
     * @param typeName the value for user_types.TYPE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_types.TYPE_DESCR
     *
     * @return the value of user_types.TYPE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getTypeDescr() {
        return typeDescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_types.TYPE_DESCR
     *
     * @param typeDescr the value for user_types.TYPE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setTypeDescr(String typeDescr) {
        this.typeDescr = typeDescr == null ? null : typeDescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_types.INSERT_DATE
     *
     * @return the value of user_types.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_types.INSERT_DATE
     *
     * @param insertDate the value for user_types.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}