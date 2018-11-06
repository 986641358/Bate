package com.lcc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCaseExample() {
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

        public Criteria andParametersIsNull() {
            addCriterion("parameters is null");
            return (Criteria) this;
        }

        public Criteria andParametersIsNotNull() {
            addCriterion("parameters is not null");
            return (Criteria) this;
        }

        public Criteria andParametersEqualTo(String value) {
            addCriterion("parameters =", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotEqualTo(String value) {
            addCriterion("parameters <>", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThan(String value) {
            addCriterion("parameters >", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThanOrEqualTo(String value) {
            addCriterion("parameters >=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThan(String value) {
            addCriterion("parameters <", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThanOrEqualTo(String value) {
            addCriterion("parameters <=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLike(String value) {
            addCriterion("parameters like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotLike(String value) {
            addCriterion("parameters not like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersIn(List<String> values) {
            addCriterion("parameters in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotIn(List<String> values) {
            addCriterion("parameters not in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersBetween(String value1, String value2) {
            addCriterion("parameters between", value1, value2, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotBetween(String value1, String value2) {
            addCriterion("parameters not between", value1, value2, "parameters");
            return (Criteria) this;
        }

        public Criteria andApiidIsNull() {
            addCriterion("apiid is null");
            return (Criteria) this;
        }

        public Criteria andApiidIsNotNull() {
            addCriterion("apiid is not null");
            return (Criteria) this;
        }

        public Criteria andApiidEqualTo(Integer value) {
            addCriterion("apiid =", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotEqualTo(Integer value) {
            addCriterion("apiid <>", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidGreaterThan(Integer value) {
            addCriterion("apiid >", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("apiid >=", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidLessThan(Integer value) {
            addCriterion("apiid <", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidLessThanOrEqualTo(Integer value) {
            addCriterion("apiid <=", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidIn(List<Integer> values) {
            addCriterion("apiid in", values, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotIn(List<Integer> values) {
            addCriterion("apiid not in", values, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidBetween(Integer value1, Integer value2) {
            addCriterion("apiid between", value1, value2, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotBetween(Integer value1, Integer value2) {
            addCriterion("apiid not between", value1, value2, "apiid");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNull() {
            addCriterion("casename is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("casename is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("casename =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("casename <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("casename >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("casename >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("casename <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("casename <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("casename like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("casename not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("casename in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("casename not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("casename between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("casename not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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