package com.web.site.entity.promotion;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.web.site.common.orm.Page;

public class ActivityExample {

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
	public ActivityExample() {
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
	     * activity
	     * @author Small 2018-11-28
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
	
	    public Criteria andActivityNameIsNull() {
	        addCriterion("activity_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameIsNotNull() {
	        addCriterion("activity_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameEqualTo(String value) {
	        addCriterion("activity_name =", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameNotEqualTo(String value) {
	        addCriterion("activity_name <>", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameGreaterThan(String value) {
	        addCriterion("activity_name >", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
	        addCriterion("activity_name >=", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameLessThan(String value) {
	        addCriterion("activity_name <", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameLessThanOrEqualTo(String value) {
	        addCriterion("activity_name <=", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameLike(String value) {
	        addCriterion("activity_name like", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameNotLike(String value) {
	        addCriterion("activity_name not like", value, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameIn(List<String> values) {
	        addCriterion("activity_name in", values, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameNotIn(List<String> values) {
	        addCriterion("activity_name not in", values, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameBetween(String value1, String value2) {
	        addCriterion("activity_name between", value1, value2, "activityName");
	        return (Criteria) this;
	    }
	
	    public Criteria andActivityNameNotBetween(String value1, String value2) {
	        addCriterion("activity_name not between", value1, value2, "activityName");
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
	
	    public Criteria andStartTimeIsNull() {
	        addCriterion("start_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeIsNotNull() {
	        addCriterion("start_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeEqualTo(Date value) {
	        addCriterion("start_time =", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeNotEqualTo(Date value) {
	        addCriterion("start_time <>", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeGreaterThan(Date value) {
	        addCriterion("start_time >", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("start_time >=", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeLessThan(Date value) {
	        addCriterion("start_time <", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeLessThanOrEqualTo(Date value) {
	        addCriterion("start_time <=", value, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeIn(List<Date> values) {
	        addCriterion("start_time in", values, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeNotIn(List<Date> values) {
	        addCriterion("start_time not in", values, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeBetween(Date value1, Date value2) {
	        addCriterion("start_time between", value1, value2, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andStartTimeNotBetween(Date value1, Date value2) {
	        addCriterion("start_time not between", value1, value2, "startTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeIsNull() {
	        addCriterion("end_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeIsNotNull() {
	        addCriterion("end_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeEqualTo(Date value) {
	        addCriterion("end_time =", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeNotEqualTo(Date value) {
	        addCriterion("end_time <>", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeGreaterThan(Date value) {
	        addCriterion("end_time >", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("end_time >=", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeLessThan(Date value) {
	        addCriterion("end_time <", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeLessThanOrEqualTo(Date value) {
	        addCriterion("end_time <=", value, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeIn(List<Date> values) {
	        addCriterion("end_time in", values, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeNotIn(List<Date> values) {
	        addCriterion("end_time not in", values, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeBetween(Date value1, Date value2) {
	        addCriterion("end_time between", value1, value2, "endTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andEndTimeNotBetween(Date value1, Date value2) {
	        addCriterion("end_time not between", value1, value2, "endTime");
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
	
	    public Criteria andRemarkIsNull() {
	        addCriterion("remark is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkIsNotNull() {
	        addCriterion("remark is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkEqualTo(String value) {
	        addCriterion("remark =", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotEqualTo(String value) {
	        addCriterion("remark <>", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkGreaterThan(String value) {
	        addCriterion("remark >", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkGreaterThanOrEqualTo(String value) {
	        addCriterion("remark >=", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLessThan(String value) {
	        addCriterion("remark <", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLessThanOrEqualTo(String value) {
	        addCriterion("remark <=", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLike(String value) {
	        addCriterion("remark like", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotLike(String value) {
	        addCriterion("remark not like", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkIn(List<String> values) {
	        addCriterion("remark in", values, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotIn(List<String> values) {
	        addCriterion("remark not in", values, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkBetween(String value1, String value2) {
	        addCriterion("remark between", value1, value2, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotBetween(String value1, String value2) {
	        addCriterion("remark not between", value1, value2, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeIsNull() {
	        addCriterion("act_type is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeIsNotNull() {
	        addCriterion("act_type is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeEqualTo(String value) {
	        addCriterion("act_type =", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeNotEqualTo(String value) {
	        addCriterion("act_type <>", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeGreaterThan(String value) {
	        addCriterion("act_type >", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeGreaterThanOrEqualTo(String value) {
	        addCriterion("act_type >=", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeLessThan(String value) {
	        addCriterion("act_type <", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeLessThanOrEqualTo(String value) {
	        addCriterion("act_type <=", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeLike(String value) {
	        addCriterion("act_type like", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeNotLike(String value) {
	        addCriterion("act_type not like", value, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeIn(List<String> values) {
	        addCriterion("act_type in", values, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeNotIn(List<String> values) {
	        addCriterion("act_type not in", values, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeBetween(String value1, String value2) {
	        addCriterion("act_type between", value1, value2, "actType");
	        return (Criteria) this;
	    }
	
	    public Criteria andActTypeNotBetween(String value1, String value2) {
	        addCriterion("act_type not between", value1, value2, "actType");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table activity
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * activity
	     * @author Small 2018-11-28
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