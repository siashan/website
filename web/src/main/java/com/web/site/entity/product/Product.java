package com.web.site.entity.product;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品sku
 *
 * @author Small 2018-10-20
 * database table product
 * @mbg.generated do_not_delete_during_merge
 */
public class Product implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 货品名称
     *
     * @mbg.generated
     */
    private String productName;

    /**
     * 货品编码
     *
     * @mbg.generated
     */
    private String productSn;

    /**
     * 价格
     *
     * @mbg.generated
     */
    private Double price;

    /**
     * 货品图片
     *
     * @mbg.generated
     */
    private String productImg;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer productStock;

    /**
     * sku
     *
     * @mbg.generated
     */
    private String productSku;

    /**
     * sku注释
     *
     * @mbg.generated
     */
    private String productSkuRemark;

    /**
     * 成本价
     *
     * @mbg.generated
     */
    private Double costPrice;

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
    public String getProductName() {
        return productName;
    }

    /**
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * @mbg.generated
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * @mbg.generated
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @mbg.generated
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * @mbg.generated
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    /**
     * @mbg.generated
     */
    public Integer getProductStock() {
        return productStock;
    }

    /**
     * @mbg.generated
     */
    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    /**
     * @mbg.generated
     */
    public String getProductSku() {
        return productSku;
    }

    /**
     * @mbg.generated
     */
    public void setProductSku(String productSku) {
        this.productSku = productSku == null ? null : productSku.trim();
    }

    /**
     * @mbg.generated
     */
    public String getProductSkuRemark() {
        return productSkuRemark;
    }

    /**
     * @mbg.generated
     */
    public void setProductSkuRemark(String productSkuRemark) {
        this.productSkuRemark = productSkuRemark == null ? null : productSkuRemark.trim();
    }

    /**
     * @mbg.generated
     */
    public Double getCostPrice() {
        return costPrice;
    }

    /**
     * @mbg.generated
     */
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
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