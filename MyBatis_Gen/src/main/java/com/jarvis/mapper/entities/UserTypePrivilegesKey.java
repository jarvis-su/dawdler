package com.jarvis.mapper.entities;

public class UserTypePrivilegesKey extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type_privileges.USER_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private Integer userTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type_privileges.PRILIVEGE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private Integer prilivegeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type_privileges.USER_TYPE_ID
     *
     * @return the value of user_type_privileges.USER_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type_privileges.USER_TYPE_ID
     *
     * @param userTypeId the value for user_type_privileges.USER_TYPE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type_privileges.PRILIVEGE_ID
     *
     * @return the value of user_type_privileges.PRILIVEGE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public Integer getPrilivegeId() {
        return prilivegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type_privileges.PRILIVEGE_ID
     *
     * @param prilivegeId the value for user_type_privileges.PRILIVEGE_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setPrilivegeId(Integer prilivegeId) {
        this.prilivegeId = prilivegeId;
    }
}