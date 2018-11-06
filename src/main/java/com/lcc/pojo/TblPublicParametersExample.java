package com.lcc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblPublicParametersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPublicParametersExample() {
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

        public Criteria andTesturlIsNull() {
            addCriterion("testUrl is null");
            return (Criteria) this;
        }

        public Criteria andTesturlIsNotNull() {
            addCriterion("testUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTesturlEqualTo(String value) {
            addCriterion("testUrl =", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlNotEqualTo(String value) {
            addCriterion("testUrl <>", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlGreaterThan(String value) {
            addCriterion("testUrl >", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlGreaterThanOrEqualTo(String value) {
            addCriterion("testUrl >=", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlLessThan(String value) {
            addCriterion("testUrl <", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlLessThanOrEqualTo(String value) {
            addCriterion("testUrl <=", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlLike(String value) {
            addCriterion("testUrl like", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlNotLike(String value) {
            addCriterion("testUrl not like", value, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlIn(List<String> values) {
            addCriterion("testUrl in", values, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlNotIn(List<String> values) {
            addCriterion("testUrl not in", values, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlBetween(String value1, String value2) {
            addCriterion("testUrl between", value1, value2, "testurl");
            return (Criteria) this;
        }

        public Criteria andTesturlNotBetween(String value1, String value2) {
            addCriterion("testUrl not between", value1, value2, "testurl");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andXinyitokenIsNull() {
            addCriterion("xinyitoken is null");
            return (Criteria) this;
        }

        public Criteria andXinyitokenIsNotNull() {
            addCriterion("xinyitoken is not null");
            return (Criteria) this;
        }

        public Criteria andXinyitokenEqualTo(String value) {
            addCriterion("xinyitoken =", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenNotEqualTo(String value) {
            addCriterion("xinyitoken <>", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenGreaterThan(String value) {
            addCriterion("xinyitoken >", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenGreaterThanOrEqualTo(String value) {
            addCriterion("xinyitoken >=", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenLessThan(String value) {
            addCriterion("xinyitoken <", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenLessThanOrEqualTo(String value) {
            addCriterion("xinyitoken <=", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenLike(String value) {
            addCriterion("xinyitoken like", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenNotLike(String value) {
            addCriterion("xinyitoken not like", value, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenIn(List<String> values) {
            addCriterion("xinyitoken in", values, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenNotIn(List<String> values) {
            addCriterion("xinyitoken not in", values, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenBetween(String value1, String value2) {
            addCriterion("xinyitoken between", value1, value2, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andXinyitokenNotBetween(String value1, String value2) {
            addCriterion("xinyitoken not between", value1, value2, "xinyitoken");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("secret like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("secret not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretIsNull() {
            addCriterion("staticSecret is null");
            return (Criteria) this;
        }

        public Criteria andStaticsecretIsNotNull() {
            addCriterion("staticSecret is not null");
            return (Criteria) this;
        }

        public Criteria andStaticsecretEqualTo(String value) {
            addCriterion("staticSecret =", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretNotEqualTo(String value) {
            addCriterion("staticSecret <>", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretGreaterThan(String value) {
            addCriterion("staticSecret >", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretGreaterThanOrEqualTo(String value) {
            addCriterion("staticSecret >=", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretLessThan(String value) {
            addCriterion("staticSecret <", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretLessThanOrEqualTo(String value) {
            addCriterion("staticSecret <=", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretLike(String value) {
            addCriterion("staticSecret like", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretNotLike(String value) {
            addCriterion("staticSecret not like", value, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretIn(List<String> values) {
            addCriterion("staticSecret in", values, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretNotIn(List<String> values) {
            addCriterion("staticSecret not in", values, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretBetween(String value1, String value2) {
            addCriterion("staticSecret between", value1, value2, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andStaticsecretNotBetween(String value1, String value2) {
            addCriterion("staticSecret not between", value1, value2, "staticsecret");
            return (Criteria) this;
        }

        public Criteria andUnidcodeIsNull() {
            addCriterion("unidcode is null");
            return (Criteria) this;
        }

        public Criteria andUnidcodeIsNotNull() {
            addCriterion("unidcode is not null");
            return (Criteria) this;
        }

        public Criteria andUnidcodeEqualTo(String value) {
            addCriterion("unidcode =", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeNotEqualTo(String value) {
            addCriterion("unidcode <>", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeGreaterThan(String value) {
            addCriterion("unidcode >", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unidcode >=", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeLessThan(String value) {
            addCriterion("unidcode <", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeLessThanOrEqualTo(String value) {
            addCriterion("unidcode <=", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeLike(String value) {
            addCriterion("unidcode like", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeNotLike(String value) {
            addCriterion("unidcode not like", value, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeIn(List<String> values) {
            addCriterion("unidcode in", values, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeNotIn(List<String> values) {
            addCriterion("unidcode not in", values, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeBetween(String value1, String value2) {
            addCriterion("unidcode between", value1, value2, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUnidcodeNotBetween(String value1, String value2) {
            addCriterion("unidcode not between", value1, value2, "unidcode");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNull() {
            addCriterion("userkey is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNotNull() {
            addCriterion("userkey is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyEqualTo(String value) {
            addCriterion("userkey =", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotEqualTo(String value) {
            addCriterion("userkey <>", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThan(String value) {
            addCriterion("userkey >", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThanOrEqualTo(String value) {
            addCriterion("userkey >=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThan(String value) {
            addCriterion("userkey <", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThanOrEqualTo(String value) {
            addCriterion("userkey <=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLike(String value) {
            addCriterion("userkey like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotLike(String value) {
            addCriterion("userkey not like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIn(List<String> values) {
            addCriterion("userkey in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotIn(List<String> values) {
            addCriterion("userkey not in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyBetween(String value1, String value2) {
            addCriterion("userkey between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotBetween(String value1, String value2) {
            addCriterion("userkey not between", value1, value2, "userkey");
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