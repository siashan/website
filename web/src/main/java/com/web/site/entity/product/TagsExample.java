package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class TagsExample {

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
	public TagsExample() {
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
	     * tags
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
	
	    public Criteria andTagNameIsNull() {
	        addCriterion("tag_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameIsNotNull() {
	        addCriterion("tag_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameEqualTo(String value) {
	        addCriterion("tag_name =", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameNotEqualTo(String value) {
	        addCriterion("tag_name <>", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameGreaterThan(String value) {
	        addCriterion("tag_name >", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameGreaterThanOrEqualTo(String value) {
	        addCriterion("tag_name >=", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameLessThan(String value) {
	        addCriterion("tag_name <", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameLessThanOrEqualTo(String value) {
	        addCriterion("tag_name <=", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameLike(String value) {
	        addCriterion("tag_name like", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameNotLike(String value) {
	        addCriterion("tag_name not like", value, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameIn(List<String> values) {
	        addCriterion("tag_name in", values, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameNotIn(List<String> values) {
	        addCriterion("tag_name not in", values, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameBetween(String value1, String value2) {
	        addCriterion("tag_name between", value1, value2, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagNameNotBetween(String value1, String value2) {
	        addCriterion("tag_name not between", value1, value2, "tagName");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeIsNull() {
	        addCriterion("tag_type is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeIsNotNull() {
	        addCriterion("tag_type is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeEqualTo(String value) {
	        addCriterion("tag_type =", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeNotEqualTo(String value) {
	        addCriterion("tag_type <>", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeGreaterThan(String value) {
	        addCriterion("tag_type >", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeGreaterThanOrEqualTo(String value) {
	        addCriterion("tag_type >=", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeLessThan(String value) {
	        addCriterion("tag_type <", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeLessThanOrEqualTo(String value) {
	        addCriterion("tag_type <=", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeLike(String value) {
	        addCriterion("tag_type like", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeNotLike(String value) {
	        addCriterion("tag_type not like", value, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeIn(List<String> values) {
	        addCriterion("tag_type in", values, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeNotIn(List<String> values) {
	        addCriterion("tag_type not in", values, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeBetween(String value1, String value2) {
	        addCriterion("tag_type between", value1, value2, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andTagTypeNotBetween(String value1, String value2) {
	        addCriterion("tag_type not between", value1, value2, "tagType");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIsNull() {
	        addCriterion("order_by is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIsNotNull() {
	        addCriterion("order_by is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByEqualTo(String value) {
	        addCriterion("order_by =", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotEqualTo(String value) {
	        addCriterion("order_by <>", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThan(String value) {
	        addCriterion("order_by >", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThanOrEqualTo(String value) {
	        addCriterion("order_by >=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThan(String value) {
	        addCriterion("order_by <", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThanOrEqualTo(String value) {
	        addCriterion("order_by <=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLike(String value) {
	        addCriterion("order_by like", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotLike(String value) {
	        addCriterion("order_by not like", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIn(List<String> values) {
	        addCriterion("order_by in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotIn(List<String> values) {
	        addCriterion("order_by not in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByBetween(String value1, String value2) {
	        addCriterion("order_by between", value1, value2, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotBetween(String value1, String value2) {
	        addCriterion("order_by not between", value1, value2, "orderBy");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table tags
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * tags
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