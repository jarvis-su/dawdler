package com.jarvis.mapper.entities;

import java.util.Date;

public class ResponseType extends BasicEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RESPONSE_TYPE.RESPONSE_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Integer responseTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RESPONSE_TYPE.DESCRIPTION
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RESPONSE_TYPE.COMPONENT
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private String component;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RESPONSE_TYPE.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Date insertDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RESPONSE_TYPE.RESPONSE_TYPE_ID
     *
     * @return the value of RESPONSE_TYPE.RESPONSE_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Integer getResponseTypeId() {
        return responseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RESPONSE_TYPE.RESPONSE_TYPE_ID
     *
     * @param responseTypeId the value for RESPONSE_TYPE.RESPONSE_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setResponseTypeId(Integer responseTypeId) {
        this.responseTypeId = responseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RESPONSE_TYPE.DESCRIPTION
     *
     * @return the value of RESPONSE_TYPE.DESCRIPTION
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RESPONSE_TYPE.DESCRIPTION
     *
     * @param description the value for RESPONSE_TYPE.DESCRIPTION
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RESPONSE_TYPE.COMPONENT
     *
     * @return the value of RESPONSE_TYPE.COMPONENT
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RESPONSE_TYPE.COMPONENT
     *
     * @param component the value for RESPONSE_TYPE.COMPONENT
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RESPONSE_TYPE.INSERT_DATE
     *
     * @return the value of RESPONSE_TYPE.INSERT_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RESPONSE_TYPE.INSERT_DATE
     *
     * @param insertDate the value for RESPONSE_TYPE.INSERT_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}