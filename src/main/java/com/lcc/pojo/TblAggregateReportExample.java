package com.lcc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblAggregateReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAggregateReportExample() {
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

        public Criteria andBatchnumIsNull() {
            addCriterion("batchnum is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumIsNotNull() {
            addCriterion("batchnum is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumEqualTo(Integer value) {
            addCriterion("batchnum =", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotEqualTo(Integer value) {
            addCriterion("batchnum <>", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumGreaterThan(Integer value) {
            addCriterion("batchnum >", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("batchnum >=", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumLessThan(Integer value) {
            addCriterion("batchnum <", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumLessThanOrEqualTo(Integer value) {
            addCriterion("batchnum <=", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumIn(List<Integer> values) {
            addCriterion("batchnum in", values, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotIn(List<Integer> values) {
            addCriterion("batchnum not in", values, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumBetween(Integer value1, Integer value2) {
            addCriterion("batchnum between", value1, value2, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotBetween(Integer value1, Integer value2) {
            addCriterion("batchnum not between", value1, value2, "batchnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumIsNull() {
            addCriterion("successnum is null");
            return (Criteria) this;
        }

        public Criteria andSuccessnumIsNotNull() {
            addCriterion("successnum is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessnumEqualTo(Integer value) {
            addCriterion("successnum =", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumNotEqualTo(Integer value) {
            addCriterion("successnum <>", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumGreaterThan(Integer value) {
            addCriterion("successnum >", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("successnum >=", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumLessThan(Integer value) {
            addCriterion("successnum <", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumLessThanOrEqualTo(Integer value) {
            addCriterion("successnum <=", value, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumIn(List<Integer> values) {
            addCriterion("successnum in", values, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumNotIn(List<Integer> values) {
            addCriterion("successnum not in", values, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumBetween(Integer value1, Integer value2) {
            addCriterion("successnum between", value1, value2, "successnum");
            return (Criteria) this;
        }

        public Criteria andSuccessnumNotBetween(Integer value1, Integer value2) {
            addCriterion("successnum not between", value1, value2, "successnum");
            return (Criteria) this;
        }

        public Criteria andFailurenumIsNull() {
            addCriterion("failurenum is null");
            return (Criteria) this;
        }

        public Criteria andFailurenumIsNotNull() {
            addCriterion("failurenum is not null");
            return (Criteria) this;
        }

        public Criteria andFailurenumEqualTo(Integer value) {
            addCriterion("failurenum =", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumNotEqualTo(Integer value) {
            addCriterion("failurenum <>", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumGreaterThan(Integer value) {
            addCriterion("failurenum >", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("failurenum >=", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumLessThan(Integer value) {
            addCriterion("failurenum <", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumLessThanOrEqualTo(Integer value) {
            addCriterion("failurenum <=", value, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumIn(List<Integer> values) {
            addCriterion("failurenum in", values, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumNotIn(List<Integer> values) {
            addCriterion("failurenum not in", values, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumBetween(Integer value1, Integer value2) {
            addCriterion("failurenum between", value1, value2, "failurenum");
            return (Criteria) this;
        }

        public Criteria andFailurenumNotBetween(Integer value1, Integer value2) {
            addCriterion("failurenum not between", value1, value2, "failurenum");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
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