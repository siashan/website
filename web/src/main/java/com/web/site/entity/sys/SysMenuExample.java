package com.web.site.entity.sys;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {

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
	public SysMenuExample() {
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
	     * sys_menu
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
	
	    public Criteria andNameIsNull() {
	        addCriterion("NAME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIsNotNull() {
	        addCriterion("NAME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameEqualTo(String value) {
	        addCriterion("NAME =", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotEqualTo(String value) {
	        addCriterion("NAME <>", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThan(String value) {
	        addCriterion("NAME >", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThanOrEqualTo(String value) {
	        addCriterion("NAME >=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThan(String value) {
	        addCriterion("NAME <", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThanOrEqualTo(String value) {
	        addCriterion("NAME <=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLike(String value) {
	        addCriterion("NAME like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotLike(String value) {
	        addCriterion("NAME not like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIn(List<String> values) {
	        addCriterion("NAME in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotIn(List<String> values) {
	        addCriterion("NAME not in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameBetween(String value1, String value2) {
	        addCriterion("NAME between", value1, value2, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotBetween(String value1, String value2) {
	        addCriterion("NAME not between", value1, value2, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeIsNull() {
	        addCriterion("TYPE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeIsNotNull() {
	        addCriterion("TYPE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeEqualTo(String value) {
	        addCriterion("TYPE =", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeNotEqualTo(String value) {
	        addCriterion("TYPE <>", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeGreaterThan(String value) {
	        addCriterion("TYPE >", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeGreaterThanOrEqualTo(String value) {
	        addCriterion("TYPE >=", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeLessThan(String value) {
	        addCriterion("TYPE <", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeLessThanOrEqualTo(String value) {
	        addCriterion("TYPE <=", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeLike(String value) {
	        addCriterion("TYPE like", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeNotLike(String value) {
	        addCriterion("TYPE not like", value, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeIn(List<String> values) {
	        addCriterion("TYPE in", values, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeNotIn(List<String> values) {
	        addCriterion("TYPE not in", values, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeBetween(String value1, String value2) {
	        addCriterion("TYPE between", value1, value2, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andTypeNotBetween(String value1, String value2) {
	        addCriterion("TYPE not between", value1, value2, "type");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconIsNull() {
	        addCriterion("ICON is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconIsNotNull() {
	        addCriterion("ICON is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconEqualTo(String value) {
	        addCriterion("ICON =", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconNotEqualTo(String value) {
	        addCriterion("ICON <>", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconGreaterThan(String value) {
	        addCriterion("ICON >", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconGreaterThanOrEqualTo(String value) {
	        addCriterion("ICON >=", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconLessThan(String value) {
	        addCriterion("ICON <", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconLessThanOrEqualTo(String value) {
	        addCriterion("ICON <=", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconLike(String value) {
	        addCriterion("ICON like", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconNotLike(String value) {
	        addCriterion("ICON not like", value, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconIn(List<String> values) {
	        addCriterion("ICON in", values, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconNotIn(List<String> values) {
	        addCriterion("ICON not in", values, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconBetween(String value1, String value2) {
	        addCriterion("ICON between", value1, value2, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andIconNotBetween(String value1, String value2) {
	        addCriterion("ICON not between", value1, value2, "icon");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsIsNull() {
	        addCriterion("PERMISSIONS is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsIsNotNull() {
	        addCriterion("PERMISSIONS is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsEqualTo(String value) {
	        addCriterion("PERMISSIONS =", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsNotEqualTo(String value) {
	        addCriterion("PERMISSIONS <>", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsGreaterThan(String value) {
	        addCriterion("PERMISSIONS >", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsGreaterThanOrEqualTo(String value) {
	        addCriterion("PERMISSIONS >=", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsLessThan(String value) {
	        addCriterion("PERMISSIONS <", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsLessThanOrEqualTo(String value) {
	        addCriterion("PERMISSIONS <=", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsLike(String value) {
	        addCriterion("PERMISSIONS like", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsNotLike(String value) {
	        addCriterion("PERMISSIONS not like", value, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsIn(List<String> values) {
	        addCriterion("PERMISSIONS in", values, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsNotIn(List<String> values) {
	        addCriterion("PERMISSIONS not in", values, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsBetween(String value1, String value2) {
	        addCriterion("PERMISSIONS between", value1, value2, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andPermissionsNotBetween(String value1, String value2) {
	        addCriterion("PERMISSIONS not between", value1, value2, "permissions");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIsNull() {
	        addCriterion("PARENT_ID is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIsNotNull() {
	        addCriterion("PARENT_ID is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdEqualTo(Long value) {
	        addCriterion("PARENT_ID =", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotEqualTo(Long value) {
	        addCriterion("PARENT_ID <>", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThan(Long value) {
	        addCriterion("PARENT_ID >", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("PARENT_ID >=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThan(Long value) {
	        addCriterion("PARENT_ID <", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdLessThanOrEqualTo(Long value) {
	        addCriterion("PARENT_ID <=", value, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdIn(List<Long> values) {
	        addCriterion("PARENT_ID in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotIn(List<Long> values) {
	        addCriterion("PARENT_ID not in", values, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdBetween(Long value1, Long value2) {
	        addCriterion("PARENT_ID between", value1, value2, "parentId");
	        return (Criteria) this;
	    }
	
	    public Criteria andParentIdNotBetween(Long value1, Long value2) {
	        addCriterion("PARENT_ID not between", value1, value2, "parentId");
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
	
	    public Criteria andStatusIsNull() {
	        addCriterion("STATUS is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusIsNotNull() {
	        addCriterion("STATUS is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusEqualTo(String value) {
	        addCriterion("STATUS =", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotEqualTo(String value) {
	        addCriterion("STATUS <>", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusGreaterThan(String value) {
	        addCriterion("STATUS >", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusGreaterThanOrEqualTo(String value) {
	        addCriterion("STATUS >=", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLessThan(String value) {
	        addCriterion("STATUS <", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLessThanOrEqualTo(String value) {
	        addCriterion("STATUS <=", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusLike(String value) {
	        addCriterion("STATUS like", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotLike(String value) {
	        addCriterion("STATUS not like", value, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusIn(List<String> values) {
	        addCriterion("STATUS in", values, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotIn(List<String> values) {
	        addCriterion("STATUS not in", values, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusBetween(String value1, String value2) {
	        addCriterion("STATUS between", value1, value2, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andStatusNotBetween(String value1, String value2) {
	        addCriterion("STATUS not between", value1, value2, "status");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathIsNull() {
	        addCriterion("PATH is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathIsNotNull() {
	        addCriterion("PATH is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathEqualTo(String value) {
	        addCriterion("PATH =", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathNotEqualTo(String value) {
	        addCriterion("PATH <>", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathGreaterThan(String value) {
	        addCriterion("PATH >", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathGreaterThanOrEqualTo(String value) {
	        addCriterion("PATH >=", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathLessThan(String value) {
	        addCriterion("PATH <", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathLessThanOrEqualTo(String value) {
	        addCriterion("PATH <=", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathLike(String value) {
	        addCriterion("PATH like", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathNotLike(String value) {
	        addCriterion("PATH not like", value, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathIn(List<String> values) {
	        addCriterion("PATH in", values, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathNotIn(List<String> values) {
	        addCriterion("PATH not in", values, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathBetween(String value1, String value2) {
	        addCriterion("PATH between", value1, value2, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andPathNotBetween(String value1, String value2) {
	        addCriterion("PATH not between", value1, value2, "path");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentIsNull() {
	        addCriterion("COMPONENT is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentIsNotNull() {
	        addCriterion("COMPONENT is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentEqualTo(String value) {
	        addCriterion("COMPONENT =", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentNotEqualTo(String value) {
	        addCriterion("COMPONENT <>", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentGreaterThan(String value) {
	        addCriterion("COMPONENT >", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentGreaterThanOrEqualTo(String value) {
	        addCriterion("COMPONENT >=", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentLessThan(String value) {
	        addCriterion("COMPONENT <", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentLessThanOrEqualTo(String value) {
	        addCriterion("COMPONENT <=", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentLike(String value) {
	        addCriterion("COMPONENT like", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentNotLike(String value) {
	        addCriterion("COMPONENT not like", value, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentIn(List<String> values) {
	        addCriterion("COMPONENT in", values, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentNotIn(List<String> values) {
	        addCriterion("COMPONENT not in", values, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentBetween(String value1, String value2) {
	        addCriterion("COMPONENT between", value1, value2, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andComponentNotBetween(String value1, String value2) {
	        addCriterion("COMPONENT not between", value1, value2, "component");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathIsNull() {
	        addCriterion("REDIRECT_PATH is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathIsNotNull() {
	        addCriterion("REDIRECT_PATH is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathEqualTo(String value) {
	        addCriterion("REDIRECT_PATH =", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathNotEqualTo(String value) {
	        addCriterion("REDIRECT_PATH <>", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathGreaterThan(String value) {
	        addCriterion("REDIRECT_PATH >", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathGreaterThanOrEqualTo(String value) {
	        addCriterion("REDIRECT_PATH >=", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathLessThan(String value) {
	        addCriterion("REDIRECT_PATH <", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathLessThanOrEqualTo(String value) {
	        addCriterion("REDIRECT_PATH <=", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathLike(String value) {
	        addCriterion("REDIRECT_PATH like", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathNotLike(String value) {
	        addCriterion("REDIRECT_PATH not like", value, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathIn(List<String> values) {
	        addCriterion("REDIRECT_PATH in", values, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathNotIn(List<String> values) {
	        addCriterion("REDIRECT_PATH not in", values, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathBetween(String value1, String value2) {
	        addCriterion("REDIRECT_PATH between", value1, value2, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andRedirectPathNotBetween(String value1, String value2) {
	        addCriterion("REDIRECT_PATH not between", value1, value2, "redirectPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenIsNull() {
	        addCriterion("IS_HIDDREN is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenIsNotNull() {
	        addCriterion("IS_HIDDREN is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenEqualTo(String value) {
	        addCriterion("IS_HIDDREN =", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenNotEqualTo(String value) {
	        addCriterion("IS_HIDDREN <>", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenGreaterThan(String value) {
	        addCriterion("IS_HIDDREN >", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenGreaterThanOrEqualTo(String value) {
	        addCriterion("IS_HIDDREN >=", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenLessThan(String value) {
	        addCriterion("IS_HIDDREN <", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenLessThanOrEqualTo(String value) {
	        addCriterion("IS_HIDDREN <=", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenLike(String value) {
	        addCriterion("IS_HIDDREN like", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenNotLike(String value) {
	        addCriterion("IS_HIDDREN not like", value, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenIn(List<String> values) {
	        addCriterion("IS_HIDDREN in", values, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenNotIn(List<String> values) {
	        addCriterion("IS_HIDDREN not in", values, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenBetween(String value1, String value2) {
	        addCriterion("IS_HIDDREN between", value1, value2, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsHiddrenNotBetween(String value1, String value2) {
	        addCriterion("IS_HIDDREN not between", value1, value2, "isHiddren");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelIsNull() {
	        addCriterion("IS_LAST_LEVEL is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelIsNotNull() {
	        addCriterion("IS_LAST_LEVEL is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelEqualTo(String value) {
	        addCriterion("IS_LAST_LEVEL =", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelNotEqualTo(String value) {
	        addCriterion("IS_LAST_LEVEL <>", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelGreaterThan(String value) {
	        addCriterion("IS_LAST_LEVEL >", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelGreaterThanOrEqualTo(String value) {
	        addCriterion("IS_LAST_LEVEL >=", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelLessThan(String value) {
	        addCriterion("IS_LAST_LEVEL <", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelLessThanOrEqualTo(String value) {
	        addCriterion("IS_LAST_LEVEL <=", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelLike(String value) {
	        addCriterion("IS_LAST_LEVEL like", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelNotLike(String value) {
	        addCriterion("IS_LAST_LEVEL not like", value, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelIn(List<String> values) {
	        addCriterion("IS_LAST_LEVEL in", values, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelNotIn(List<String> values) {
	        addCriterion("IS_LAST_LEVEL not in", values, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelBetween(String value1, String value2) {
	        addCriterion("IS_LAST_LEVEL between", value1, value2, "isLastLevel");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsLastLevelNotBetween(String value1, String value2) {
	        addCriterion("IS_LAST_LEVEL not between", value1, value2, "isLastLevel");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table sys_menu
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * sys_menu
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