package com.jarvis.mapper.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTypesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public UserTypesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
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
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
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

        public Criteria andUserTypeIdIsNull() {
            addCriterion("USER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdIsNotNull() {
            addCriterion("USER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdEqualTo(Integer value) {
            addCriterion("USER_TYPE_ID =", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotEqualTo(Integer value) {
            addCriterion("USER_TYPE_ID <>", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdGreaterThan(Integer value) {
            addCriterion("USER_TYPE_ID >", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE_ID >=", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdLessThan(Integer value) {
            addCriterion("USER_TYPE_ID <", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE_ID <=", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdIn(List<Integer> values) {
            addCriterion("USER_TYPE_ID in", values, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotIn(List<Integer> values) {
            addCriterion("USER_TYPE_ID not in", values, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE_ID between", value1, value2, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE_ID not between", value1, value2, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeDescrIsNull() {
            addCriterion("TYPE_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescrIsNotNull() {
            addCriterion("TYPE_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescrEqualTo(String value) {
            addCriterion("TYPE_DESCR =", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrNotEqualTo(String value) {
            addCriterion("TYPE_DESCR <>", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrGreaterThan(String value) {
            addCriterion("TYPE_DESCR >", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_DESCR >=", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrLessThan(String value) {
            addCriterion("TYPE_DESCR <", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrLessThanOrEqualTo(String value) {
            addCriterion("TYPE_DESCR <=", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrLike(String value) {
            addCriterion("TYPE_DESCR like", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrNotLike(String value) {
            addCriterion("TYPE_DESCR not like", value, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrIn(List<String> values) {
            addCriterion("TYPE_DESCR in", values, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrNotIn(List<String> values) {
            addCriterion("TYPE_DESCR not in", values, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrBetween(String value1, String value2) {
            addCriterion("TYPE_DESCR between", value1, value2, "typeDescr");
            return (Criteria) this;
        }

        public Criteria andTypeDescrNotBetween(String value1, String value2) {
            addCriterion("TYPE_DESCR not between", value1, value2, "typeDescr");
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
     * This class corresponds to the database table user_types
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 06 12:04:11 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_types
     *
     * @mbg.generated Mon Feb 06 12:04:11 CST 2017
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