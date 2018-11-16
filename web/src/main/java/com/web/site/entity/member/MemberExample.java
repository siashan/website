package com.web.site.entity.member;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.web.site.common.orm.Page;

public class MemberExample {

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
	public MemberExample() {
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
	     * member
	     * @author Small 2018-10-26
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
	        addCriterion("id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIsNotNull() {
	        addCriterion("id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdEqualTo(Long value) {
	        addCriterion("id =", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotEqualTo(Long value) {
	        addCriterion("id <>", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThan(Long value) {
	        addCriterion("id >", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("id >=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThan(Long value) {
	        addCriterion("id <", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThanOrEqualTo(Long value) {
	        addCriterion("id <=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIn(List<Long> values) {
	        addCriterion("id in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotIn(List<Long> values) {
	        addCriterion("id not in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdBetween(Long value1, Long value2) {
	        addCriterion("id between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotBetween(Long value1, Long value2) {
	        addCriterion("id not between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNull() {
	        addCriterion("create_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNotNull() {
	        addCriterion("create_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeEqualTo(Date value) {
	        addCriterion("create_time =", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotEqualTo(Date value) {
	        addCriterion("create_time <>", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThan(Date value) {
	        addCriterion("create_time >", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("create_time >=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThan(Date value) {
	        addCriterion("create_time <", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
	        addCriterion("create_time <=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIn(List<Date> values) {
	        addCriterion("create_time in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotIn(List<Date> values) {
	        addCriterion("create_time not in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeBetween(Date value1, Date value2) {
	        addCriterion("create_time between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
	        addCriterion("create_time not between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameIsNull() {
	        addCriterion("nick_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameIsNotNull() {
	        addCriterion("nick_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameEqualTo(String value) {
	        addCriterion("nick_name =", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameNotEqualTo(String value) {
	        addCriterion("nick_name <>", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameGreaterThan(String value) {
	        addCriterion("nick_name >", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameGreaterThanOrEqualTo(String value) {
	        addCriterion("nick_name >=", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameLessThan(String value) {
	        addCriterion("nick_name <", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameLessThanOrEqualTo(String value) {
	        addCriterion("nick_name <=", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameLike(String value) {
	        addCriterion("nick_name like", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameNotLike(String value) {
	        addCriterion("nick_name not like", value, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameIn(List<String> values) {
	        addCriterion("nick_name in", values, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameNotIn(List<String> values) {
	        addCriterion("nick_name not in", values, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameBetween(String value1, String value2) {
	        addCriterion("nick_name between", value1, value2, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andNickNameNotBetween(String value1, String value2) {
	        addCriterion("nick_name not between", value1, value2, "nickName");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIsNull() {
	        addCriterion("mobile is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIsNotNull() {
	        addCriterion("mobile is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileEqualTo(String value) {
	        addCriterion("mobile =", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotEqualTo(String value) {
	        addCriterion("mobile <>", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileGreaterThan(String value) {
	        addCriterion("mobile >", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileGreaterThanOrEqualTo(String value) {
	        addCriterion("mobile >=", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLessThan(String value) {
	        addCriterion("mobile <", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLessThanOrEqualTo(String value) {
	        addCriterion("mobile <=", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLike(String value) {
	        addCriterion("mobile like", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotLike(String value) {
	        addCriterion("mobile not like", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIn(List<String> values) {
	        addCriterion("mobile in", values, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotIn(List<String> values) {
	        addCriterion("mobile not in", values, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileBetween(String value1, String value2) {
	        addCriterion("mobile between", value1, value2, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotBetween(String value1, String value2) {
	        addCriterion("mobile not between", value1, value2, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordIsNull() {
	        addCriterion("password is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordIsNotNull() {
	        addCriterion("password is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordEqualTo(String value) {
	        addCriterion("password =", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordNotEqualTo(String value) {
	        addCriterion("password <>", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordGreaterThan(String value) {
	        addCriterion("password >", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordGreaterThanOrEqualTo(String value) {
	        addCriterion("password >=", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordLessThan(String value) {
	        addCriterion("password <", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordLessThanOrEqualTo(String value) {
	        addCriterion("password <=", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordLike(String value) {
	        addCriterion("password like", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordNotLike(String value) {
	        addCriterion("password not like", value, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordIn(List<String> values) {
	        addCriterion("password in", values, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordNotIn(List<String> values) {
	        addCriterion("password not in", values, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordBetween(String value1, String value2) {
	        addCriterion("password between", value1, value2, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andPasswordNotBetween(String value1, String value2) {
	        addCriterion("password not between", value1, value2, "password");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgIsNull() {
	        addCriterion("header_img is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgIsNotNull() {
	        addCriterion("header_img is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgEqualTo(String value) {
	        addCriterion("header_img =", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgNotEqualTo(String value) {
	        addCriterion("header_img <>", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgGreaterThan(String value) {
	        addCriterion("header_img >", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgGreaterThanOrEqualTo(String value) {
	        addCriterion("header_img >=", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgLessThan(String value) {
	        addCriterion("header_img <", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgLessThanOrEqualTo(String value) {
	        addCriterion("header_img <=", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgLike(String value) {
	        addCriterion("header_img like", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgNotLike(String value) {
	        addCriterion("header_img not like", value, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgIn(List<String> values) {
	        addCriterion("header_img in", values, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgNotIn(List<String> values) {
	        addCriterion("header_img not in", values, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgBetween(String value1, String value2) {
	        addCriterion("header_img between", value1, value2, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andHeaderImgNotBetween(String value1, String value2) {
	        addCriterion("header_img not between", value1, value2, "headerImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidIsNull() {
	        addCriterion("wx_openid is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidIsNotNull() {
	        addCriterion("wx_openid is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidEqualTo(String value) {
	        addCriterion("wx_openid =", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidNotEqualTo(String value) {
	        addCriterion("wx_openid <>", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidGreaterThan(String value) {
	        addCriterion("wx_openid >", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
	        addCriterion("wx_openid >=", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidLessThan(String value) {
	        addCriterion("wx_openid <", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidLessThanOrEqualTo(String value) {
	        addCriterion("wx_openid <=", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidLike(String value) {
	        addCriterion("wx_openid like", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidNotLike(String value) {
	        addCriterion("wx_openid not like", value, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidIn(List<String> values) {
	        addCriterion("wx_openid in", values, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidNotIn(List<String> values) {
	        addCriterion("wx_openid not in", values, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidBetween(String value1, String value2) {
	        addCriterion("wx_openid between", value1, value2, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andWxOpenidNotBetween(String value1, String value2) {
	        addCriterion("wx_openid not between", value1, value2, "wxOpenid");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdIsNull() {
	        addCriterion("recommend_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdIsNotNull() {
	        addCriterion("recommend_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdEqualTo(Long value) {
	        addCriterion("recommend_id =", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdNotEqualTo(Long value) {
	        addCriterion("recommend_id <>", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdGreaterThan(Long value) {
	        addCriterion("recommend_id >", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("recommend_id >=", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdLessThan(Long value) {
	        addCriterion("recommend_id <", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdLessThanOrEqualTo(Long value) {
	        addCriterion("recommend_id <=", value, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdIn(List<Long> values) {
	        addCriterion("recommend_id in", values, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdNotIn(List<Long> values) {
	        addCriterion("recommend_id not in", values, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdBetween(Long value1, Long value2) {
	        addCriterion("recommend_id between", value1, value2, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRecommendIdNotBetween(Long value1, Long value2) {
	        addCriterion("recommend_id not between", value1, value2, "recommendId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIsNull() {
	        addCriterion("salt is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIsNotNull() {
	        addCriterion("salt is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltEqualTo(String value) {
	        addCriterion("salt =", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotEqualTo(String value) {
	        addCriterion("salt <>", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltGreaterThan(String value) {
	        addCriterion("salt >", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltGreaterThanOrEqualTo(String value) {
	        addCriterion("salt >=", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLessThan(String value) {
	        addCriterion("salt <", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLessThanOrEqualTo(String value) {
	        addCriterion("salt <=", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltLike(String value) {
	        addCriterion("salt like", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotLike(String value) {
	        addCriterion("salt not like", value, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltIn(List<String> values) {
	        addCriterion("salt in", values, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotIn(List<String> values) {
	        addCriterion("salt not in", values, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltBetween(String value1, String value2) {
	        addCriterion("salt between", value1, value2, "salt");
	        return (Criteria) this;
	    }
	
	    public Criteria andSaltNotBetween(String value1, String value2) {
	        addCriterion("salt not between", value1, value2, "salt");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table member
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * member
	     * @author Small 2018-10-26
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