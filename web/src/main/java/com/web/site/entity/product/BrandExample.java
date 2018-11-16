package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandExample {

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
	public BrandExample() {
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
	     * brand
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
	
	    public Criteria andEnNameIsNull() {
	        addCriterion("en_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameIsNotNull() {
	        addCriterion("en_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameEqualTo(String value) {
	        addCriterion("en_name =", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameNotEqualTo(String value) {
	        addCriterion("en_name <>", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameGreaterThan(String value) {
	        addCriterion("en_name >", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameGreaterThanOrEqualTo(String value) {
	        addCriterion("en_name >=", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameLessThan(String value) {
	        addCriterion("en_name <", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameLessThanOrEqualTo(String value) {
	        addCriterion("en_name <=", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameLike(String value) {
	        addCriterion("en_name like", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameNotLike(String value) {
	        addCriterion("en_name not like", value, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameIn(List<String> values) {
	        addCriterion("en_name in", values, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameNotIn(List<String> values) {
	        addCriterion("en_name not in", values, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameBetween(String value1, String value2) {
	        addCriterion("en_name between", value1, value2, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andEnNameNotBetween(String value1, String value2) {
	        addCriterion("en_name not between", value1, value2, "enName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameIsNull() {
	        addCriterion("ch_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameIsNotNull() {
	        addCriterion("ch_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameEqualTo(String value) {
	        addCriterion("ch_name =", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameNotEqualTo(String value) {
	        addCriterion("ch_name <>", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameGreaterThan(String value) {
	        addCriterion("ch_name >", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameGreaterThanOrEqualTo(String value) {
	        addCriterion("ch_name >=", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameLessThan(String value) {
	        addCriterion("ch_name <", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameLessThanOrEqualTo(String value) {
	        addCriterion("ch_name <=", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameLike(String value) {
	        addCriterion("ch_name like", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameNotLike(String value) {
	        addCriterion("ch_name not like", value, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameIn(List<String> values) {
	        addCriterion("ch_name in", values, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameNotIn(List<String> values) {
	        addCriterion("ch_name not in", values, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameBetween(String value1, String value2) {
	        addCriterion("ch_name between", value1, value2, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andChNameNotBetween(String value1, String value2) {
	        addCriterion("ch_name not between", value1, value2, "chName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespIsNull() {
	        addCriterion("desp is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespIsNotNull() {
	        addCriterion("desp is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespEqualTo(String value) {
	        addCriterion("desp =", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespNotEqualTo(String value) {
	        addCriterion("desp <>", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespGreaterThan(String value) {
	        addCriterion("desp >", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespGreaterThanOrEqualTo(String value) {
	        addCriterion("desp >=", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespLessThan(String value) {
	        addCriterion("desp <", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespLessThanOrEqualTo(String value) {
	        addCriterion("desp <=", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespLike(String value) {
	        addCriterion("desp like", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespNotLike(String value) {
	        addCriterion("desp not like", value, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespIn(List<String> values) {
	        addCriterion("desp in", values, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespNotIn(List<String> values) {
	        addCriterion("desp not in", values, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespBetween(String value1, String value2) {
	        addCriterion("desp between", value1, value2, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDespNotBetween(String value1, String value2) {
	        addCriterion("desp not between", value1, value2, "desp");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoIsNull() {
	        addCriterion("logo is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoIsNotNull() {
	        addCriterion("logo is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoEqualTo(String value) {
	        addCriterion("logo =", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoNotEqualTo(String value) {
	        addCriterion("logo <>", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoGreaterThan(String value) {
	        addCriterion("logo >", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoGreaterThanOrEqualTo(String value) {
	        addCriterion("logo >=", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoLessThan(String value) {
	        addCriterion("logo <", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoLessThanOrEqualTo(String value) {
	        addCriterion("logo <=", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoLike(String value) {
	        addCriterion("logo like", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoNotLike(String value) {
	        addCriterion("logo not like", value, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoIn(List<String> values) {
	        addCriterion("logo in", values, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoNotIn(List<String> values) {
	        addCriterion("logo not in", values, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoBetween(String value1, String value2) {
	        addCriterion("logo between", value1, value2, "logo");
	        return (Criteria) this;
	    }
	
	    public Criteria andLogoNotBetween(String value1, String value2) {
	        addCriterion("logo not between", value1, value2, "logo");
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
	
	    public Criteria andVersionIsNull() {
	        addCriterion("version is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionIsNotNull() {
	        addCriterion("version is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionEqualTo(Integer value) {
	        addCriterion("version =", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotEqualTo(Integer value) {
	        addCriterion("version <>", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionGreaterThan(Integer value) {
	        addCriterion("version >", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
	        addCriterion("version >=", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionLessThan(Integer value) {
	        addCriterion("version <", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionLessThanOrEqualTo(Integer value) {
	        addCriterion("version <=", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionIn(List<Integer> values) {
	        addCriterion("version in", values, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotIn(List<Integer> values) {
	        addCriterion("version not in", values, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionBetween(Integer value1, Integer value2) {
	        addCriterion("version between", value1, value2, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotBetween(Integer value1, Integer value2) {
	        addCriterion("version not between", value1, value2, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIsNull() {
	        addCriterion("url is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIsNotNull() {
	        addCriterion("url is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlEqualTo(String value) {
	        addCriterion("url =", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotEqualTo(String value) {
	        addCriterion("url <>", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlGreaterThan(String value) {
	        addCriterion("url >", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlGreaterThanOrEqualTo(String value) {
	        addCriterion("url >=", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLessThan(String value) {
	        addCriterion("url <", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLessThanOrEqualTo(String value) {
	        addCriterion("url <=", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLike(String value) {
	        addCriterion("url like", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotLike(String value) {
	        addCriterion("url not like", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIn(List<String> values) {
	        addCriterion("url in", values, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotIn(List<String> values) {
	        addCriterion("url not in", values, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlBetween(String value1, String value2) {
	        addCriterion("url between", value1, value2, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotBetween(String value1, String value2) {
	        addCriterion("url not between", value1, value2, "url");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table brand
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * brand
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