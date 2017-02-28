package com.jarvis.mapper.entities;

import java.util.Date;

public class TransactionType extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_type.TRX_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private Integer trxTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_type.DESCRIPTION
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_type.COMPONENT
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private String component;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_type.INSERT_DATE
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private Date insertDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_type.TRX_TYPE_ID
     *
     * @return the value of transaction_type.TRX_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public Integer getTrxTypeId() {
        return trxTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_type.TRX_TYPE_ID
     *
     * @param trxTypeId the value for transaction_type.TRX_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setTrxTypeId(Integer trxTypeId) {
        this.trxTypeId = trxTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_type.DESCRIPTION
     *
     * @return the value of transaction_type.DESCRIPTION
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_type.DESCRIPTION
     *
     * @param description the value for transaction_type.DESCRIPTION
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_type.COMPONENT
     *
     * @return the value of transaction_type.COMPONENT
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_type.COMPONENT
     *
     * @param component the value for transaction_type.COMPONENT
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_type.INSERT_DATE
     *
     * @return the value of transaction_type.INSERT_DATE
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_type.INSERT_DATE
     *
     * @param insertDate the value for transaction_type.INSERT_DATE
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}