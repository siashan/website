package com.web.site.entity.sys;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {

	/**
     * @mbg.generated
     */
protected String orderByClause;

	/**
     * @mbg.generated
     */
protected boolean distinct;

	/**
     * @mbg.generated
     */
protected List<Criteria> oredCriteria;

	/**
     * @mbg.generated
     */
protected Page page;

	/**
	     * @mbg.generated
	     */
	public SysUserExample() {
	    oredCriteria = new ArrayList<Criteria>();
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderByClause(String orderByClause) {
	    this.orderByClause = orderByClause;
	}

	/**
	     * @mbg.generated
	     */
	public String getOrderByClause() {
	    return orderByClause;
	}

	/**
	     * @mbg.generated
	     */
	public void setDistinct(boolean distinct) {
	    this.distinct = distinct;
	}

	/**
	     * @mbg.generated
	     */
	public boolean isDistinct() {
	    return distinct;
	}

	/**
	     * @mbg.generated
	     */
	public List<Criteria> getOredCriteria() {
	    return oredCriteria;
	}

	/**
	     * @mbg.generated
	     */
	public void or(Criteria criteria) {
	    oredCriteria.add(criteria);
	}

	/**
	     * @mbg.generated
	     */
	public Criteria or() {
	    Criteria criteria = createCriteriaInternal();
	    oredCriteria.add(criteria);
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	public Criteria createCriteria() {
	    Criteria criteria = createCriteriaInternal();
	    if (oredCriteria.size() == 0) {
	        oredCriteria.add(criteria);
	    }
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	protected Criteria createCriteriaInternal() {
	    Criteria criteria = new Criteria();
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	public void clear() {
	    oredCriteria.clear();
	    orderByClause = null;
	    distinct = false;
	}

	/**
	     * @mbg.generated
	     */
	public void setPage(Page page) {
	    this.page = page;
	}

	/**
	     * @mbg.generated
	     */
	public Page getPage() {
	    return page;
	}

	/**
	     * sys_user
	     * @author Small 2018-09-29
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
	
	    public Criteria andIdIsNull() {
	        addCriterion("ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIsNotNull() {
	        addCriterion("ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdEqualTo(Long value) {
	        addCriterion("ID =", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotEqualTo(Long value) {
	        addCriterion("ID <>", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThan(Long value) {
	        addCriterion("ID >", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("ID >=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThan(Long value) {
	        addCriterion("ID <", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThanOrEqualTo(Long value) {
	        addCriterion("ID <=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIn(List<Long> values) {
	        addCriterion("ID in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotIn(List<Long> values) {
	        addCriterion("ID not in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdBetween(Long value1, Long value2) {
	        addCriterion("ID between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotBetween(Long value1, Long value2) {
	        addCriterion("ID not between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameIsNull() {
	        addCriterion("REAL_NAME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameIsNotNull() {
	        addCriterion("REAL_NAME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameEqualTo(String value) {
	        addCriterion("REAL_NAME =", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameNotEqualTo(String value) {
	        addCriterion("REAL_NAME <>", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameGreaterThan(String value) {
	        addCriterion("REAL_NAME >", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameGreaterThanOrEqualTo(String value) {
	        addCriterion("REAL_NAME >=", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameLessThan(String value) {
	        addCriterion("REAL_NAME <", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameLessThanOrEqualTo(String value) {
	        addCriterion("REAL_NAME <=", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameLike(String value) {
	        addCriterion("REAL_NAME like", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameNotLike(String value) {
	        addCriterion("REAL_NAME not like", value, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameIn(List<String> values) {
	        addCriterion("REAL_NAME in", values, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameNotIn(List<String> values) {
	        addCriterion("REAL_NAME not in", values, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameBetween(String value1, String value2) {
	        addCriterion("REAL_NAME between", value1, value2, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andRealNameNotBetween(String value1, String value2) {
	        addCriterion("REAL_NAME not between", value1, value2, "realName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIsNull() {
	        addCriterion("SALT is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIsNotNull() {
	        addCriterion("SALT is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltEqualTo(String value) {
	        addCriterion("SALT =", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotEqualTo(String value) {
	        addCriterion("SALT <>", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltGreaterThan(String value) {
	        addCriterion("SALT >", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltGreaterThanOrEqualTo(String value) {
	        addCriterion("SALT >=", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLessThan(String value) {
	        addCriterion("SALT <", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLessThanOrEqualTo(String value) {
	        addCriterion("SALT <=", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLike(String value) {
	        addCriterion("SALT like", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotLike(String value) {
	        addCriterion("SALT not like", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIn(List<String> values) {
	        addCriterion("SALT in", values, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotIn(List<String> values) {
	        addCriterion("SALT not in", values, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltBetween(String value1, String value2) {
	        addCriterion("SALT between", value1, value2, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotBetween(String value1, String value2) {
	        addCriterion("SALT not between", value1, value2, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderIsNull() {
	        addCriterion("GENDER is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderIsNotNull() {
	        addCriterion("GENDER is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderEqualTo(String value) {
	        addCriterion("GENDER =", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderNotEqualTo(String value) {
	        addCriterion("GENDER <>", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderGreaterThan(String value) {
	        addCriterion("GENDER >", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderGreaterThanOrEqualTo(String value) {
	        addCriterion("GENDER >=", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderLessThan(String value) {
	        addCriterion("GENDER <", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderLessThanOrEqualTo(String value) {
	        addCriterion("GENDER <=", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderLike(String value) {
	        addCriterion("GENDER like", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderNotLike(String value) {
	        addCriterion("GENDER not like", value, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderIn(List<String> values) {
	        addCriterion("GENDER in", values, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderNotIn(List<String> values) {
	        addCriterion("GENDER not in", values, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderBetween(String value1, String value2) {
	        addCriterion("GENDER between", value1, value2, "gender");
	        return (Criteria) this;
	    }
	
	    public Criteria andGenderNotBetween(String value1, String value2) {
	        addCriterion("GENDER not between", value1, value2, "gender");
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
	
	    public Criteria andPhoneNoIsNull() {
	        addCriterion("PHONE_NO is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoIsNotNull() {
	        addCriterion("PHONE_NO is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoEqualTo(String value) {
	        addCriterion("PHONE_NO =", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoNotEqualTo(String value) {
	        addCriterion("PHONE_NO <>", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoGreaterThan(String value) {
	        addCriterion("PHONE_NO >", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
	        addCriterion("PHONE_NO >=", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoLessThan(String value) {
	        addCriterion("PHONE_NO <", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoLessThanOrEqualTo(String value) {
	        addCriterion("PHONE_NO <=", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoLike(String value) {
	        addCriterion("PHONE_NO like", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoNotLike(String value) {
	        addCriterion("PHONE_NO not like", value, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoIn(List<String> values) {
	        addCriterion("PHONE_NO in", values, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoNotIn(List<String> values) {
	        addCriterion("PHONE_NO not in", values, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoBetween(String value1, String value2) {
	        addCriterion("PHONE_NO between", value1, value2, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNoNotBetween(String value1, String value2) {
	        addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailIsNull() {
	        addCriterion("EMAIL is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailIsNotNull() {
	        addCriterion("EMAIL is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailEqualTo(String value) {
	        addCriterion("EMAIL =", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailNotEqualTo(String value) {
	        addCriterion("EMAIL <>", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailGreaterThan(String value) {
	        addCriterion("EMAIL >", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailGreaterThanOrEqualTo(String value) {
	        addCriterion("EMAIL >=", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailLessThan(String value) {
	        addCriterion("EMAIL <", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailLessThanOrEqualTo(String value) {
	        addCriterion("EMAIL <=", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailLike(String value) {
	        addCriterion("EMAIL like", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailNotLike(String value) {
	        addCriterion("EMAIL not like", value, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailIn(List<String> values) {
	        addCriterion("EMAIL in", values, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailNotIn(List<String> values) {
	        addCriterion("EMAIL not in", values, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailBetween(String value1, String value2) {
	        addCriterion("EMAIL between", value1, value2, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailNotBetween(String value1, String value2) {
	        addCriterion("EMAIL not between", value1, value2, "email");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNull() {
	        addCriterion("CREATE_TIME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNotNull() {
	        addCriterion("CREATE_TIME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeEqualTo(Date value) {
	        addCriterion("CREATE_TIME =", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotEqualTo(Date value) {
	        addCriterion("CREATE_TIME <>", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThan(Date value) {
	        addCriterion("CREATE_TIME >", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("CREATE_TIME >=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThan(Date value) {
	        addCriterion("CREATE_TIME <", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
	        addCriterion("CREATE_TIME <=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIn(List<Date> values) {
	        addCriterion("CREATE_TIME in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotIn(List<Date> values) {
	        addCriterion("CREATE_TIME not in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeBetween(Date value1, Date value2) {
	        addCriterion("CREATE_TIME between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
	        addCriterion("CREATE_TIME not between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateIsNull() {
	        addCriterion("LAST_LOGIN_DATE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateIsNotNull() {
	        addCriterion("LAST_LOGIN_DATE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateEqualTo(Date value) {
	        addCriterion("LAST_LOGIN_DATE =", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateNotEqualTo(Date value) {
	        addCriterion("LAST_LOGIN_DATE <>", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateGreaterThan(Date value) {
	        addCriterion("LAST_LOGIN_DATE >", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
	        addCriterion("LAST_LOGIN_DATE >=", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateLessThan(Date value) {
	        addCriterion("LAST_LOGIN_DATE <", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
	        addCriterion("LAST_LOGIN_DATE <=", value, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateIn(List<Date> values) {
	        addCriterion("LAST_LOGIN_DATE in", values, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateNotIn(List<Date> values) {
	        addCriterion("LAST_LOGIN_DATE not in", values, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateBetween(Date value1, Date value2) {
	        addCriterion("LAST_LOGIN_DATE between", value1, value2, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
	        addCriterion("LAST_LOGIN_DATE not between", value1, value2, "lastLoginDate");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdIsNull() {
	        addCriterion("OPEN_ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdIsNotNull() {
	        addCriterion("OPEN_ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdEqualTo(String value) {
	        addCriterion("OPEN_ID =", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdNotEqualTo(String value) {
	        addCriterion("OPEN_ID <>", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdGreaterThan(String value) {
	        addCriterion("OPEN_ID >", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
	        addCriterion("OPEN_ID >=", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdLessThan(String value) {
	        addCriterion("OPEN_ID <", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdLessThanOrEqualTo(String value) {
	        addCriterion("OPEN_ID <=", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdLike(String value) {
	        addCriterion("OPEN_ID like", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdNotLike(String value) {
	        addCriterion("OPEN_ID not like", value, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdIn(List<String> values) {
	        addCriterion("OPEN_ID in", values, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdNotIn(List<String> values) {
	        addCriterion("OPEN_ID not in", values, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdBetween(String value1, String value2) {
	        addCriterion("OPEN_ID between", value1, value2, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andOpenIdNotBetween(String value1, String value2) {
	        addCriterion("OPEN_ID not between", value1, value2, "openId");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusIsNull() {
	        addCriterion("WECHAT_ATTENTION_STATUS is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusIsNotNull() {
	        addCriterion("WECHAT_ATTENTION_STATUS is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusEqualTo(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS =", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusNotEqualTo(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS <>", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusGreaterThan(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS >", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusGreaterThanOrEqualTo(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS >=", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusLessThan(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS <", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusLessThanOrEqualTo(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS <=", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusLike(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS like", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusNotLike(String value) {
	        addCriterion("WECHAT_ATTENTION_STATUS not like", value, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusIn(List<String> values) {
	        addCriterion("WECHAT_ATTENTION_STATUS in", values, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusNotIn(List<String> values) {
	        addCriterion("WECHAT_ATTENTION_STATUS not in", values, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusBetween(String value1, String value2) {
	        addCriterion("WECHAT_ATTENTION_STATUS between", value1, value2, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andWechatAttentionStatusNotBetween(String value1, String value2) {
	        addCriterion("WECHAT_ATTENTION_STATUS not between", value1, value2, "wechatAttentionStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdIsNull() {
	        addCriterion("DEPT_ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdIsNotNull() {
	        addCriterion("DEPT_ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdEqualTo(Long value) {
	        addCriterion("DEPT_ID =", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdNotEqualTo(Long value) {
	        addCriterion("DEPT_ID <>", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdGreaterThan(Long value) {
	        addCriterion("DEPT_ID >", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("DEPT_ID >=", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdLessThan(Long value) {
	        addCriterion("DEPT_ID <", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdLessThanOrEqualTo(Long value) {
	        addCriterion("DEPT_ID <=", value, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdIn(List<Long> values) {
	        addCriterion("DEPT_ID in", values, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdNotIn(List<Long> values) {
	        addCriterion("DEPT_ID not in", values, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdBetween(Long value1, Long value2) {
	        addCriterion("DEPT_ID between", value1, value2, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDeptIdNotBetween(Long value1, Long value2) {
	        addCriterion("DEPT_ID not between", value1, value2, "deptId");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusIsNull() {
	        addCriterion("STATUS is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusIsNotNull() {
	        addCriterion("STATUS is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusEqualTo(String value) {
	        addCriterion("STATUS =", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotEqualTo(String value) {
	        addCriterion("STATUS <>", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusGreaterThan(String value) {
	        addCriterion("STATUS >", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusGreaterThanOrEqualTo(String value) {
	        addCriterion("STATUS >=", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLessThan(String value) {
	        addCriterion("STATUS <", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLessThanOrEqualTo(String value) {
	        addCriterion("STATUS <=", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLike(String value) {
	        addCriterion("STATUS like", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotLike(String value) {
	        addCriterion("STATUS not like", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusIn(List<String> values) {
	        addCriterion("STATUS in", values, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotIn(List<String> values) {
	        addCriterion("STATUS not in", values, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusBetween(String value1, String value2) {
	        addCriterion("STATUS between", value1, value2, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotBetween(String value1, String value2) {
	        addCriterion("STATUS not between", value1, value2, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIsNull() {
	        addCriterion("NAME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIsNotNull() {
	        addCriterion("NAME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameEqualTo(String value) {
	        addCriterion("NAME =", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotEqualTo(String value) {
	        addCriterion("NAME <>", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThan(String value) {
	        addCriterion("NAME >", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThanOrEqualTo(String value) {
	        addCriterion("NAME >=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThan(String value) {
	        addCriterion("NAME <", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThanOrEqualTo(String value) {
	        addCriterion("NAME <=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLike(String value) {
	        addCriterion("NAME like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotLike(String value) {
	        addCriterion("NAME not like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIn(List<String> values) {
	        addCriterion("NAME in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotIn(List<String> values) {
	        addCriterion("NAME not in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameBetween(String value1, String value2) {
	        addCriterion("NAME between", value1, value2, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotBetween(String value1, String value2) {
	        addCriterion("NAME not between", value1, value2, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeIsNull() {
	        addCriterion("USER_TYPE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeIsNotNull() {
	        addCriterion("USER_TYPE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeEqualTo(String value) {
	        addCriterion("USER_TYPE =", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeNotEqualTo(String value) {
	        addCriterion("USER_TYPE <>", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeGreaterThan(String value) {
	        addCriterion("USER_TYPE >", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
	        addCriterion("USER_TYPE >=", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeLessThan(String value) {
	        addCriterion("USER_TYPE <", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeLessThanOrEqualTo(String value) {
	        addCriterion("USER_TYPE <=", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeLike(String value) {
	        addCriterion("USER_TYPE like", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeNotLike(String value) {
	        addCriterion("USER_TYPE not like", value, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeIn(List<String> values) {
	        addCriterion("USER_TYPE in", values, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeNotIn(List<String> values) {
	        addCriterion("USER_TYPE not in", values, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeBetween(String value1, String value2) {
	        addCriterion("USER_TYPE between", value1, value2, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserTypeNotBetween(String value1, String value2) {
	        addCriterion("USER_TYPE not between", value1, value2, "userType");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedIsNull() {
	        addCriterion("IS_PASSWORD_CHANGED is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedIsNotNull() {
	        addCriterion("IS_PASSWORD_CHANGED is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedEqualTo(String value) {
	        addCriterion("IS_PASSWORD_CHANGED =", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedNotEqualTo(String value) {
	        addCriterion("IS_PASSWORD_CHANGED <>", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedGreaterThan(String value) {
	        addCriterion("IS_PASSWORD_CHANGED >", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedGreaterThanOrEqualTo(String value) {
	        addCriterion("IS_PASSWORD_CHANGED >=", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedLessThan(String value) {
	        addCriterion("IS_PASSWORD_CHANGED <", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedLessThanOrEqualTo(String value) {
	        addCriterion("IS_PASSWORD_CHANGED <=", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedLike(String value) {
	        addCriterion("IS_PASSWORD_CHANGED like", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedNotLike(String value) {
	        addCriterion("IS_PASSWORD_CHANGED not like", value, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedIn(List<String> values) {
	        addCriterion("IS_PASSWORD_CHANGED in", values, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedNotIn(List<String> values) {
	        addCriterion("IS_PASSWORD_CHANGED not in", values, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedBetween(String value1, String value2) {
	        addCriterion("IS_PASSWORD_CHANGED between", value1, value2, "isPasswordChanged");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsPasswordChangedNotBetween(String value1, String value2) {
	        addCriterion("IS_PASSWORD_CHANGED not between", value1, value2, "isPasswordChanged");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table sys_user
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * sys_user
	     * @author Small 2018-09-29
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