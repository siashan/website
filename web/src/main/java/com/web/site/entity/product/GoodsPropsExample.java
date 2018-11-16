package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class GoodsPropsExample {

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
	public GoodsPropsExample() {
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
	     * goods_props
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
	
	    public Criteria andGoodsIdIsNull() {
	        addCriterion("goods_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdIsNotNull() {
	        addCriterion("goods_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdEqualTo(Long value) {
	        addCriterion("goods_id =", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotEqualTo(Long value) {
	        addCriterion("goods_id <>", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdGreaterThan(Long value) {
	        addCriterion("goods_id >", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("goods_id >=", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdLessThan(Long value) {
	        addCriterion("goods_id <", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
	        addCriterion("goods_id <=", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdIn(List<Long> values) {
	        addCriterion("goods_id in", values, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotIn(List<Long> values) {
	        addCriterion("goods_id not in", values, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdBetween(Long value1, Long value2) {
	        addCriterion("goods_id between", value1, value2, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
	        addCriterion("goods_id not between", value1, value2, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdIsNull() {
	        addCriterion("prop_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdIsNotNull() {
	        addCriterion("prop_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdEqualTo(Long value) {
	        addCriterion("prop_id =", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdNotEqualTo(Long value) {
	        addCriterion("prop_id <>", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdGreaterThan(Long value) {
	        addCriterion("prop_id >", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("prop_id >=", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdLessThan(Long value) {
	        addCriterion("prop_id <", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdLessThanOrEqualTo(Long value) {
	        addCriterion("prop_id <=", value, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdIn(List<Long> values) {
	        addCriterion("prop_id in", values, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdNotIn(List<Long> values) {
	        addCriterion("prop_id not in", values, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdBetween(Long value1, Long value2) {
	        addCriterion("prop_id between", value1, value2, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropIdNotBetween(Long value1, Long value2) {
	        addCriterion("prop_id not between", value1, value2, "propId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueIsNull() {
	        addCriterion("prop_value is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueIsNotNull() {
	        addCriterion("prop_value is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueEqualTo(String value) {
	        addCriterion("prop_value =", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueNotEqualTo(String value) {
	        addCriterion("prop_value <>", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueGreaterThan(String value) {
	        addCriterion("prop_value >", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueGreaterThanOrEqualTo(String value) {
	        addCriterion("prop_value >=", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueLessThan(String value) {
	        addCriterion("prop_value <", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueLessThanOrEqualTo(String value) {
	        addCriterion("prop_value <=", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueLike(String value) {
	        addCriterion("prop_value like", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueNotLike(String value) {
	        addCriterion("prop_value not like", value, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueIn(List<String> values) {
	        addCriterion("prop_value in", values, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueNotIn(List<String> values) {
	        addCriterion("prop_value not in", values, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueBetween(String value1, String value2) {
	        addCriterion("prop_value between", value1, value2, "propValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropValueNotBetween(String value1, String value2) {
	        addCriterion("prop_value not between", value1, value2, "propValue");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table goods_props
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * goods_props
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