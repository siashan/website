package com.web.site.entity.admin;

import java.io.Serializable;
import java.util.Date;

/**
 *   新闻资讯
 *
 * @author Small 2018-09-29
 * database table news
 * @mbg.generated do_not_delete_during_merge
 */
public class News implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   标题
     *
     * @mbg.generated
     */
private String title;

	/**
     *   作者
     *
     * @mbg.generated
     */
private String author;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   类型
     *
     * @mbg.generated
     */
private String type;

	/**
     *   状态  1 待发布   2 已发布  3 已下架
     *
     * @mbg.generated
     */
private String status;

	/**
     *   发布时间
     *
     * @mbg.generated
     */
private Date pubTime;

	/**
     *   副标题
     *
     * @mbg.generated
     */
private String subTitle;

	/**
     *   SEO关键字
     *
     * @mbg.generated
     */
private String seoWord;

	/**
     *   操作人
     *
     * @mbg.generated
     */
private Long operator;

	/**
     *   摘要
     *
     * @mbg.generated
     */
private String summary;

	/**
     *   内容
     *
     * @mbg.generated
     */
private String content;

	/**
     * @mbg.generated
     */
private static final long serialVersionUID = 1L;

	/**
	     * @mbg.generated
	     */
	public Long getId() {
	    return id;
	}

	/**
	     * @mbg.generated
	     */
	public void setId(Long id) {
	    this.id = id;
	}

	/**
	     * @mbg.generated
	     */
	public String getTitle() {
	    return title;
	}

	/**
	     * @mbg.generated
	     */
	public void setTitle(String title) {
	    this.title = title == null ? null : title.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getAuthor() {
	    return author;
	}

	/**
	     * @mbg.generated
	     */
	public void setAuthor(String author) {
	    this.author = author == null ? null : author.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Date getCreateTime() {
	    return createTime;
	}

	/**
	     * @mbg.generated
	     */
	public void setCreateTime(Date createTime) {
	    this.createTime = createTime;
	}

	/**
	     * @mbg.generated
	     */
	public String getType() {
	    return type;
	}

	/**
	     * @mbg.generated
	     */
	public void setType(String type) {
	    this.type = type == null ? null : type.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getStatus() {
	    return status;
	}

	/**
	     * @mbg.generated
	     */
	public void setStatus(String status) {
	    this.status = status == null ? null : status.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Date getPubTime() {
	    return pubTime;
	}

	/**
	     * @mbg.generated
	     */
	public void setPubTime(Date pubTime) {
	    this.pubTime = pubTime;
	}

	/**
	     * @mbg.generated
	     */
	public String getSubTitle() {
	    return subTitle;
	}

	/**
	     * @mbg.generated
	     */
	public void setSubTitle(String subTitle) {
	    this.subTitle = subTitle == null ? null : subTitle.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getSeoWord() {
	    return seoWord;
	}

	/**
	     * @mbg.generated
	     */
	public void setSeoWord(String seoWord) {
	    this.seoWord = seoWord == null ? null : seoWord.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Long getOperator() {
	    return operator;
	}

	/**
	     * @mbg.generated
	     */
	public void setOperator(Long operator) {
	    this.operator = operator;
	}

	/**
	     * @mbg.generated
	     */
	public String getSummary() {
	    return summary;
	}

	/**
	     * @mbg.generated
	     */
	public void setSummary(String summary) {
	    this.summary = summary == null ? null : summary.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getContent() {
	    return content;
	}

	/**
	     * @mbg.generated
	     */
	public void setContent(String content) {
	    this.content = content == null ? null : content.trim();
	}


}