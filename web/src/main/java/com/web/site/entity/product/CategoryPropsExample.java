package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class CategoryPropsExample {

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
	public CategoryPropsExample() {
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
	     * category_props
	     * @author Small 2018-10-12
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
	
	    public Criteria andCategoryIdIsNull() {
	        addCriterion("category_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdIsNotNull() {
	        addCriterion("category_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdEqualTo(Long value) {
	        addCriterion("category_id =", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdNotEqualTo(Long value) {
	        addCriterion("category_id <>", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdGreaterThan(Long value) {
	        addCriterion("category_id >", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("category_id >=", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdLessThan(Long value) {
	        addCriterion("category_id <", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
	        addCriterion("category_id <=", value, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdIn(List<Long> values) {
	        addCriterion("category_id in", values, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdNotIn(List<Long> values) {
	        addCriterion("category_id not in", values, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdBetween(Long value1, Long value2) {
	        addCriterion("category_id between", value1, value2, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
	        addCriterion("category_id not between", value1, value2, "categoryId");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameIsNull() {
	        addCriterion("prop_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameIsNotNull() {
	        addCriterion("prop_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameEqualTo(String value) {
	        addCriterion("prop_name =", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameNotEqualTo(String value) {
	        addCriterion("prop_name <>", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameGreaterThan(String value) {
	        addCriterion("prop_name >", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameGreaterThanOrEqualTo(String value) {
	        addCriterion("prop_name >=", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameLessThan(String value) {
	        addCriterion("prop_name <", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameLessThanOrEqualTo(String value) {
	        addCriterion("prop_name <=", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameLike(String value) {
	        addCriterion("prop_name like", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameNotLike(String value) {
	        addCriterion("prop_name not like", value, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameIn(List<String> values) {
	        addCriterion("prop_name in", values, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameNotIn(List<String> values) {
	        addCriterion("prop_name not in", values, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameBetween(String value1, String value2) {
	        addCriterion("prop_name between", value1, value2, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andPropNameNotBetween(String value1, String value2) {
	        addCriterion("prop_name not between", value1, value2, "propName");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableIsNull() {
	        addCriterion("is_searchable is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableIsNotNull() {
	        addCriterion("is_searchable is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableEqualTo(String value) {
	        addCriterion("is_searchable =", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableNotEqualTo(String value) {
	        addCriterion("is_searchable <>", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableGreaterThan(String value) {
	        addCriterion("is_searchable >", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableGreaterThanOrEqualTo(String value) {
	        addCriterion("is_searchable >=", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableLessThan(String value) {
	        addCriterion("is_searchable <", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableLessThanOrEqualTo(String value) {
	        addCriterion("is_searchable <=", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableLike(String value) {
	        addCriterion("is_searchable like", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableNotLike(String value) {
	        addCriterion("is_searchable not like", value, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableIn(List<String> values) {
	        addCriterion("is_searchable in", values, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableNotIn(List<String> values) {
	        addCriterion("is_searchable not in", values, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableBetween(String value1, String value2) {
	        addCriterion("is_searchable between", value1, value2, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsSearchableNotBetween(String value1, String value2) {
	        addCriterion("is_searchable not between", value1, value2, "isSearchable");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrIsNull() {
	        addCriterion("option_arr is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrIsNotNull() {
	        addCriterion("option_arr is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrEqualTo(String value) {
	        addCriterion("option_arr =", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrNotEqualTo(String value) {
	        addCriterion("option_arr <>", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrGreaterThan(String value) {
	        addCriterion("option_arr >", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrGreaterThanOrEqualTo(String value) {
	        addCriterion("option_arr >=", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrLessThan(String value) {
	        addCriterion("option_arr <", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrLessThanOrEqualTo(String value) {
	        addCriterion("option_arr <=", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrLike(String value) {
	        addCriterion("option_arr like", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrNotLike(String value) {
	        addCriterion("option_arr not like", value, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrIn(List<String> values) {
	        addCriterion("option_arr in", values, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrNotIn(List<String> values) {
	        addCriterion("option_arr not in", values, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrBetween(String value1, String value2) {
	        addCriterion("option_arr between", value1, value2, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andOptionArrNotBetween(String value1, String value2) {
	        addCriterion("option_arr not between", value1, value2, "optionArr");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredIsNull() {
	        addCriterion("is_Required is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredIsNotNull() {
	        addCriterion("is_Required is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredEqualTo(String value) {
	        addCriterion("is_Required =", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredNotEqualTo(String value) {
	        addCriterion("is_Required <>", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredGreaterThan(String value) {
	        addCriterion("is_Required >", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredGreaterThanOrEqualTo(String value) {
	        addCriterion("is_Required >=", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredLessThan(String value) {
	        addCriterion("is_Required <", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredLessThanOrEqualTo(String value) {
	        addCriterion("is_Required <=", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredLike(String value) {
	        addCriterion("is_Required like", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredNotLike(String value) {
	        addCriterion("is_Required not like", value, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredIn(List<String> values) {
	        addCriterion("is_Required in", values, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredNotIn(List<String> values) {
	        addCriterion("is_Required not in", values, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredBetween(String value1, String value2) {
	        addCriterion("is_Required between", value1, value2, "isRequired");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsRequiredNotBetween(String value1, String value2) {
	        addCriterion("is_Required not between", value1, value2, "isRequired");
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
	
	    public Criteria andOrderByEqualTo(Integer value) {
	        addCriterion("order_by =", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotEqualTo(Integer value) {
	        addCriterion("order_by <>", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThan(Integer value) {
	        addCriterion("order_by >", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByGreaterThanOrEqualTo(Integer value) {
	        addCriterion("order_by >=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThan(Integer value) {
	        addCriterion("order_by <", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByLessThanOrEqualTo(Integer value) {
	        addCriterion("order_by <=", value, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByIn(List<Integer> values) {
	        addCriterion("order_by in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotIn(List<Integer> values) {
	        addCriterion("order_by not in", values, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByBetween(Integer value1, Integer value2) {
	        addCriterion("order_by between", value1, value2, "orderBy");
	        return (Criteria) this;
	    }
	
	    public Criteria andOrderByNotBetween(Integer value1, Integer value2) {
	        addCriterion("order_by not between", value1, value2, "orderBy");
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
	     * This class corresponds to the database table category_props
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * category_props
	     * @author Small 2018-10-12
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