package com.web.site.entity.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员
 *
 * @author Small 2018-10-26
 * database table member
 * @mbg.generated do_not_delete_during_merge
 */
public class Member implements Serializable {

    /**
     * 会员id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 登录密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String headerImg;

    /**
     * 微信openid
     *
     * @mbg.generated
     */
    private String wxOpenid;

    /**
     * 推荐人id
     *
     * @mbg.generated
     */
    private Long recommendId;

    /**
     * 加密盐
     *
     * @mbg.generated
     */
    private String salt;

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
    public String getNickName() {
        return nickName;
    }

    /**
     * @mbg.generated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
    public String getPassword() {
        return password;
    }

    /**
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @mbg.generated
     */
    public String getHeaderImg() {
        return headerImg;
    }

    /**
     * @mbg.generated
     */
    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg == null ? null : headerImg.trim();
    }

    /**
     * @mbg.generated
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * @mbg.generated
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    /**
     * @mbg.generated
     */
    public Long getRecommendId() {
        return recommendId;
    }

    /**
     * @mbg.generated
     */
    public void setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
    }

    /**
     * @mbg.generated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @mbg.generated
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }


}