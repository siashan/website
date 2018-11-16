package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {

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
	public CategoryExample() {
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
	     * category
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
	
	    public Criteria andParentIdIsNull() {
	        addCriterion("parent_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIsNotNull() {
	        addCriterion("parent_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdEqualTo(Long value) {
	        addCriterion("parent_id =", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotEqualTo(Long value) {
	        addCriterion("parent_id <>", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThan(Long value) {
	        addCriterion("parent_id >", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("parent_id >=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThan(Long value) {
	        addCriterion("parent_id <", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThanOrEqualTo(Long value) {
	        addCriterion("parent_id <=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIn(List<Long> values) {
	        addCriterion("parent_id in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotIn(List<Long> values) {
	        addCriterion("parent_id not in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdBetween(Long value1, Long value2) {
	        addCriterion("parent_id between", value1, value2, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotBetween(Long value1, Long value2) {
	        addCriterion("parent_id not between", value1, value2, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameIsNull() {
	        addCriterion("cat_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameIsNotNull() {
	        addCriterion("cat_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameEqualTo(String value) {
	        addCriterion("cat_name =", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameNotEqualTo(String value) {
	        addCriterion("cat_name <>", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameGreaterThan(String value) {
	        addCriterion("cat_name >", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameGreaterThanOrEqualTo(String value) {
	        addCriterion("cat_name >=", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameLessThan(String value) {
	        addCriterion("cat_name <", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameLessThanOrEqualTo(String value) {
	        addCriterion("cat_name <=", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameLike(String value) {
	        addCriterion("cat_name like", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameNotLike(String value) {
	        addCriterion("cat_name not like", value, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameIn(List<String> values) {
	        addCriterion("cat_name in", values, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameNotIn(List<String> values) {
	        addCriterion("cat_name not in", values, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameBetween(String value1, String value2) {
	        addCriterion("cat_name between", value1, value2, "catName");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatNameNotBetween(String value1, String value2) {
	        addCriterion("cat_name not between", value1, value2, "catName");
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
	
	    public Criteria andCatLevelIsNull() {
	        addCriterion("cat_level is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelIsNotNull() {
	        addCriterion("cat_level is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelEqualTo(String value) {
	        addCriterion("cat_level =", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelNotEqualTo(String value) {
	        addCriterion("cat_level <>", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelGreaterThan(String value) {
	        addCriterion("cat_level >", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelGreaterThanOrEqualTo(String value) {
	        addCriterion("cat_level >=", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelLessThan(String value) {
	        addCriterion("cat_level <", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelLessThanOrEqualTo(String value) {
	        addCriterion("cat_level <=", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelLike(String value) {
	        addCriterion("cat_level like", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelNotLike(String value) {
	        addCriterion("cat_level not like", value, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelIn(List<String> values) {
	        addCriterion("cat_level in", values, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelNotIn(List<String> values) {
	        addCriterion("cat_level not in", values, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelBetween(String value1, String value2) {
	        addCriterion("cat_level between", value1, value2, "catLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatLevelNotBetween(String value1, String value2) {
	        addCriterion("cat_level not between", value1, value2, "catLevel");
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
	
	    public Criteria andCatPathIsNull() {
	        addCriterion("cat_path is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathIsNotNull() {
	        addCriterion("cat_path is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathEqualTo(String value) {
	        addCriterion("cat_path =", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathNotEqualTo(String value) {
	        addCriterion("cat_path <>", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathGreaterThan(String value) {
	        addCriterion("cat_path >", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathGreaterThanOrEqualTo(String value) {
	        addCriterion("cat_path >=", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathLessThan(String value) {
	        addCriterion("cat_path <", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathLessThanOrEqualTo(String value) {
	        addCriterion("cat_path <=", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathLike(String value) {
	        addCriterion("cat_path like", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathNotLike(String value) {
	        addCriterion("cat_path not like", value, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathIn(List<String> values) {
	        addCriterion("cat_path in", values, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathNotIn(List<String> values) {
	        addCriterion("cat_path not in", values, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathBetween(String value1, String value2) {
	        addCriterion("cat_path between", value1, value2, "catPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatPathNotBetween(String value1, String value2) {
	        addCriterion("cat_path not between", value1, value2, "catPath");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table category
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * category
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