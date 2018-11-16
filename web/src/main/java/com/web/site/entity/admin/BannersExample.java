package com.web.site.entity.admin;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannersExample {

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
	public BannersExample() {
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
	     * banners
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
	
	    public Criteria andImgSrcIsNull() {
	        addCriterion("IMG_SRC is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcIsNotNull() {
	        addCriterion("IMG_SRC is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcEqualTo(String value) {
	        addCriterion("IMG_SRC =", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcNotEqualTo(String value) {
	        addCriterion("IMG_SRC <>", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcGreaterThan(String value) {
	        addCriterion("IMG_SRC >", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcGreaterThanOrEqualTo(String value) {
	        addCriterion("IMG_SRC >=", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcLessThan(String value) {
	        addCriterion("IMG_SRC <", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcLessThanOrEqualTo(String value) {
	        addCriterion("IMG_SRC <=", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcLike(String value) {
	        addCriterion("IMG_SRC like", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcNotLike(String value) {
	        addCriterion("IMG_SRC not like", value, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcIn(List<String> values) {
	        addCriterion("IMG_SRC in", values, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcNotIn(List<String> values) {
	        addCriterion("IMG_SRC not in", values, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcBetween(String value1, String value2) {
	        addCriterion("IMG_SRC between", value1, value2, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgSrcNotBetween(String value1, String value2) {
	        addCriterion("IMG_SRC not between", value1, value2, "imgSrc");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathIsNull() {
	        addCriterion("IMG_PATH is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathIsNotNull() {
	        addCriterion("IMG_PATH is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathEqualTo(String value) {
	        addCriterion("IMG_PATH =", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathNotEqualTo(String value) {
	        addCriterion("IMG_PATH <>", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathGreaterThan(String value) {
	        addCriterion("IMG_PATH >", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathGreaterThanOrEqualTo(String value) {
	        addCriterion("IMG_PATH >=", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathLessThan(String value) {
	        addCriterion("IMG_PATH <", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathLessThanOrEqualTo(String value) {
	        addCriterion("IMG_PATH <=", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathLike(String value) {
	        addCriterion("IMG_PATH like", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathNotLike(String value) {
	        addCriterion("IMG_PATH not like", value, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathIn(List<String> values) {
	        addCriterion("IMG_PATH in", values, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathNotIn(List<String> values) {
	        addCriterion("IMG_PATH not in", values, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathBetween(String value1, String value2) {
	        addCriterion("IMG_PATH between", value1, value2, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgPathNotBetween(String value1, String value2) {
	        addCriterion("IMG_PATH not between", value1, value2, "imgPath");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltIsNull() {
	        addCriterion("IMG_ALT is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltIsNotNull() {
	        addCriterion("IMG_ALT is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltEqualTo(String value) {
	        addCriterion("IMG_ALT =", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltNotEqualTo(String value) {
	        addCriterion("IMG_ALT <>", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltGreaterThan(String value) {
	        addCriterion("IMG_ALT >", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltGreaterThanOrEqualTo(String value) {
	        addCriterion("IMG_ALT >=", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltLessThan(String value) {
	        addCriterion("IMG_ALT <", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltLessThanOrEqualTo(String value) {
	        addCriterion("IMG_ALT <=", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltLike(String value) {
	        addCriterion("IMG_ALT like", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltNotLike(String value) {
	        addCriterion("IMG_ALT not like", value, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltIn(List<String> values) {
	        addCriterion("IMG_ALT in", values, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltNotIn(List<String> values) {
	        addCriterion("IMG_ALT not in", values, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltBetween(String value1, String value2) {
	        addCriterion("IMG_ALT between", value1, value2, "imgAlt");
	        return (Criteria) this;
	    }
	
	    public Criteria andImgAltNotBetween(String value1, String value2) {
	        addCriterion("IMG_ALT not between", value1, value2, "imgAlt");
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
	
	    public Criteria andShowPlatIsNull() {
	        addCriterion("SHOW_PLAT is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatIsNotNull() {
	        addCriterion("SHOW_PLAT is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatEqualTo(String value) {
	        addCriterion("SHOW_PLAT =", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatNotEqualTo(String value) {
	        addCriterion("SHOW_PLAT <>", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatGreaterThan(String value) {
	        addCriterion("SHOW_PLAT >", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatGreaterThanOrEqualTo(String value) {
	        addCriterion("SHOW_PLAT >=", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatLessThan(String value) {
	        addCriterion("SHOW_PLAT <", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatLessThanOrEqualTo(String value) {
	        addCriterion("SHOW_PLAT <=", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatLike(String value) {
	        addCriterion("SHOW_PLAT like", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatNotLike(String value) {
	        addCriterion("SHOW_PLAT not like", value, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatIn(List<String> values) {
	        addCriterion("SHOW_PLAT in", values, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatNotIn(List<String> values) {
	        addCriterion("SHOW_PLAT not in", values, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatBetween(String value1, String value2) {
	        addCriterion("SHOW_PLAT between", value1, value2, "showPlat");
	        return (Criteria) this;
	    }
	
	    public Criteria andShowPlatNotBetween(String value1, String value2) {
	        addCriterion("SHOW_PLAT not between", value1, value2, "showPlat");
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
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table banners
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * banners
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