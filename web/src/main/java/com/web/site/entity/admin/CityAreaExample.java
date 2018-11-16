package com.web.site.entity.admin;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class CityAreaExample {

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
	public CityAreaExample() {
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
	     * city_area
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
	
	    public Criteria andAreaCodeIsNull() {
	        addCriterion("area_code is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeIsNotNull() {
	        addCriterion("area_code is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeEqualTo(String value) {
	        addCriterion("area_code =", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeNotEqualTo(String value) {
	        addCriterion("area_code <>", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeGreaterThan(String value) {
	        addCriterion("area_code >", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("area_code >=", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeLessThan(String value) {
	        addCriterion("area_code <", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeLessThanOrEqualTo(String value) {
	        addCriterion("area_code <=", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeLike(String value) {
	        addCriterion("area_code like", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeNotLike(String value) {
	        addCriterion("area_code not like", value, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeIn(List<String> values) {
	        addCriterion("area_code in", values, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeNotIn(List<String> values) {
	        addCriterion("area_code not in", values, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeBetween(String value1, String value2) {
	        addCriterion("area_code between", value1, value2, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaCodeNotBetween(String value1, String value2) {
	        addCriterion("area_code not between", value1, value2, "areaCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameIsNull() {
	        addCriterion("area_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameIsNotNull() {
	        addCriterion("area_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameEqualTo(String value) {
	        addCriterion("area_name =", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameNotEqualTo(String value) {
	        addCriterion("area_name <>", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameGreaterThan(String value) {
	        addCriterion("area_name >", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
	        addCriterion("area_name >=", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameLessThan(String value) {
	        addCriterion("area_name <", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameLessThanOrEqualTo(String value) {
	        addCriterion("area_name <=", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameLike(String value) {
	        addCriterion("area_name like", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameNotLike(String value) {
	        addCriterion("area_name not like", value, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameIn(List<String> values) {
	        addCriterion("area_name in", values, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameNotIn(List<String> values) {
	        addCriterion("area_name not in", values, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameBetween(String value1, String value2) {
	        addCriterion("area_name between", value1, value2, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaNameNotBetween(String value1, String value2) {
	        addCriterion("area_name not between", value1, value2, "areaName");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelIsNull() {
	        addCriterion("area_level is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelIsNotNull() {
	        addCriterion("area_level is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelEqualTo(String value) {
	        addCriterion("area_level =", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelNotEqualTo(String value) {
	        addCriterion("area_level <>", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelGreaterThan(String value) {
	        addCriterion("area_level >", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelGreaterThanOrEqualTo(String value) {
	        addCriterion("area_level >=", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelLessThan(String value) {
	        addCriterion("area_level <", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelLessThanOrEqualTo(String value) {
	        addCriterion("area_level <=", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelLike(String value) {
	        addCriterion("area_level like", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelNotLike(String value) {
	        addCriterion("area_level not like", value, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelIn(List<String> values) {
	        addCriterion("area_level in", values, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelNotIn(List<String> values) {
	        addCriterion("area_level not in", values, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelBetween(String value1, String value2) {
	        addCriterion("area_level between", value1, value2, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaLevelNotBetween(String value1, String value2) {
	        addCriterion("area_level not between", value1, value2, "areaLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeIsNull() {
	        addCriterion("parent_code is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeIsNotNull() {
	        addCriterion("parent_code is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeEqualTo(String value) {
	        addCriterion("parent_code =", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeNotEqualTo(String value) {
	        addCriterion("parent_code <>", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeGreaterThan(String value) {
	        addCriterion("parent_code >", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("parent_code >=", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeLessThan(String value) {
	        addCriterion("parent_code <", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeLessThanOrEqualTo(String value) {
	        addCriterion("parent_code <=", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeLike(String value) {
	        addCriterion("parent_code like", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeNotLike(String value) {
	        addCriterion("parent_code not like", value, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeIn(List<String> values) {
	        addCriterion("parent_code in", values, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeNotIn(List<String> values) {
	        addCriterion("parent_code not in", values, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeBetween(String value1, String value2) {
	        addCriterion("parent_code between", value1, value2, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentCodeNotBetween(String value1, String value2) {
	        addCriterion("parent_code not between", value1, value2, "parentCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIsNull() {
	        addCriterion("zip_code is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIsNotNull() {
	        addCriterion("zip_code is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeEqualTo(String value) {
	        addCriterion("zip_code =", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotEqualTo(String value) {
	        addCriterion("zip_code <>", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeGreaterThan(String value) {
	        addCriterion("zip_code >", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("zip_code >=", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLessThan(String value) {
	        addCriterion("zip_code <", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLessThanOrEqualTo(String value) {
	        addCriterion("zip_code <=", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLike(String value) {
	        addCriterion("zip_code like", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotLike(String value) {
	        addCriterion("zip_code not like", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIn(List<String> values) {
	        addCriterion("zip_code in", values, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotIn(List<String> values) {
	        addCriterion("zip_code not in", values, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeBetween(String value1, String value2) {
	        addCriterion("zip_code between", value1, value2, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotBetween(String value1, String value2) {
	        addCriterion("zip_code not between", value1, value2, "zipCode");
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
	
	    public Criteria andVersionEqualTo(Byte value) {
	        addCriterion("version =", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotEqualTo(Byte value) {
	        addCriterion("version <>", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionGreaterThan(Byte value) {
	        addCriterion("version >", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionGreaterThanOrEqualTo(Byte value) {
	        addCriterion("version >=", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionLessThan(Byte value) {
	        addCriterion("version <", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionLessThanOrEqualTo(Byte value) {
	        addCriterion("version <=", value, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionIn(List<Byte> values) {
	        addCriterion("version in", values, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotIn(List<Byte> values) {
	        addCriterion("version not in", values, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionBetween(Byte value1, Byte value2) {
	        addCriterion("version between", value1, value2, "version");
	        return (Criteria) this;
	    }
	
	    public Criteria andVersionNotBetween(Byte value1, Byte value2) {
	        addCriterion("version not between", value1, value2, "version");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table city_area
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * city_area
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