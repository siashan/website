package com.web.site.entity.sales;

import java.io.Serializable;
import java.util.Date;

/**
 *   活动表
 *
 * @author Small 2018-11-14
 * database table activity
 * @mbg.generated do_not_delete_during_merge
 */
public class Activity implements Serializable {
    /**
     *   活动id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *   活动名称
     *
     * @mbg.generated
     */
    private String activityName;

    /**
     *   创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *   活动开始时间
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *   活动结束时间
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *   活动状态
     *
     * @mbg.generated
     */
    private String status;

    /**
     *   活动备注
     *
     * @mbg.generated
     */
    private String remark;

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
    public String getActivityName() {
        return activityName;
    }

    /**
     * @mbg.generated
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
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
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
    public String getRemark() {
        return remark;
    }

    /**
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}