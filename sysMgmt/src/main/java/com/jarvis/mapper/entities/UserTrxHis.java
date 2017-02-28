package com.jarvis.mapper.entities;

import java.util.Date;

public class UserTrxHis extends UserTrxHisKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TRX_HIS.TRX_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Integer trxTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TRX_HIS.RESPONSE_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Integer responseTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TRX_HIS.TRX_DATE
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Date trxDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TRX_HIS.USER_ID
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TRX_HIS.ENTRY_DATE
     *
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    private Date entryDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TRX_HIS.TRX_TYPE_ID
     *
     * @return the value of USER_TRX_HIS.TRX_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Integer getTrxTypeId() {
        return trxTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TRX_HIS.TRX_TYPE_ID
     *
     * @param trxTypeId the value for USER_TRX_HIS.TRX_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setTrxTypeId(Integer trxTypeId) {
        this.trxTypeId = trxTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TRX_HIS.RESPONSE_TYPE_ID
     *
     * @return the value of USER_TRX_HIS.RESPONSE_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Integer getResponseTypeId() {
        return responseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TRX_HIS.RESPONSE_TYPE_ID
     *
     * @param responseTypeId the value for USER_TRX_HIS.RESPONSE_TYPE_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setResponseTypeId(Integer responseTypeId) {
        this.responseTypeId = responseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TRX_HIS.TRX_DATE
     *
     * @return the value of USER_TRX_HIS.TRX_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Date getTrxDate() {
        return trxDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TRX_HIS.TRX_DATE
     *
     * @param trxDate the value for USER_TRX_HIS.TRX_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setTrxDate(Date trxDate) {
        this.trxDate = trxDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TRX_HIS.USER_ID
     *
     * @return the value of USER_TRX_HIS.USER_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TRX_HIS.USER_ID
     *
     * @param userId the value for USER_TRX_HIS.USER_ID
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TRX_HIS.ENTRY_DATE
     *
     * @return the value of USER_TRX_HIS.ENTRY_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TRX_HIS.ENTRY_DATE
     *
     * @param entryDate the value for USER_TRX_HIS.ENTRY_DATE
     * @mbg.generated Mon Feb 06 21:34:51 CST 2017
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}