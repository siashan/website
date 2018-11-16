package com.web.site.entity.sys;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class SysDictExample {

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
	public SysDictExample() {
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
	     * sys_dict
	     * @author Small 2018-07-27
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
	
	    public Criteria andDictGroupIsNull() {
	        addCriterion("DICT_GROUP is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupIsNotNull() {
	        addCriterion("DICT_GROUP is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupEqualTo(String value) {
	        addCriterion("DICT_GROUP =", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupNotEqualTo(String value) {
	        addCriterion("DICT_GROUP <>", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupGreaterThan(String value) {
	        addCriterion("DICT_GROUP >", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupGreaterThanOrEqualTo(String value) {
	        addCriterion("DICT_GROUP >=", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupLessThan(String value) {
	        addCriterion("DICT_GROUP <", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupLessThanOrEqualTo(String value) {
	        addCriterion("DICT_GROUP <=", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupLike(String value) {
	        addCriterion("DICT_GROUP like", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupNotLike(String value) {
	        addCriterion("DICT_GROUP not like", value, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupIn(List<String> values) {
	        addCriterion("DICT_GROUP in", values, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupNotIn(List<String> values) {
	        addCriterion("DICT_GROUP not in", values, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupBetween(String value1, String value2) {
	        addCriterion("DICT_GROUP between", value1, value2, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictGroupNotBetween(String value1, String value2) {
	        addCriterion("DICT_GROUP not between", value1, value2, "dictGroup");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeIsNull() {
	        addCriterion("DICT_CODE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeIsNotNull() {
	        addCriterion("DICT_CODE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeEqualTo(String value) {
	        addCriterion("DICT_CODE =", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeNotEqualTo(String value) {
	        addCriterion("DICT_CODE <>", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeGreaterThan(String value) {
	        addCriterion("DICT_CODE >", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("DICT_CODE >=", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeLessThan(String value) {
	        addCriterion("DICT_CODE <", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeLessThanOrEqualTo(String value) {
	        addCriterion("DICT_CODE <=", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeLike(String value) {
	        addCriterion("DICT_CODE like", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeNotLike(String value) {
	        addCriterion("DICT_CODE not like", value, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeIn(List<String> values) {
	        addCriterion("DICT_CODE in", values, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeNotIn(List<String> values) {
	        addCriterion("DICT_CODE not in", values, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeBetween(String value1, String value2) {
	        addCriterion("DICT_CODE between", value1, value2, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictCodeNotBetween(String value1, String value2) {
	        addCriterion("DICT_CODE not between", value1, value2, "dictCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameIsNull() {
	        addCriterion("DICT_NAME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameIsNotNull() {
	        addCriterion("DICT_NAME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameEqualTo(String value) {
	        addCriterion("DICT_NAME =", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameNotEqualTo(String value) {
	        addCriterion("DICT_NAME <>", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameGreaterThan(String value) {
	        addCriterion("DICT_NAME >", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameGreaterThanOrEqualTo(String value) {
	        addCriterion("DICT_NAME >=", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameLessThan(String value) {
	        addCriterion("DICT_NAME <", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameLessThanOrEqualTo(String value) {
	        addCriterion("DICT_NAME <=", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameLike(String value) {
	        addCriterion("DICT_NAME like", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameNotLike(String value) {
	        addCriterion("DICT_NAME not like", value, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameIn(List<String> values) {
	        addCriterion("DICT_NAME in", values, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameNotIn(List<String> values) {
	        addCriterion("DICT_NAME not in", values, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameBetween(String value1, String value2) {
	        addCriterion("DICT_NAME between", value1, value2, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictNameNotBetween(String value1, String value2) {
	        addCriterion("DICT_NAME not between", value1, value2, "dictName");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespIsNull() {
	        addCriterion("DICT_DESP is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespIsNotNull() {
	        addCriterion("DICT_DESP is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespEqualTo(String value) {
	        addCriterion("DICT_DESP =", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespNotEqualTo(String value) {
	        addCriterion("DICT_DESP <>", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespGreaterThan(String value) {
	        addCriterion("DICT_DESP >", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespGreaterThanOrEqualTo(String value) {
	        addCriterion("DICT_DESP >=", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespLessThan(String value) {
	        addCriterion("DICT_DESP <", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespLessThanOrEqualTo(String value) {
	        addCriterion("DICT_DESP <=", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespLike(String value) {
	        addCriterion("DICT_DESP like", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespNotLike(String value) {
	        addCriterion("DICT_DESP not like", value, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespIn(List<String> values) {
	        addCriterion("DICT_DESP in", values, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespNotIn(List<String> values) {
	        addCriterion("DICT_DESP not in", values, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespBetween(String value1, String value2) {
	        addCriterion("DICT_DESP between", value1, value2, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andDictDespNotBetween(String value1, String value2) {
	        addCriterion("DICT_DESP not between", value1, value2, "dictDesp");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIsNull() {
	        addCriterion("ORDER_BY is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIsNotNull() {
	        addCriterion("ORDER_BY is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByEqualTo(Short value) {
	        addCriterion("ORDER_BY =", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotEqualTo(Short value) {
	        addCriterion("ORDER_BY <>", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThan(Short value) {
	        addCriterion("ORDER_BY >", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThanOrEqualTo(Short value) {
	        addCriterion("ORDER_BY >=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThan(Short value) {
	        addCriterion("ORDER_BY <", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThanOrEqualTo(Short value) {
	        addCriterion("ORDER_BY <=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIn(List<Short> values) {
	        addCriterion("ORDER_BY in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotIn(List<Short> values) {
	        addCriterion("ORDER_BY not in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByBetween(Short value1, Short value2) {
	        addCriterion("ORDER_BY between", value1, value2, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotBetween(Short value1, Short value2) {
	        addCriterion("ORDER_BY not between", value1, value2, "orderBy");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table sys_dict
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * sys_dict
	     * @author Small 2018-07-27
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