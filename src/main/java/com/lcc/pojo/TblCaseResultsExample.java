package com.lcc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblCaseResultsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCaseResultsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNull() {
            addCriterion("isSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNotNull() {
            addCriterion("isSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccessEqualTo(String value) {
            addCriterion("isSuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(String value) {
            addCriterion("isSuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(String value) {
            addCriterion("isSuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(String value) {
            addCriterion("isSuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(String value) {
            addCriterion("isSuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(String value) {
            addCriterion("isSuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLike(String value) {
            addCriterion("isSuccess like", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotLike(String value) {
            addCriterion("isSuccess not like", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<String> values) {
            addCriterion("isSuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<String> values) {
            addCriterion("isSuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(String value1, String value2) {
            addCriterion("isSuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(String value1, String value2) {
            addCriterion("isSuccess not between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andActualresultsIsNull() {
            addCriterion("ActualResults is null");
            return (Criteria) this;
        }

        public Criteria andActualresultsIsNotNull() {
            addCriterion("ActualResults is not null");
            return (Criteria) this;
        }

        public Criteria andActualresultsEqualTo(String value) {
            addCriterion("ActualResults =", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsNotEqualTo(String value) {
            addCriterion("ActualResults <>", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsGreaterThan(String value) {
            addCriterion("ActualResults >", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsGreaterThanOrEqualTo(String value) {
            addCriterion("ActualResults >=", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsLessThan(String value) {
            addCriterion("ActualResults <", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsLessThanOrEqualTo(String value) {
            addCriterion("ActualResults <=", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsLike(String value) {
            addCriterion("ActualResults like", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsNotLike(String value) {
            addCriterion("ActualResults not like", value, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsIn(List<String> values) {
            addCriterion("ActualResults in", values, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsNotIn(List<String> values) {
            addCriterion("ActualResults not in", values, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsBetween(String value1, String value2) {
            addCriterion("ActualResults between", value1, value2, "actualresults");
            return (Criteria) this;
        }

        public Criteria andActualresultsNotBetween(String value1, String value2) {
            addCriterion("ActualResults not between", value1, value2, "actualresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsIsNull() {
            addCriterion("ExpectedResults is null");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsIsNotNull() {
            addCriterion("ExpectedResults is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsEqualTo(String value) {
            addCriterion("ExpectedResults =", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsNotEqualTo(String value) {
            addCriterion("ExpectedResults <>", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsGreaterThan(String value) {
            addCriterion("ExpectedResults >", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsGreaterThanOrEqualTo(String value) {
            addCriterion("ExpectedResults >=", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsLessThan(String value) {
            addCriterion("ExpectedResults <", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsLessThanOrEqualTo(String value) {
            addCriterion("ExpectedResults <=", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsLike(String value) {
            addCriterion("ExpectedResults like", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsNotLike(String value) {
            addCriterion("ExpectedResults not like", value, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsIn(List<String> values) {
            addCriterion("ExpectedResults in", values, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsNotIn(List<String> values) {
            addCriterion("ExpectedResults not in", values, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsBetween(String value1, String value2) {
            addCriterion("ExpectedResults between", value1, value2, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andExpectedresultsNotBetween(String value1, String value2) {
            addCriterion("ExpectedResults not between", value1, value2, "expectedresults");
            return (Criteria) this;
        }

        public Criteria andIsadoptIsNull() {
            addCriterion("isAdopt is null");
            return (Criteria) this;
        }

        public Criteria andIsadoptIsNotNull() {
            addCriterion("isAdopt is not null");
            return (Criteria) this;
        }

        public Criteria andIsadoptEqualTo(String value) {
            addCriterion("isAdopt =", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptNotEqualTo(String value) {
            addCriterion("isAdopt <>", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptGreaterThan(String value) {
            addCriterion("isAdopt >", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptGreaterThanOrEqualTo(String value) {
            addCriterion("isAdopt >=", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptLessThan(String value) {
            addCriterion("isAdopt <", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptLessThanOrEqualTo(String value) {
            addCriterion("isAdopt <=", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptLike(String value) {
            addCriterion("isAdopt like", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptNotLike(String value) {
            addCriterion("isAdopt not like", value, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptIn(List<String> values) {
            addCriterion("isAdopt in", values, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptNotIn(List<String> values) {
            addCriterion("isAdopt not in", values, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptBetween(String value1, String value2) {
            addCriterion("isAdopt between", value1, value2, "isadopt");
            return (Criteria) this;
        }

        public Criteria andIsadoptNotBetween(String value1, String value2) {
            addCriterion("isAdopt not between", value1, value2, "isadopt");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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