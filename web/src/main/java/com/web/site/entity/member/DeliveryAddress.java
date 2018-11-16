package com.web.site.entity.member;

import com.web.site.common.support.validator.constraints.IsMobile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 收货地址
 *
 * @author Small 2018-10-31
 * database table delivery_address
 * @mbg.generated do_not_delete_during_merge
 */
@ApiModel(description = "会员收货地址")
public class DeliveryAddress implements Serializable {

    /**
     * 收货地址id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 会员id
     *
     * @mbg.generated
     */
    @ApiModelProperty(hidden = true)
    private Long memberId;

    /**
     * 是否默认地址 0 否 1是
     *
     * @mbg.generated
     */
    @Pattern(regexp = "[0,1]",message = "参数有误")
    @ApiModelProperty(value = "是否默认地址")
    private String isDefault;

    /**
     * 地址编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "地址编码")

    private String addressCode;

    /**
     * 省
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "省id")
    private Long provinceId;

    /**
     * 市
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "市id")
    private Long cityId;

    /**
     * 区县
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "区县id")
    private Long areaId;

    /**
     * 镇街道
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "镇/街道id")
    private Long townId;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "详细地址")
    private String detailAddress;

    /**
     * 邮编
     *
     * @mbg.generated
     */
    @ApiModelProperty(hidden = true)
    private String zipCode;

    /**
     * 收件人联系方式
     *
     * @mbg.generated
     */
    @IsMobile
    @ApiModelProperty(value = "手机号")
    private String mobile;

    /**
     * 收件人
     *
     * @mbg.generated
     */
    @NotNull
    @Length(min = 2,max = 20,message = "收件人姓名长度必须大于2小于20")
    @ApiModelProperty(value = "收件人")
    private String consignee;

    /**
     * 逻辑删除 0 未删除 1已删除
     *
     * @mbg.generated
     */
    @ApiModelProperty(hidden = true)
    private String delStat;

    /**
     * 地址全称
     *
     * @mbg.generated
     */
    @NotNull
    @Length(min = 5,max = 200)
    @ApiModelProperty(value = "地址全称")
    private String fullAddress;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(hidden = true)
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
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @mbg.generated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @mbg.generated
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * @mbg.generated
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * @mbg.generated
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * @mbg.generated
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    /**
     * @mbg.generated
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * @mbg.generated
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @mbg.generated
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * @mbg.generated
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * @mbg.generated
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * @mbg.generated
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * @mbg.generated
     */
    public Long getTownId() {
        return townId;
    }

    /**
     * @mbg.generated
     */
    public void setTownId(Long townId) {
        this.townId = townId;
    }

    /**
     * @mbg.generated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * @mbg.generated
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * @mbg.generated
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @mbg.generated
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @mbg.generated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @mbg.generated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * @mbg.generated
     */
    public String getDelStat() {
        return delStat;
    }

    /**
     * @mbg.generated
     */
    public void setDelStat(String delStat) {
        this.delStat = delStat == null ? null : delStat.trim();
    }

    /**
     * @mbg.generated
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * @mbg.generated
     */
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress == null ? null : fullAddress.trim();
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