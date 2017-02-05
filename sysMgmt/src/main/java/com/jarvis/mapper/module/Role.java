package com.jarvis.mapper.module;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.ROLE_ID
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.ROLE_NAME
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.ROLE_DESCR
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private String roleDescr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.USER_TYPE_ID
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private Integer userTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.STATUS_ID
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private Integer statusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.INSERT_DATE
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private Date insertDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.MOD_DATE
     *
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    private Date modDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.ROLE_ID
     *
     * @return the value of ROLE.ROLE_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.ROLE_ID
     *
     * @param roleId the value for ROLE.ROLE_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.ROLE_NAME
     *
     * @return the value of ROLE.ROLE_NAME
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.ROLE_NAME
     *
     * @param roleName the value for ROLE.ROLE_NAME
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.ROLE_DESCR
     *
     * @return the value of ROLE.ROLE_DESCR
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public String getRoleDescr() {
        return roleDescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.ROLE_DESCR
     *
     * @param roleDescr the value for ROLE.ROLE_DESCR
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setRoleDescr(String roleDescr) {
        this.roleDescr = roleDescr == null ? null : roleDescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.USER_TYPE_ID
     *
     * @return the value of ROLE.USER_TYPE_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.USER_TYPE_ID
     *
     * @param userTypeId the value for ROLE.USER_TYPE_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.STATUS_ID
     *
     * @return the value of ROLE.STATUS_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.STATUS_ID
     *
     * @param statusId the value for ROLE.STATUS_ID
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.INSERT_DATE
     *
     * @return the value of ROLE.INSERT_DATE
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.INSERT_DATE
     *
     * @param insertDate the value for ROLE.INSERT_DATE
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.MOD_DATE
     *
     * @return the value of ROLE.MOD_DATE
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public Date getModDate() {
        return modDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.MOD_DATE
     *
     * @param modDate the value for ROLE.MOD_DATE
     * @mbg.generated Sun Feb 05 16:16:59 CST 2017
     */
    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }
}