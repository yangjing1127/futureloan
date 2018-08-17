package com.yj.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegnameIsNull() {
            addCriterion("RegName is null");
            return (Criteria) this;
        }

        public Criteria andRegnameIsNotNull() {
            addCriterion("RegName is not null");
            return (Criteria) this;
        }

        public Criteria andRegnameEqualTo(String value) {
            addCriterion("RegName =", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameNotEqualTo(String value) {
            addCriterion("RegName <>", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameGreaterThan(String value) {
            addCriterion("RegName >", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameGreaterThanOrEqualTo(String value) {
            addCriterion("RegName >=", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameLessThan(String value) {
            addCriterion("RegName <", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameLessThanOrEqualTo(String value) {
            addCriterion("RegName <=", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameLike(String value) {
            addCriterion("RegName like", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameNotLike(String value) {
            addCriterion("RegName not like", value, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameIn(List<String> values) {
            addCriterion("RegName in", values, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameNotIn(List<String> values) {
            addCriterion("RegName not in", values, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameBetween(String value1, String value2) {
            addCriterion("RegName between", value1, value2, "regname");
            return (Criteria) this;
        }

        public Criteria andRegnameNotBetween(String value1, String value2) {
            addCriterion("RegName not between", value1, value2, "regname");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("Pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("Pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("Pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("Pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("Pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("Pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("Pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("Pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("Pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("Pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("Pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("Pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("Salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("Salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("Salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("Salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("Salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("Salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("Salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("Salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("Salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("Salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("Salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("Salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("Salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("Salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("Photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("Photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("Photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("Photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("Photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("Photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("Photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("Photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("Photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("Photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("Photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("Photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("Photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("Photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("Birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("Birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("Birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("Birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("Birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("Birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("Birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("Birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("Birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("Birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("Birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("Birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MobilePhone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MobilePhone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MobilePhone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MobilePhone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MobilePhone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MobilePhone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MobilePhone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MobilePhone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MobilePhone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MobilePhone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MobilePhone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("RegTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("RegTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("RegTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("RegTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("RegTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RegTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("RegTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("RegTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("RegTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("RegTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("RegTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("RegTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegipIsNull() {
            addCriterion("RegIP is null");
            return (Criteria) this;
        }

        public Criteria andRegipIsNotNull() {
            addCriterion("RegIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegipEqualTo(String value) {
            addCriterion("RegIP =", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotEqualTo(String value) {
            addCriterion("RegIP <>", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThan(String value) {
            addCriterion("RegIP >", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThanOrEqualTo(String value) {
            addCriterion("RegIP >=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThan(String value) {
            addCriterion("RegIP <", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThanOrEqualTo(String value) {
            addCriterion("RegIP <=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLike(String value) {
            addCriterion("RegIP like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotLike(String value) {
            addCriterion("RegIP not like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipIn(List<String> values) {
            addCriterion("RegIP in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotIn(List<String> values) {
            addCriterion("RegIP not in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipBetween(String value1, String value2) {
            addCriterion("RegIP between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotBetween(String value1, String value2) {
            addCriterion("RegIP not between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIsNull() {
            addCriterion("AddressInfo is null");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIsNotNull() {
            addCriterion("AddressInfo is not null");
            return (Criteria) this;
        }

        public Criteria andAddressinfoEqualTo(String value) {
            addCriterion("AddressInfo =", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoNotEqualTo(String value) {
            addCriterion("AddressInfo <>", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoGreaterThan(String value) {
            addCriterion("AddressInfo >", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoGreaterThanOrEqualTo(String value) {
            addCriterion("AddressInfo >=", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoLessThan(String value) {
            addCriterion("AddressInfo <", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoLessThanOrEqualTo(String value) {
            addCriterion("AddressInfo <=", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoLike(String value) {
            addCriterion("AddressInfo like", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoNotLike(String value) {
            addCriterion("AddressInfo not like", value, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIn(List<String> values) {
            addCriterion("AddressInfo in", values, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoNotIn(List<String> values) {
            addCriterion("AddressInfo not in", values, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoBetween(String value1, String value2) {
            addCriterion("AddressInfo between", value1, value2, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andAddressinfoNotBetween(String value1, String value2) {
            addCriterion("AddressInfo not between", value1, value2, "addressinfo");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("IsValid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("IsValid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Boolean value) {
            addCriterion("IsValid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Boolean value) {
            addCriterion("IsValid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Boolean value) {
            addCriterion("IsValid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsValid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Boolean value) {
            addCriterion("IsValid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Boolean value) {
            addCriterion("IsValid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Boolean> values) {
            addCriterion("IsValid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Boolean> values) {
            addCriterion("IsValid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andLeaveamountIsNull() {
            addCriterion("LeaveAmount is null");
            return (Criteria) this;
        }

        public Criteria andLeaveamountIsNotNull() {
            addCriterion("LeaveAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveamountEqualTo(BigDecimal value) {
            addCriterion("LeaveAmount =", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountNotEqualTo(BigDecimal value) {
            addCriterion("LeaveAmount <>", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountGreaterThan(BigDecimal value) {
            addCriterion("LeaveAmount >", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LeaveAmount >=", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountLessThan(BigDecimal value) {
            addCriterion("LeaveAmount <", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LeaveAmount <=", value, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountIn(List<BigDecimal> values) {
            addCriterion("LeaveAmount in", values, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountNotIn(List<BigDecimal> values) {
            addCriterion("LeaveAmount not in", values, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LeaveAmount between", value1, value2, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andLeaveamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LeaveAmount not between", value1, value2, "leaveamount");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileIsNull() {
            addCriterion("IsValidateMobile is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileIsNotNull() {
            addCriterion("IsValidateMobile is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileEqualTo(Boolean value) {
            addCriterion("IsValidateMobile =", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileNotEqualTo(Boolean value) {
            addCriterion("IsValidateMobile <>", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileGreaterThan(Boolean value) {
            addCriterion("IsValidateMobile >", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsValidateMobile >=", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileLessThan(Boolean value) {
            addCriterion("IsValidateMobile <", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileLessThanOrEqualTo(Boolean value) {
            addCriterion("IsValidateMobile <=", value, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileIn(List<Boolean> values) {
            addCriterion("IsValidateMobile in", values, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileNotIn(List<Boolean> values) {
            addCriterion("IsValidateMobile not in", values, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValidateMobile between", value1, value2, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidatemobileNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValidateMobile not between", value1, value2, "isvalidatemobile");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailIsNull() {
            addCriterion("IsValidateEmail is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailIsNotNull() {
            addCriterion("IsValidateEmail is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailEqualTo(Boolean value) {
            addCriterion("IsValidateEmail =", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailNotEqualTo(Boolean value) {
            addCriterion("IsValidateEmail <>", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailGreaterThan(Boolean value) {
            addCriterion("IsValidateEmail >", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsValidateEmail >=", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailLessThan(Boolean value) {
            addCriterion("IsValidateEmail <", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailLessThanOrEqualTo(Boolean value) {
            addCriterion("IsValidateEmail <=", value, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailIn(List<Boolean> values) {
            addCriterion("IsValidateEmail in", values, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailNotIn(List<Boolean> values) {
            addCriterion("IsValidateEmail not in", values, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValidateEmail between", value1, value2, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andIsvalidateemailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsValidateEmail not between", value1, value2, "isvalidateemail");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("Vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("Vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(Integer value) {
            addCriterion("Vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(Integer value) {
            addCriterion("Vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(Integer value) {
            addCriterion("Vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(Integer value) {
            addCriterion("Vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(Integer value) {
            addCriterion("Vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<Integer> values) {
            addCriterion("Vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<Integer> values) {
            addCriterion("Vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(Integer value1, Integer value2) {
            addCriterion("Vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(Integer value1, Integer value2) {
            addCriterion("Vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNull() {
            addCriterion("RegType is null");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNotNull() {
            addCriterion("RegType is not null");
            return (Criteria) this;
        }

        public Criteria andRegtypeEqualTo(Integer value) {
            addCriterion("RegType =", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotEqualTo(Integer value) {
            addCriterion("RegType <>", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThan(Integer value) {
            addCriterion("RegType >", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegType >=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThan(Integer value) {
            addCriterion("RegType <", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThanOrEqualTo(Integer value) {
            addCriterion("RegType <=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeIn(List<Integer> values) {
            addCriterion("RegType in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotIn(List<Integer> values) {
            addCriterion("RegType not in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeBetween(Integer value1, Integer value2) {
            addCriterion("RegType between", value1, value2, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RegType not between", value1, value2, "regtype");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNull() {
            addCriterion("PayPwd is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNotNull() {
            addCriterion("PayPwd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdEqualTo(String value) {
            addCriterion("PayPwd =", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotEqualTo(String value) {
            addCriterion("PayPwd <>", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThan(String value) {
            addCriterion("PayPwd >", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("PayPwd >=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThan(String value) {
            addCriterion("PayPwd <", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThanOrEqualTo(String value) {
            addCriterion("PayPwd <=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLike(String value) {
            addCriterion("PayPwd like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotLike(String value) {
            addCriterion("PayPwd not like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdIn(List<String> values) {
            addCriterion("PayPwd in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotIn(List<String> values) {
            addCriterion("PayPwd not in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdBetween(String value1, String value2) {
            addCriterion("PayPwd between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotBetween(String value1, String value2) {
            addCriterion("PayPwd not between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltIsNull() {
            addCriterion("PayPwdSalt is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltIsNotNull() {
            addCriterion("PayPwdSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltEqualTo(String value) {
            addCriterion("PayPwdSalt =", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltNotEqualTo(String value) {
            addCriterion("PayPwdSalt <>", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltGreaterThan(String value) {
            addCriterion("PayPwdSalt >", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltGreaterThanOrEqualTo(String value) {
            addCriterion("PayPwdSalt >=", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltLessThan(String value) {
            addCriterion("PayPwdSalt <", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltLessThanOrEqualTo(String value) {
            addCriterion("PayPwdSalt <=", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltLike(String value) {
            addCriterion("PayPwdSalt like", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltNotLike(String value) {
            addCriterion("PayPwdSalt not like", value, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltIn(List<String> values) {
            addCriterion("PayPwdSalt in", values, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltNotIn(List<String> values) {
            addCriterion("PayPwdSalt not in", values, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltBetween(String value1, String value2) {
            addCriterion("PayPwdSalt between", value1, value2, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypwdsaltNotBetween(String value1, String value2) {
            addCriterion("PayPwdSalt not between", value1, value2, "paypwdsalt");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeIsNull() {
            addCriterion("LastLogTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeIsNotNull() {
            addCriterion("LastLogTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeEqualTo(Date value) {
            addCriterion("LastLogTime =", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotEqualTo(Date value) {
            addCriterion("LastLogTime <>", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeGreaterThan(Date value) {
            addCriterion("LastLogTime >", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLogTime >=", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeLessThan(Date value) {
            addCriterion("LastLogTime <", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLogTime <=", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeIn(List<Date> values) {
            addCriterion("LastLogTime in", values, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotIn(List<Date> values) {
            addCriterion("LastLogTime not in", values, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeBetween(Date value1, Date value2) {
            addCriterion("LastLogTime between", value1, value2, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLogTime not between", value1, value2, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andExpgradeIsNull() {
            addCriterion("ExpGrade is null");
            return (Criteria) this;
        }

        public Criteria andExpgradeIsNotNull() {
            addCriterion("ExpGrade is not null");
            return (Criteria) this;
        }

        public Criteria andExpgradeEqualTo(Integer value) {
            addCriterion("ExpGrade =", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeNotEqualTo(Integer value) {
            addCriterion("ExpGrade <>", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeGreaterThan(Integer value) {
            addCriterion("ExpGrade >", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExpGrade >=", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeLessThan(Integer value) {
            addCriterion("ExpGrade <", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeLessThanOrEqualTo(Integer value) {
            addCriterion("ExpGrade <=", value, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeIn(List<Integer> values) {
            addCriterion("ExpGrade in", values, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeNotIn(List<Integer> values) {
            addCriterion("ExpGrade not in", values, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeBetween(Integer value1, Integer value2) {
            addCriterion("ExpGrade between", value1, value2, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("ExpGrade not between", value1, value2, "expgrade");
            return (Criteria) this;
        }

        public Criteria andExpvalueIsNull() {
            addCriterion("ExpValue is null");
            return (Criteria) this;
        }

        public Criteria andExpvalueIsNotNull() {
            addCriterion("ExpValue is not null");
            return (Criteria) this;
        }

        public Criteria andExpvalueEqualTo(Integer value) {
            addCriterion("ExpValue =", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueNotEqualTo(Integer value) {
            addCriterion("ExpValue <>", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueGreaterThan(Integer value) {
            addCriterion("ExpValue >", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExpValue >=", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueLessThan(Integer value) {
            addCriterion("ExpValue <", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueLessThanOrEqualTo(Integer value) {
            addCriterion("ExpValue <=", value, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueIn(List<Integer> values) {
            addCriterion("ExpValue in", values, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueNotIn(List<Integer> values) {
            addCriterion("ExpValue not in", values, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueBetween(Integer value1, Integer value2) {
            addCriterion("ExpValue between", value1, value2, "expvalue");
            return (Criteria) this;
        }

        public Criteria andExpvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("ExpValue not between", value1, value2, "expvalue");
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