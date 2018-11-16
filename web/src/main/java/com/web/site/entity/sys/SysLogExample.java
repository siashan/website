package com.web.site.entity.sys;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {

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
	public SysLogExample() {
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
	     * sys_log
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
	
	    public Criteria andOperatorIsNull() {
	        addCriterion("OPERATOR is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorIsNotNull() {
	        addCriterion("OPERATOR is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorEqualTo(Long value) {
	        addCriterion("OPERATOR =", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorNotEqualTo(Long value) {
	        addCriterion("OPERATOR <>", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorGreaterThan(Long value) {
	        addCriterion("OPERATOR >", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorGreaterThanOrEqualTo(Long value) {
	        addCriterion("OPERATOR >=", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorLessThan(Long value) {
	        addCriterion("OPERATOR <", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorLessThanOrEqualTo(Long value) {
	        addCriterion("OPERATOR <=", value, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorIn(List<Long> values) {
	        addCriterion("OPERATOR in", values, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorNotIn(List<Long> values) {
	        addCriterion("OPERATOR not in", values, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorBetween(Long value1, Long value2) {
	        addCriterion("OPERATOR between", value1, value2, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andOperatorNotBetween(Long value1, Long value2) {
	        addCriterion("OPERATOR not between", value1, value2, "operator");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNull() {
	        addCriterion("CREATE_TIME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNotNull() {
	        addCriterion("CREATE_TIME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeEqualTo(Date value) {
	        addCriterion("CREATE_TIME =", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotEqualTo(Date value) {
	        addCriterion("CREATE_TIME <>", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThan(Date value) {
	        addCriterion("CREATE_TIME >", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("CREATE_TIME >=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThan(Date value) {
	        addCriterion("CREATE_TIME <", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
	        addCriterion("CREATE_TIME <=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIn(List<Date> values) {
	        addCriterion("CREATE_TIME in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotIn(List<Date> values) {
	        addCriterion("CREATE_TIME not in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeBetween(Date value1, Date value2) {
	        addCriterion("CREATE_TIME between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
	        addCriterion("CREATE_TIME not between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIsNull() {
	        addCriterion("URL is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIsNotNull() {
	        addCriterion("URL is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlEqualTo(String value) {
	        addCriterion("URL =", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotEqualTo(String value) {
	        addCriterion("URL <>", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlGreaterThan(String value) {
	        addCriterion("URL >", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlGreaterThanOrEqualTo(String value) {
	        addCriterion("URL >=", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLessThan(String value) {
	        addCriterion("URL <", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLessThanOrEqualTo(String value) {
	        addCriterion("URL <=", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlLike(String value) {
	        addCriterion("URL like", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotLike(String value) {
	        addCriterion("URL not like", value, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlIn(List<String> values) {
	        addCriterion("URL in", values, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotIn(List<String> values) {
	        addCriterion("URL not in", values, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlBetween(String value1, String value2) {
	        addCriterion("URL between", value1, value2, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andUrlNotBetween(String value1, String value2) {
	        addCriterion("URL not between", value1, value2, "url");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkIsNull() {
	        addCriterion("REMARK is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkIsNotNull() {
	        addCriterion("REMARK is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkEqualTo(String value) {
	        addCriterion("REMARK =", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotEqualTo(String value) {
	        addCriterion("REMARK <>", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkGreaterThan(String value) {
	        addCriterion("REMARK >", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkGreaterThanOrEqualTo(String value) {
	        addCriterion("REMARK >=", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLessThan(String value) {
	        addCriterion("REMARK <", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLessThanOrEqualTo(String value) {
	        addCriterion("REMARK <=", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkLike(String value) {
	        addCriterion("REMARK like", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotLike(String value) {
	        addCriterion("REMARK not like", value, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkIn(List<String> values) {
	        addCriterion("REMARK in", values, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotIn(List<String> values) {
	        addCriterion("REMARK not in", values, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkBetween(String value1, String value2) {
	        addCriterion("REMARK between", value1, value2, "remark");
	        return (Criteria) this;
	    }
	
	    public Criteria andRemarkNotBetween(String value1, String value2) {
	        addCriterion("REMARK not between", value1, value2, "remark");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table sys_log
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * sys_log
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