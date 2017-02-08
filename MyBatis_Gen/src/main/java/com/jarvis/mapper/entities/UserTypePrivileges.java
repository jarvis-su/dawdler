package com.jarvis.mapper.entities;

import java.util.Date;

public class UserTypePrivileges extends UserTypePrivilegesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TYPE_PRIVILEGES.EFFECTIVE_DATE
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    private Date effectiveDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TYPE_PRIVILEGES.END_DATE
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TYPE_PRIVILEGES.INSERT_DATE
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    private Date insertDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_TYPE_PRIVILEGES.MOD_DATE
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    private Date modDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TYPE_PRIVILEGES.EFFECTIVE_DATE
     *
     * @return the value of USER_TYPE_PRIVILEGES.EFFECTIVE_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TYPE_PRIVILEGES.EFFECTIVE_DATE
     *
     * @param effectiveDate the value for USER_TYPE_PRIVILEGES.EFFECTIVE_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TYPE_PRIVILEGES.END_DATE
     *
     * @return the value of USER_TYPE_PRIVILEGES.END_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TYPE_PRIVILEGES.END_DATE
     *
     * @param endDate the value for USER_TYPE_PRIVILEGES.END_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TYPE_PRIVILEGES.INSERT_DATE
     *
     * @return the value of USER_TYPE_PRIVILEGES.INSERT_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TYPE_PRIVILEGES.INSERT_DATE
     *
     * @param insertDate the value for USER_TYPE_PRIVILEGES.INSERT_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_TYPE_PRIVILEGES.MOD_DATE
     *
     * @return the value of USER_TYPE_PRIVILEGES.MOD_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public Date getModDate() {
        return modDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_TYPE_PRIVILEGES.MOD_DATE
     *
     * @param modDate the value for USER_TYPE_PRIVILEGES.MOD_DATE
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }
}