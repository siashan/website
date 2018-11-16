package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecExample {

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
	public SpecExample() {
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
	     * spec
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
	
	    public Criteria andSpecNameIsNull() {
	        addCriterion("spec_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameIsNotNull() {
	        addCriterion("spec_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameEqualTo(String value) {
	        addCriterion("spec_name =", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameNotEqualTo(String value) {
	        addCriterion("spec_name <>", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameGreaterThan(String value) {
	        addCriterion("spec_name >", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
	        addCriterion("spec_name >=", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameLessThan(String value) {
	        addCriterion("spec_name <", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameLessThanOrEqualTo(String value) {
	        addCriterion("spec_name <=", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameLike(String value) {
	        addCriterion("spec_name like", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameNotLike(String value) {
	        addCriterion("spec_name not like", value, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameIn(List<String> values) {
	        addCriterion("spec_name in", values, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameNotIn(List<String> values) {
	        addCriterion("spec_name not in", values, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameBetween(String value1, String value2) {
	        addCriterion("spec_name between", value1, value2, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecNameNotBetween(String value1, String value2) {
	        addCriterion("spec_name not between", value1, value2, "specName");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeIsNull() {
	        addCriterion("show_type is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeIsNotNull() {
	        addCriterion("show_type is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeEqualTo(String value) {
	        addCriterion("show_type =", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeNotEqualTo(String value) {
	        addCriterion("show_type <>", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeGreaterThan(String value) {
	        addCriterion("show_type >", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeGreaterThanOrEqualTo(String value) {
	        addCriterion("show_type >=", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeLessThan(String value) {
	        addCriterion("show_type <", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeLessThanOrEqualTo(String value) {
	        addCriterion("show_type <=", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeLike(String value) {
	        addCriterion("show_type like", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeNotLike(String value) {
	        addCriterion("show_type not like", value, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeIn(List<String> values) {
	        addCriterion("show_type in", values, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeNotIn(List<String> values) {
	        addCriterion("show_type not in", values, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeBetween(String value1, String value2) {
	        addCriterion("show_type between", value1, value2, "showType");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowTypeNotBetween(String value1, String value2) {
	        addCriterion("show_type not between", value1, value2, "showType");
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
	
	    public Criteria andShowStatusIsNull() {
	        addCriterion("show_status is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusIsNotNull() {
	        addCriterion("show_status is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusEqualTo(String value) {
	        addCriterion("show_status =", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusNotEqualTo(String value) {
	        addCriterion("show_status <>", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusGreaterThan(String value) {
	        addCriterion("show_status >", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusGreaterThanOrEqualTo(String value) {
	        addCriterion("show_status >=", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusLessThan(String value) {
	        addCriterion("show_status <", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusLessThanOrEqualTo(String value) {
	        addCriterion("show_status <=", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusLike(String value) {
	        addCriterion("show_status like", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusNotLike(String value) {
	        addCriterion("show_status not like", value, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusIn(List<String> values) {
	        addCriterion("show_status in", values, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusNotIn(List<String> values) {
	        addCriterion("show_status not in", values, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusBetween(String value1, String value2) {
	        addCriterion("show_status between", value1, value2, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowStatusNotBetween(String value1, String value2) {
	        addCriterion("show_status not between", value1, value2, "showStatus");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoIsNull() {
	        addCriterion("spec_meno is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoIsNotNull() {
	        addCriterion("spec_meno is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoEqualTo(String value) {
	        addCriterion("spec_meno =", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoNotEqualTo(String value) {
	        addCriterion("spec_meno <>", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoGreaterThan(String value) {
	        addCriterion("spec_meno >", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoGreaterThanOrEqualTo(String value) {
	        addCriterion("spec_meno >=", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoLessThan(String value) {
	        addCriterion("spec_meno <", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoLessThanOrEqualTo(String value) {
	        addCriterion("spec_meno <=", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoLike(String value) {
	        addCriterion("spec_meno like", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoNotLike(String value) {
	        addCriterion("spec_meno not like", value, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoIn(List<String> values) {
	        addCriterion("spec_meno in", values, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoNotIn(List<String> values) {
	        addCriterion("spec_meno not in", values, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoBetween(String value1, String value2) {
	        addCriterion("spec_meno between", value1, value2, "specMeno");
	        return (Criteria) this;
	    }
	
	    public Criteria andSpecMenoNotBetween(String value1, String value2) {
	        addCriterion("spec_meno not between", value1, value2, "specMeno");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table spec
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * spec
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