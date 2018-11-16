package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class SpecValuesExample {

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
	public SpecValuesExample() {
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
	     * spec_values
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
	
	    public Criteria andSpecIdIsNull() {
	        addCriterion("spec_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdIsNotNull() {
	        addCriterion("spec_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdEqualTo(Long value) {
	        addCriterion("spec_id =", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdNotEqualTo(Long value) {
	        addCriterion("spec_id <>", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdGreaterThan(Long value) {
	        addCriterion("spec_id >", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("spec_id >=", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdLessThan(Long value) {
	        addCriterion("spec_id <", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdLessThanOrEqualTo(Long value) {
	        addCriterion("spec_id <=", value, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdIn(List<Long> values) {
	        addCriterion("spec_id in", values, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdNotIn(List<Long> values) {
	        addCriterion("spec_id not in", values, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdBetween(Long value1, Long value2) {
	        addCriterion("spec_id between", value1, value2, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecIdNotBetween(Long value1, Long value2) {
	        addCriterion("spec_id not between", value1, value2, "specId");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueIsNull() {
	        addCriterion("spec_value is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueIsNotNull() {
	        addCriterion("spec_value is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueEqualTo(String value) {
	        addCriterion("spec_value =", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueNotEqualTo(String value) {
	        addCriterion("spec_value <>", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueGreaterThan(String value) {
	        addCriterion("spec_value >", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueGreaterThanOrEqualTo(String value) {
	        addCriterion("spec_value >=", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueLessThan(String value) {
	        addCriterion("spec_value <", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueLessThanOrEqualTo(String value) {
	        addCriterion("spec_value <=", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueLike(String value) {
	        addCriterion("spec_value like", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueNotLike(String value) {
	        addCriterion("spec_value not like", value, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueIn(List<String> values) {
	        addCriterion("spec_value in", values, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueNotIn(List<String> values) {
	        addCriterion("spec_value not in", values, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueBetween(String value1, String value2) {
	        addCriterion("spec_value between", value1, value2, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecValueNotBetween(String value1, String value2) {
	        addCriterion("spec_value not between", value1, value2, "specValue");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgIsNull() {
	        addCriterion("spec_img is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgIsNotNull() {
	        addCriterion("spec_img is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgEqualTo(String value) {
	        addCriterion("spec_img =", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgNotEqualTo(String value) {
	        addCriterion("spec_img <>", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgGreaterThan(String value) {
	        addCriterion("spec_img >", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgGreaterThanOrEqualTo(String value) {
	        addCriterion("spec_img >=", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgLessThan(String value) {
	        addCriterion("spec_img <", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgLessThanOrEqualTo(String value) {
	        addCriterion("spec_img <=", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgLike(String value) {
	        addCriterion("spec_img like", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgNotLike(String value) {
	        addCriterion("spec_img not like", value, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgIn(List<String> values) {
	        addCriterion("spec_img in", values, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgNotIn(List<String> values) {
	        addCriterion("spec_img not in", values, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgBetween(String value1, String value2) {
	        addCriterion("spec_img between", value1, value2, "specImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecImgNotBetween(String value1, String value2) {
	        addCriterion("spec_img not between", value1, value2, "specImg");
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
	
	    public Criteria andInherentOrAddIsNull() {
	        addCriterion("inherent_or_add is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddIsNotNull() {
	        addCriterion("inherent_or_add is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddEqualTo(String value) {
	        addCriterion("inherent_or_add =", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddNotEqualTo(String value) {
	        addCriterion("inherent_or_add <>", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddGreaterThan(String value) {
	        addCriterion("inherent_or_add >", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddGreaterThanOrEqualTo(String value) {
	        addCriterion("inherent_or_add >=", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddLessThan(String value) {
	        addCriterion("inherent_or_add <", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddLessThanOrEqualTo(String value) {
	        addCriterion("inherent_or_add <=", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddLike(String value) {
	        addCriterion("inherent_or_add like", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddNotLike(String value) {
	        addCriterion("inherent_or_add not like", value, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddIn(List<String> values) {
	        addCriterion("inherent_or_add in", values, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddNotIn(List<String> values) {
	        addCriterion("inherent_or_add not in", values, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddBetween(String value1, String value2) {
	        addCriterion("inherent_or_add between", value1, value2, "inherentOrAdd");
	        return (Criteria) this;
	    }
	
	    public Criteria andInherentOrAddNotBetween(String value1, String value2) {
	        addCriterion("inherent_or_add not between", value1, value2, "inherentOrAdd");
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
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table spec_values
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * spec_values
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