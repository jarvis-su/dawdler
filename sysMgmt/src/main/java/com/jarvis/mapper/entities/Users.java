package com.jarvis.mapper.entities;

import java.util.Date;

public class Users extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.LOGIN_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.FIRST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.LAST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.EFFECTIVE_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASSWORD
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASSWORD1
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String password1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASSWORD2
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String password2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.BAD_PWD_CNT
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private String badPwdCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER_STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer userStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER_ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Integer userRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    private Date insertDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER_ID
     *
     * @return the value of users.USER_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER_ID
     *
     * @param userId the value for users.USER_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.LOGIN_NAME
     *
     * @return the value of users.LOGIN_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.LOGIN_NAME
     *
     * @param loginName the value for users.LOGIN_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.FIRST_NAME
     *
     * @return the value of users.FIRST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.FIRST_NAME
     *
     * @param firstName the value for users.FIRST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.LAST_NAME
     *
     * @return the value of users.LAST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.LAST_NAME
     *
     * @param lastName the value for users.LAST_NAME
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.EFFECTIVE_DATE
     *
     * @return the value of users.EFFECTIVE_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.EFFECTIVE_DATE
     *
     * @param effectiveDate the value for users.EFFECTIVE_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.PASSWORD
     *
     * @return the value of users.PASSWORD
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.PASSWORD
     *
     * @param password the value for users.PASSWORD
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.PASSWORD1
     *
     * @return the value of users.PASSWORD1
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getPassword1() {
        return password1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.PASSWORD1
     *
     * @param password1 the value for users.PASSWORD1
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setPassword1(String password1) {
        this.password1 = password1 == null ? null : password1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.PASSWORD2
     *
     * @return the value of users.PASSWORD2
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.PASSWORD2
     *
     * @param password2 the value for users.PASSWORD2
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setPassword2(String password2) {
        this.password2 = password2 == null ? null : password2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.BAD_PWD_CNT
     *
     * @return the value of users.BAD_PWD_CNT
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getBadPwdCnt() {
        return badPwdCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.BAD_PWD_CNT
     *
     * @param badPwdCnt the value for users.BAD_PWD_CNT
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setBadPwdCnt(String badPwdCnt) {
        this.badPwdCnt = badPwdCnt == null ? null : badPwdCnt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER_STATUS_ID
     *
     * @return the value of users.USER_STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getUserStatusId() {
        return userStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER_STATUS_ID
     *
     * @param userStatusId the value for users.USER_STATUS_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER_ROLE_ID
     *
     * @return the value of users.USER_ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER_ROLE_ID
     *
     * @param userRoleId the value for users.USER_ROLE_ID
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.INSERT_DATE
     *
     * @return the value of users.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.INSERT_DATE
     *
     * @param insertDate the value for users.INSERT_DATE
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}