package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductItemsExample {

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
	public ProductItemsExample() {
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
	     * product_items
	     * @author Small 2018-08-30
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
	
	    public Criteria andIdEqualTo(Integer value) {
	        addCriterion("id =", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotEqualTo(Integer value) {
	        addCriterion("id <>", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThan(Integer value) {
	        addCriterion("id >", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThanOrEqualTo(Integer value) {
	        addCriterion("id >=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThan(Integer value) {
	        addCriterion("id <", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThanOrEqualTo(Integer value) {
	        addCriterion("id <=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIn(List<Integer> values) {
	        addCriterion("id in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotIn(List<Integer> values) {
	        addCriterion("id not in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdBetween(Integer value1, Integer value2) {
	        addCriterion("id between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotBetween(Integer value1, Integer value2) {
	        addCriterion("id not between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIsNull() {
	        addCriterion("parent_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIsNotNull() {
	        addCriterion("parent_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdEqualTo(Integer value) {
	        addCriterion("parent_id =", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotEqualTo(Integer value) {
	        addCriterion("parent_id <>", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThan(Integer value) {
	        addCriterion("parent_id >", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
	        addCriterion("parent_id >=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThan(Integer value) {
	        addCriterion("parent_id <", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThanOrEqualTo(Integer value) {
	        addCriterion("parent_id <=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIn(List<Integer> values) {
	        addCriterion("parent_id in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotIn(List<Integer> values) {
	        addCriterion("parent_id not in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdBetween(Integer value1, Integer value2) {
	        addCriterion("parent_id between", value1, value2, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
	        addCriterion("parent_id not between", value1, value2, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameIsNull() {
	        addCriterion("item_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameIsNotNull() {
	        addCriterion("item_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameEqualTo(String value) {
	        addCriterion("item_name =", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameNotEqualTo(String value) {
	        addCriterion("item_name <>", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameGreaterThan(String value) {
	        addCriterion("item_name >", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameGreaterThanOrEqualTo(String value) {
	        addCriterion("item_name >=", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameLessThan(String value) {
	        addCriterion("item_name <", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameLessThanOrEqualTo(String value) {
	        addCriterion("item_name <=", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameLike(String value) {
	        addCriterion("item_name like", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameNotLike(String value) {
	        addCriterion("item_name not like", value, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameIn(List<String> values) {
	        addCriterion("item_name in", values, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameNotIn(List<String> values) {
	        addCriterion("item_name not in", values, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameBetween(String value1, String value2) {
	        addCriterion("item_name between", value1, value2, "itemName");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemNameNotBetween(String value1, String value2) {
	        addCriterion("item_name not between", value1, value2, "itemName");
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
	
	    public Criteria andItemLevelIsNull() {
	        addCriterion("item_level is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelIsNotNull() {
	        addCriterion("item_level is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelEqualTo(String value) {
	        addCriterion("item_level =", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelNotEqualTo(String value) {
	        addCriterion("item_level <>", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelGreaterThan(String value) {
	        addCriterion("item_level >", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelGreaterThanOrEqualTo(String value) {
	        addCriterion("item_level >=", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelLessThan(String value) {
	        addCriterion("item_level <", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelLessThanOrEqualTo(String value) {
	        addCriterion("item_level <=", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelLike(String value) {
	        addCriterion("item_level like", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelNotLike(String value) {
	        addCriterion("item_level not like", value, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelIn(List<String> values) {
	        addCriterion("item_level in", values, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelNotIn(List<String> values) {
	        addCriterion("item_level not in", values, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelBetween(String value1, String value2) {
	        addCriterion("item_level between", value1, value2, "itemLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemLevelNotBetween(String value1, String value2) {
	        addCriterion("item_level not between", value1, value2, "itemLevel");
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
	
	    public Criteria andItemPathIsNull() {
	        addCriterion("item_path is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathIsNotNull() {
	        addCriterion("item_path is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathEqualTo(String value) {
	        addCriterion("item_path =", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathNotEqualTo(String value) {
	        addCriterion("item_path <>", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathGreaterThan(String value) {
	        addCriterion("item_path >", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathGreaterThanOrEqualTo(String value) {
	        addCriterion("item_path >=", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathLessThan(String value) {
	        addCriterion("item_path <", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathLessThanOrEqualTo(String value) {
	        addCriterion("item_path <=", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathLike(String value) {
	        addCriterion("item_path like", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathNotLike(String value) {
	        addCriterion("item_path not like", value, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathIn(List<String> values) {
	        addCriterion("item_path in", values, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathNotIn(List<String> values) {
	        addCriterion("item_path not in", values, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathBetween(String value1, String value2) {
	        addCriterion("item_path between", value1, value2, "itemPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andItemPathNotBetween(String value1, String value2) {
	        addCriterion("item_path not between", value1, value2, "itemPath");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table product_items
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * product_items
	     * @author Small 2018-08-30
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