package com.jarvis.mapper.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LAST_NAME =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LAST_NAME <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LAST_NAME >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LAST_NAME <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LAST_NAME like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LAST_NAME not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LAST_NAME in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LAST_NAME not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LAST_NAME between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(Date value) {
            addCriterion("EFFECTIVE_DATE >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(Date value) {
            addCriterion("EFFECTIVE_DATE <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPassword1IsNull() {
            addCriterion("PASSWORD1 is null");
            return (Criteria) this;
        }

        public Criteria andPassword1IsNotNull() {
            addCriterion("PASSWORD1 is not null");
            return (Criteria) this;
        }

        public Criteria andPassword1EqualTo(String value) {
            addCriterion("PASSWORD1 =", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotEqualTo(String value) {
            addCriterion("PASSWORD1 <>", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1GreaterThan(String value) {
            addCriterion("PASSWORD1 >", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1GreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD1 >=", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1LessThan(String value) {
            addCriterion("PASSWORD1 <", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1LessThanOrEqualTo(String value) {
            addCriterion("PASSWORD1 <=", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1Like(String value) {
            addCriterion("PASSWORD1 like", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotLike(String value) {
            addCriterion("PASSWORD1 not like", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1In(List<String> values) {
            addCriterion("PASSWORD1 in", values, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotIn(List<String> values) {
            addCriterion("PASSWORD1 not in", values, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1Between(String value1, String value2) {
            addCriterion("PASSWORD1 between", value1, value2, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotBetween(String value1, String value2) {
            addCriterion("PASSWORD1 not between", value1, value2, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword2IsNull() {
            addCriterion("PASSWORD2 is null");
            return (Criteria) this;
        }

        public Criteria andPassword2IsNotNull() {
            addCriterion("PASSWORD2 is not null");
            return (Criteria) this;
        }

        public Criteria andPassword2EqualTo(String value) {
            addCriterion("PASSWORD2 =", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotEqualTo(String value) {
            addCriterion("PASSWORD2 <>", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2GreaterThan(String value) {
            addCriterion("PASSWORD2 >", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2GreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD2 >=", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2LessThan(String value) {
            addCriterion("PASSWORD2 <", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2LessThanOrEqualTo(String value) {
            addCriterion("PASSWORD2 <=", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2Like(String value) {
            addCriterion("PASSWORD2 like", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotLike(String value) {
            addCriterion("PASSWORD2 not like", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2In(List<String> values) {
            addCriterion("PASSWORD2 in", values, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotIn(List<String> values) {
            addCriterion("PASSWORD2 not in", values, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2Between(String value1, String value2) {
            addCriterion("PASSWORD2 between", value1, value2, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotBetween(String value1, String value2) {
            addCriterion("PASSWORD2 not between", value1, value2, "password2");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntIsNull() {
            addCriterion("BAD_PWD_CNT is null");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntIsNotNull() {
            addCriterion("BAD_PWD_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntEqualTo(String value) {
            addCriterion("BAD_PWD_CNT =", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntNotEqualTo(String value) {
            addCriterion("BAD_PWD_CNT <>", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntGreaterThan(String value) {
            addCriterion("BAD_PWD_CNT >", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntGreaterThanOrEqualTo(String value) {
            addCriterion("BAD_PWD_CNT >=", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntLessThan(String value) {
            addCriterion("BAD_PWD_CNT <", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntLessThanOrEqualTo(String value) {
            addCriterion("BAD_PWD_CNT <=", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntLike(String value) {
            addCriterion("BAD_PWD_CNT like", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntNotLike(String value) {
            addCriterion("BAD_PWD_CNT not like", value, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntIn(List<String> values) {
            addCriterion("BAD_PWD_CNT in", values, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntNotIn(List<String> values) {
            addCriterion("BAD_PWD_CNT not in", values, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntBetween(String value1, String value2) {
            addCriterion("BAD_PWD_CNT between", value1, value2, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andBadPwdCntNotBetween(String value1, String value2) {
            addCriterion("BAD_PWD_CNT not between", value1, value2, "badPwdCnt");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdIsNull() {
            addCriterion("USER_STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdIsNotNull() {
            addCriterion("USER_STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdEqualTo(Integer value) {
            addCriterion("USER_STATUS_ID =", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdNotEqualTo(Integer value) {
            addCriterion("USER_STATUS_ID <>", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdGreaterThan(Integer value) {
            addCriterion("USER_STATUS_ID >", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS_ID >=", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdLessThan(Integer value) {
            addCriterion("USER_STATUS_ID <", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS_ID <=", value, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdIn(List<Integer> values) {
            addCriterion("USER_STATUS_ID in", values, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdNotIn(List<Integer> values) {
            addCriterion("USER_STATUS_ID not in", values, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS_ID between", value1, value2, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS_ID not between", value1, value2, "userStatusId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNull() {
            addCriterion("USER_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNotNull() {
            addCriterion("USER_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdEqualTo(Integer value) {
            addCriterion("USER_ROLE_ID =", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotEqualTo(Integer value) {
            addCriterion("USER_ROLE_ID <>", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThan(Integer value) {
            addCriterion("USER_ROLE_ID >", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ROLE_ID >=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThan(Integer value) {
            addCriterion("USER_ROLE_ID <", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ROLE_ID <=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIn(List<Integer> values) {
            addCriterion("USER_ROLE_ID in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotIn(List<Integer> values) {
            addCriterion("USER_ROLE_ID not in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ROLE_ID between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ROLE_ID not between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("INSERT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("INSERT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(Date value) {
            addCriterion("INSERT_DATE =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(Date value) {
            addCriterion("INSERT_DATE <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(Date value) {
            addCriterion("INSERT_DATE >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATE >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(Date value) {
            addCriterion("INSERT_DATE <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATE <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List<Date> values) {
            addCriterion("INSERT_DATE in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List<Date> values) {
            addCriterion("INSERT_DATE not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATE between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATE not between", value1, value2, "insertDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 06 13:32:10 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated Mon Feb 06 13:32:10 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}