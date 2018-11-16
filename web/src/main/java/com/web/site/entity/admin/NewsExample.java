package com.web.site.entity.admin;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {

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
	public NewsExample() {
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
	     * news
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
	
	    public Criteria andTitleIsNull() {
	        addCriterion("TITLE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleIsNotNull() {
	        addCriterion("TITLE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleEqualTo(String value) {
	        addCriterion("TITLE =", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleNotEqualTo(String value) {
	        addCriterion("TITLE <>", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleGreaterThan(String value) {
	        addCriterion("TITLE >", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleGreaterThanOrEqualTo(String value) {
	        addCriterion("TITLE >=", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleLessThan(String value) {
	        addCriterion("TITLE <", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleLessThanOrEqualTo(String value) {
	        addCriterion("TITLE <=", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleLike(String value) {
	        addCriterion("TITLE like", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleNotLike(String value) {
	        addCriterion("TITLE not like", value, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleIn(List<String> values) {
	        addCriterion("TITLE in", values, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleNotIn(List<String> values) {
	        addCriterion("TITLE not in", values, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleBetween(String value1, String value2) {
	        addCriterion("TITLE between", value1, value2, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andTitleNotBetween(String value1, String value2) {
	        addCriterion("TITLE not between", value1, value2, "title");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorIsNull() {
	        addCriterion("AUTHOR is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorIsNotNull() {
	        addCriterion("AUTHOR is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorEqualTo(String value) {
	        addCriterion("AUTHOR =", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorNotEqualTo(String value) {
	        addCriterion("AUTHOR <>", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorGreaterThan(String value) {
	        addCriterion("AUTHOR >", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorGreaterThanOrEqualTo(String value) {
	        addCriterion("AUTHOR >=", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorLessThan(String value) {
	        addCriterion("AUTHOR <", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorLessThanOrEqualTo(String value) {
	        addCriterion("AUTHOR <=", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorLike(String value) {
	        addCriterion("AUTHOR like", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorNotLike(String value) {
	        addCriterion("AUTHOR not like", value, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorIn(List<String> values) {
	        addCriterion("AUTHOR in", values, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorNotIn(List<String> values) {
	        addCriterion("AUTHOR not in", values, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorBetween(String value1, String value2) {
	        addCriterion("AUTHOR between", value1, value2, "author");
	        return (Criteria) this;
	    }
	
	    public Criteria andAuthorNotBetween(String value1, String value2) {
	        addCriterion("AUTHOR not between", value1, value2, "author");
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
	
	    public Criteria andPubTimeIsNull() {
	        addCriterion("PUB_TIME is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeIsNotNull() {
	        addCriterion("PUB_TIME is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeEqualTo(Date value) {
	        addCriterion("PUB_TIME =", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeNotEqualTo(Date value) {
	        addCriterion("PUB_TIME <>", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeGreaterThan(Date value) {
	        addCriterion("PUB_TIME >", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("PUB_TIME >=", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeLessThan(Date value) {
	        addCriterion("PUB_TIME <", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeLessThanOrEqualTo(Date value) {
	        addCriterion("PUB_TIME <=", value, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeIn(List<Date> values) {
	        addCriterion("PUB_TIME in", values, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeNotIn(List<Date> values) {
	        addCriterion("PUB_TIME not in", values, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeBetween(Date value1, Date value2) {
	        addCriterion("PUB_TIME between", value1, value2, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andPubTimeNotBetween(Date value1, Date value2) {
	        addCriterion("PUB_TIME not between", value1, value2, "pubTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleIsNull() {
	        addCriterion("SUB_TITLE is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleIsNotNull() {
	        addCriterion("SUB_TITLE is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleEqualTo(String value) {
	        addCriterion("SUB_TITLE =", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleNotEqualTo(String value) {
	        addCriterion("SUB_TITLE <>", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleGreaterThan(String value) {
	        addCriterion("SUB_TITLE >", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
	        addCriterion("SUB_TITLE >=", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleLessThan(String value) {
	        addCriterion("SUB_TITLE <", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleLessThanOrEqualTo(String value) {
	        addCriterion("SUB_TITLE <=", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleLike(String value) {
	        addCriterion("SUB_TITLE like", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleNotLike(String value) {
	        addCriterion("SUB_TITLE not like", value, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleIn(List<String> values) {
	        addCriterion("SUB_TITLE in", values, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleNotIn(List<String> values) {
	        addCriterion("SUB_TITLE not in", values, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleBetween(String value1, String value2) {
	        addCriterion("SUB_TITLE between", value1, value2, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSubTitleNotBetween(String value1, String value2) {
	        addCriterion("SUB_TITLE not between", value1, value2, "subTitle");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordIsNull() {
	        addCriterion("SEO_WORD is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordIsNotNull() {
	        addCriterion("SEO_WORD is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordEqualTo(String value) {
	        addCriterion("SEO_WORD =", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordNotEqualTo(String value) {
	        addCriterion("SEO_WORD <>", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordGreaterThan(String value) {
	        addCriterion("SEO_WORD >", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordGreaterThanOrEqualTo(String value) {
	        addCriterion("SEO_WORD >=", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordLessThan(String value) {
	        addCriterion("SEO_WORD <", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordLessThanOrEqualTo(String value) {
	        addCriterion("SEO_WORD <=", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordLike(String value) {
	        addCriterion("SEO_WORD like", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordNotLike(String value) {
	        addCriterion("SEO_WORD not like", value, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordIn(List<String> values) {
	        addCriterion("SEO_WORD in", values, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordNotIn(List<String> values) {
	        addCriterion("SEO_WORD not in", values, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordBetween(String value1, String value2) {
	        addCriterion("SEO_WORD between", value1, value2, "seoWord");
	        return (Criteria) this;
	    }
	
	    public Criteria andSeoWordNotBetween(String value1, String value2) {
	        addCriterion("SEO_WORD not between", value1, value2, "seoWord");
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
	
	    public Criteria andSummaryIsNull() {
	        addCriterion("SUMMARY is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryIsNotNull() {
	        addCriterion("SUMMARY is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryEqualTo(String value) {
	        addCriterion("SUMMARY =", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryNotEqualTo(String value) {
	        addCriterion("SUMMARY <>", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryGreaterThan(String value) {
	        addCriterion("SUMMARY >", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryGreaterThanOrEqualTo(String value) {
	        addCriterion("SUMMARY >=", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryLessThan(String value) {
	        addCriterion("SUMMARY <", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryLessThanOrEqualTo(String value) {
	        addCriterion("SUMMARY <=", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryLike(String value) {
	        addCriterion("SUMMARY like", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryNotLike(String value) {
	        addCriterion("SUMMARY not like", value, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryIn(List<String> values) {
	        addCriterion("SUMMARY in", values, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryNotIn(List<String> values) {
	        addCriterion("SUMMARY not in", values, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryBetween(String value1, String value2) {
	        addCriterion("SUMMARY between", value1, value2, "summary");
	        return (Criteria) this;
	    }
	
	    public Criteria andSummaryNotBetween(String value1, String value2) {
	        addCriterion("SUMMARY not between", value1, value2, "summary");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table news
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * news
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