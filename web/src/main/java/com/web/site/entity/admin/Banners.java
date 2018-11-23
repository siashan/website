package com.web.site.entity.admin;

import java.io.Serializable;
import java.util.Date;

/**
 * 轮播图
 *
 * @author Small 2018-07-27
 * database table banners
 * @mbg.generated do_not_delete_during_merge
 */
public class Banners implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 标题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 链接地址
     *
     * @mbg.generated
     */
    private String imgSrc;

    /**
     * 图片存放地址
     *
     * @mbg.generated
     */
    private String imgPath;

    /**
     * 图片介绍
     *
     * @mbg.generated
     */
    private String imgAlt;

    /**
     * 状态
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 展示位置
     *
     * @mbg.generated
     */
    private String showPlat;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

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
    public String getImgSrc() {
        return imgSrc;
    }

    /**
     * @mbg.generated
     */
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc == null ? null : imgSrc.trim();
    }

    /**
     * @mbg.generated
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @mbg.generated
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    /**
     * @mbg.generated
     */
    public String getImgAlt() {
        return imgAlt;
    }

    /**
     * @mbg.generated
     */
    public void setImgAlt(String imgAlt) {
        this.imgAlt = imgAlt == null ? null : imgAlt.trim();
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
    public String getShowPlat() {
        return showPlat;
    }

    /**
     * @mbg.generated
     */
    public void setShowPlat(String showPlat) {
        this.showPlat = showPlat == null ? null : showPlat.trim();
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


}