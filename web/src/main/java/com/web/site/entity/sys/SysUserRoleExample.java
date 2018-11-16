package com.web.site.entity.sys;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.List;

public class SysUserRoleExample {

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
	public SysUserRoleExample() {
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
	     * sys_user_role
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
	
	    public Criteria andRoleIdIsNull() {
	        addCriterion("ROLE_ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdIsNotNull() {
	        addCriterion("ROLE_ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdEqualTo(Long value) {
	        addCriterion("ROLE_ID =", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdNotEqualTo(Long value) {
	        addCriterion("ROLE_ID <>", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdGreaterThan(Long value) {
	        addCriterion("ROLE_ID >", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("ROLE_ID >=", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdLessThan(Long value) {
	        addCriterion("ROLE_ID <", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdLessThanOrEqualTo(Long value) {
	        addCriterion("ROLE_ID <=", value, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdIn(List<Long> values) {
	        addCriterion("ROLE_ID in", values, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdNotIn(List<Long> values) {
	        addCriterion("ROLE_ID not in", values, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdBetween(Long value1, Long value2) {
	        addCriterion("ROLE_ID between", value1, value2, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andRoleIdNotBetween(Long value1, Long value2) {
	        addCriterion("ROLE_ID not between", value1, value2, "roleId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdIsNull() {
	        addCriterion("USER_ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdIsNotNull() {
	        addCriterion("USER_ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdEqualTo(Long value) {
	        addCriterion("USER_ID =", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdNotEqualTo(Long value) {
	        addCriterion("USER_ID <>", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdGreaterThan(Long value) {
	        addCriterion("USER_ID >", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("USER_ID >=", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdLessThan(Long value) {
	        addCriterion("USER_ID <", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdLessThanOrEqualTo(Long value) {
	        addCriterion("USER_ID <=", value, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdIn(List<Long> values) {
	        addCriterion("USER_ID in", values, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdNotIn(List<Long> values) {
	        addCriterion("USER_ID not in", values, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdBetween(Long value1, Long value2) {
	        addCriterion("USER_ID between", value1, value2, "userId");
	        return (Criteria) this;
	    }
	
	    public Criteria andUserIdNotBetween(Long value1, Long value2) {
	        addCriterion("USER_ID not between", value1, value2, "userId");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table sys_user_role
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * sys_user_role
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