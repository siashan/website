package com.web.site.entity.product;

import java.io.Serializable;

/**
 * 商品图片表
 *
 * @author Small 2018-10-08
 * database table goods_img
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsImg implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 图片1
     *
     * @mbg.generated
     */
    private String goodsImg;

    /**
     * 排序字段
     *
     * @mbg.generated
     */
    private Integer orderBy;

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
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * @mbg.generated
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * @mbg.generated
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    /**
     * @mbg.generated
     */
    public Integer getOrderBy() {
        return orderBy;
    }

    /**
     * @mbg.generated
     */
    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }


}