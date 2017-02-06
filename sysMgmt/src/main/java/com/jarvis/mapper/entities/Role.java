package com.jarvis.mapper.entities;

import java.util.Date;

public class Role extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String roleDescr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer userTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Date insertDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.MOD_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Date modDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_ID
     *
     * @return the value of role.ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_ID
     *
     * @param roleId the value for role.ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_NAME
     *
     * @return the value of role.ROLE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_NAME
     *
     * @param roleName the value for role.ROLE_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_DESCR
     *
     * @return the value of role.ROLE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getRoleDescr() {
        return roleDescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_DESCR
     *
     * @param roleDescr the value for role.ROLE_DESCR
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setRoleDescr(String roleDescr) {
        this.roleDescr = roleDescr == null ? null : roleDescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.USER_TYPE_ID
     *
     * @return the value of role.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.USER_TYPE_ID
     *
     * @param userTypeId the value for role.USER_TYPE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.STATUS_ID
     *
     * @return the value of role.STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.STATUS_ID
     *
     * @param statusId the value for role.STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.INSERT_DATE
     *
     * @return the value of role.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.INSERT_DATE
     *
     * @param insertDate the value for role.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.MOD_DATE
     *
     * @return the value of role.MOD_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Date getModDate() {
        return modDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.MOD_DATE
     *
     * @param modDate the value for role.MOD_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }
}