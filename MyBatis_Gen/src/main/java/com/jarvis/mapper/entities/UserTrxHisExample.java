package com.jarvis.mapper.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTrxHisExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public UserTrxHisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
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
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
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

        public Criteria andTrxIdIsNull() {
            addCriterion("TRX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrxIdIsNotNull() {
            addCriterion("TRX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrxIdEqualTo(Integer value) {
            addCriterion("TRX_ID =", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotEqualTo(Integer value) {
            addCriterion("TRX_ID <>", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdGreaterThan(Integer value) {
            addCriterion("TRX_ID >", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRX_ID >=", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdLessThan(Integer value) {
            addCriterion("TRX_ID <", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRX_ID <=", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdIn(List<Integer> values) {
            addCriterion("TRX_ID in", values, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotIn(List<Integer> values) {
            addCriterion("TRX_ID not in", values, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdBetween(Integer value1, Integer value2) {
            addCriterion("TRX_ID between", value1, value2, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRX_ID not between", value1, value2, "trxId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(Integer value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Integer value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Integer value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Integer value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Integer> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Integer> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdIsNull() {
            addCriterion("TRX_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdIsNotNull() {
            addCriterion("TRX_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdEqualTo(Integer value) {
            addCriterion("TRX_TYPE_ID =", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdNotEqualTo(Integer value) {
            addCriterion("TRX_TYPE_ID <>", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdGreaterThan(Integer value) {
            addCriterion("TRX_TYPE_ID >", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRX_TYPE_ID >=", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdLessThan(Integer value) {
            addCriterion("TRX_TYPE_ID <", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRX_TYPE_ID <=", value, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdIn(List<Integer> values) {
            addCriterion("TRX_TYPE_ID in", values, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdNotIn(List<Integer> values) {
            addCriterion("TRX_TYPE_ID not in", values, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TRX_TYPE_ID between", value1, value2, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRX_TYPE_ID not between", value1, value2, "trxTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdIsNull() {
            addCriterion("RESPONSE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdIsNotNull() {
            addCriterion("RESPONSE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdEqualTo(Integer value) {
            addCriterion("RESPONSE_TYPE_ID =", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdNotEqualTo(Integer value) {
            addCriterion("RESPONSE_TYPE_ID <>", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdGreaterThan(Integer value) {
            addCriterion("RESPONSE_TYPE_ID >", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESPONSE_TYPE_ID >=", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdLessThan(Integer value) {
            addCriterion("RESPONSE_TYPE_ID <", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESPONSE_TYPE_ID <=", value, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdIn(List<Integer> values) {
            addCriterion("RESPONSE_TYPE_ID in", values, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdNotIn(List<Integer> values) {
            addCriterion("RESPONSE_TYPE_ID not in", values, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("RESPONSE_TYPE_ID between", value1, value2, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andResponseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESPONSE_TYPE_ID not between", value1, value2, "responseTypeId");
            return (Criteria) this;
        }

        public Criteria andTrxDateIsNull() {
            addCriterion("TRX_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTrxDateIsNotNull() {
            addCriterion("TRX_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTrxDateEqualTo(Date value) {
            addCriterion("TRX_DATE =", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateNotEqualTo(Date value) {
            addCriterion("TRX_DATE <>", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateGreaterThan(Date value) {
            addCriterion("TRX_DATE >", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRX_DATE >=", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateLessThan(Date value) {
            addCriterion("TRX_DATE <", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateLessThanOrEqualTo(Date value) {
            addCriterion("TRX_DATE <=", value, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateIn(List<Date> values) {
            addCriterion("TRX_DATE in", values, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateNotIn(List<Date> values) {
            addCriterion("TRX_DATE not in", values, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateBetween(Date value1, Date value2) {
            addCriterion("TRX_DATE between", value1, value2, "trxDate");
            return (Criteria) this;
        }

        public Criteria andTrxDateNotBetween(Date value1, Date value2) {
            addCriterion("TRX_DATE not between", value1, value2, "trxDate");
            return (Criteria) this;
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

        public Criteria andEntryDateIsNull() {
            addCriterion("ENTRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("ENTRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterion("ENTRY_DATE =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterion("ENTRY_DATE <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterion("ENTRY_DATE >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTRY_DATE >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterion("ENTRY_DATE <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterion("ENTRY_DATE <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterion("ENTRY_DATE in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterion("ENTRY_DATE not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterion("ENTRY_DATE between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterion("ENTRY_DATE not between", value1, value2, "entryDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 08 21:28:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_TRX_HIS
     *
     * @mbg.generated Wed Feb 08 21:28:42 CST 2017
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
    }
}