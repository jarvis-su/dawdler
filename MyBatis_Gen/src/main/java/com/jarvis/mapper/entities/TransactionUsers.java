package com.jarvis.mapper.entities;

public class TransactionUsers extends TransactionUsersKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_users.USER_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_users.USER_ID
     *
     * @return the value of transaction_users.USER_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_users.USER_ID
     *
     * @param userId the value for transaction_users.USER_ID
     *
     * @mbg.generated Wed Feb 08 22:28:51 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}