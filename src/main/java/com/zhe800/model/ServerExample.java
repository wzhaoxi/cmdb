package com.zhe800.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerExample() {
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

        public Criteria andAssertNumberIsNull() {
            addCriterion("assert_number is null");
            return (Criteria) this;
        }

        public Criteria andAssertNumberIsNotNull() {
            addCriterion("assert_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssertNumberEqualTo(String value) {
            addCriterion("assert_number =", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberNotEqualTo(String value) {
            addCriterion("assert_number <>", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberGreaterThan(String value) {
            addCriterion("assert_number >", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberGreaterThanOrEqualTo(String value) {
            addCriterion("assert_number >=", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberLessThan(String value) {
            addCriterion("assert_number <", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberLessThanOrEqualTo(String value) {
            addCriterion("assert_number <=", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberLike(String value) {
            addCriterion("assert_number like", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberNotLike(String value) {
            addCriterion("assert_number not like", value, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberIn(List<String> values) {
            addCriterion("assert_number in", values, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberNotIn(List<String> values) {
            addCriterion("assert_number not in", values, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberBetween(String value1, String value2) {
            addCriterion("assert_number between", value1, value2, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andAssertNumberNotBetween(String value1, String value2) {
            addCriterion("assert_number not between", value1, value2, "assertNumber");
            return (Criteria) this;
        }

        public Criteria andIdracIpIsNull() {
            addCriterion("idrac_ip is null");
            return (Criteria) this;
        }

        public Criteria andIdracIpIsNotNull() {
            addCriterion("idrac_ip is not null");
            return (Criteria) this;
        }

        public Criteria andIdracIpEqualTo(String value) {
            addCriterion("idrac_ip =", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpNotEqualTo(String value) {
            addCriterion("idrac_ip <>", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpGreaterThan(String value) {
            addCriterion("idrac_ip >", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpGreaterThanOrEqualTo(String value) {
            addCriterion("idrac_ip >=", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpLessThan(String value) {
            addCriterion("idrac_ip <", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpLessThanOrEqualTo(String value) {
            addCriterion("idrac_ip <=", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpLike(String value) {
            addCriterion("idrac_ip like", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpNotLike(String value) {
            addCriterion("idrac_ip not like", value, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpIn(List<String> values) {
            addCriterion("idrac_ip in", values, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpNotIn(List<String> values) {
            addCriterion("idrac_ip not in", values, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpBetween(String value1, String value2) {
            addCriterion("idrac_ip between", value1, value2, "idracIp");
            return (Criteria) this;
        }

        public Criteria andIdracIpNotBetween(String value1, String value2) {
            addCriterion("idrac_ip not between", value1, value2, "idracIp");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
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

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSnNumberIsNull() {
            addCriterion("sn_number is null");
            return (Criteria) this;
        }

        public Criteria andSnNumberIsNotNull() {
            addCriterion("sn_number is not null");
            return (Criteria) this;
        }

        public Criteria andSnNumberEqualTo(String value) {
            addCriterion("sn_number =", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotEqualTo(String value) {
            addCriterion("sn_number <>", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberGreaterThan(String value) {
            addCriterion("sn_number >", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sn_number >=", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLessThan(String value) {
            addCriterion("sn_number <", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLessThanOrEqualTo(String value) {
            addCriterion("sn_number <=", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLike(String value) {
            addCriterion("sn_number like", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotLike(String value) {
            addCriterion("sn_number not like", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberIn(List<String> values) {
            addCriterion("sn_number in", values, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotIn(List<String> values) {
            addCriterion("sn_number not in", values, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberBetween(String value1, String value2) {
            addCriterion("sn_number between", value1, value2, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotBetween(String value1, String value2) {
            addCriterion("sn_number not between", value1, value2, "snNumber");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("buy_time not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNull() {
            addCriterion("added_time is null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNotNull() {
            addCriterion("added_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeEqualTo(Date value) {
            addCriterion("added_time =", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotEqualTo(Date value) {
            addCriterion("added_time <>", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThan(Date value) {
            addCriterion("added_time >", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("added_time >=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThan(Date value) {
            addCriterion("added_time <", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThanOrEqualTo(Date value) {
            addCriterion("added_time <=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIn(List<Date> values) {
            addCriterion("added_time in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotIn(List<Date> values) {
            addCriterion("added_time not in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeBetween(Date value1, Date value2) {
            addCriterion("added_time between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotBetween(Date value1, Date value2) {
            addCriterion("added_time not between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andIdcIdIsNull() {
            addCriterion("idc_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcIdIsNotNull() {
            addCriterion("idc_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcIdEqualTo(Integer value) {
            addCriterion("idc_id =", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotEqualTo(Integer value) {
            addCriterion("idc_id <>", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThan(Integer value) {
            addCriterion("idc_id >", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("idc_id >=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThan(Integer value) {
            addCriterion("idc_id <", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThanOrEqualTo(Integer value) {
            addCriterion("idc_id <=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdIn(List<Integer> values) {
            addCriterion("idc_id in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotIn(List<Integer> values) {
            addCriterion("idc_id not in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdBetween(Integer value1, Integer value2) {
            addCriterion("idc_id between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("idc_id not between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNull() {
            addCriterion("cabinet_id is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNotNull() {
            addCriterion("cabinet_id is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdEqualTo(Integer value) {
            addCriterion("cabinet_id =", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotEqualTo(Integer value) {
            addCriterion("cabinet_id <>", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThan(Integer value) {
            addCriterion("cabinet_id >", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cabinet_id >=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThan(Integer value) {
            addCriterion("cabinet_id <", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThanOrEqualTo(Integer value) {
            addCriterion("cabinet_id <=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIn(List<Integer> values) {
            addCriterion("cabinet_id in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotIn(List<Integer> values) {
            addCriterion("cabinet_id not in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdBetween(Integer value1, Integer value2) {
            addCriterion("cabinet_id between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cabinet_id not between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionIsNull() {
            addCriterion("cabinet_position is null");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionIsNotNull() {
            addCriterion("cabinet_position is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionEqualTo(String value) {
            addCriterion("cabinet_position =", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionNotEqualTo(String value) {
            addCriterion("cabinet_position <>", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionGreaterThan(String value) {
            addCriterion("cabinet_position >", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionGreaterThanOrEqualTo(String value) {
            addCriterion("cabinet_position >=", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionLessThan(String value) {
            addCriterion("cabinet_position <", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionLessThanOrEqualTo(String value) {
            addCriterion("cabinet_position <=", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionLike(String value) {
            addCriterion("cabinet_position like", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionNotLike(String value) {
            addCriterion("cabinet_position not like", value, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionIn(List<String> values) {
            addCriterion("cabinet_position in", values, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionNotIn(List<String> values) {
            addCriterion("cabinet_position not in", values, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionBetween(String value1, String value2) {
            addCriterion("cabinet_position between", value1, value2, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andCabinetPositionNotBetween(String value1, String value2) {
            addCriterion("cabinet_position not between", value1, value2, "cabinetPosition");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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