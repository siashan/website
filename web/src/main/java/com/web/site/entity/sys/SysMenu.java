package com.web.site.entity.sys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Small 2018-07-27
 * database table sys_menu
 * @mbg.generated do_not_delete_during_merge
 */
public class SysMenu implements Serializable {

	/**
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   菜单名称
     *
     * @mbg.generated
     */
private String name;

	/**
     *   菜单类型
     *
     * @mbg.generated
     */
private String type;

	/**
     *   图标
     *
     * @mbg.generated
     */
private String icon;

	/**
     *   权限
     *
     * @mbg.generated
     */
private String permissions;

	/**
     *   父id
     *
     * @mbg.generated
     */
private Long parentId;

	/**
     *   备注
     *
     * @mbg.generated
     */
private String remark;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   排序字段
     *
     * @mbg.generated
     */
private Short orderBy;

	/**
     *   状态  0 禁用  1 可用
     *
     * @mbg.generated
     */
private String status;

	/**
     *   路由地址
     *
     * @mbg.generated
     */
private String path;

	/**
     *   组件名称
     *
     * @mbg.generated
     */
private String component;

	/**
     *   重定向地址
     *
     * @mbg.generated
     */
private String redirectPath;

	/**
     *   是否隐藏
     *
     * @mbg.generated
     */
private String isHiddren;

	/**
     *   是否最后一级
     *
     * @mbg.generated
     */
private String isLastLevel;

	/**
     *   菜单url
     *
     * @mbg.generated
     */
private String url;

	/**
     * @mbg.generated
     */
private static final long serialVersionUID = 1L;

	private ArrayList<SysMenu> children;

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
	public String getName() {
	    return name;
	}

	/**
	     * @mbg.generated
	     */
	public void setName(String name) {
	    this.name = name == null ? null : name.trim();
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
	public String getIcon() {
	    return icon;
	}

	/**
	     * @mbg.generated
	     */
	public void setIcon(String icon) {
	    this.icon = icon == null ? null : icon.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getPermissions() {
	    return permissions;
	}

	/**
	     * @mbg.generated
	     */
	public void setPermissions(String permissions) {
	    this.permissions = permissions == null ? null : permissions.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Long getParentId() {
	    return parentId;
	}

	/**
	     * @mbg.generated
	     */
	public void setParentId(Long parentId) {
	    this.parentId = parentId;
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
	public Short getOrderBy() {
	    return orderBy;
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderBy(Short orderBy) {
	    this.orderBy = orderBy;
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
	public String getPath() {
	    return path;
	}

	/**
	     * @mbg.generated
	     */
	public void setPath(String path) {
	    this.path = path == null ? null : path.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getComponent() {
	    return component;
	}

	/**
	     * @mbg.generated
	     */
	public void setComponent(String component) {
	    this.component = component == null ? null : component.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getRedirectPath() {
	    return redirectPath;
	}

	/**
	     * @mbg.generated
	     */
	public void setRedirectPath(String redirectPath) {
	    this.redirectPath = redirectPath == null ? null : redirectPath.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getIsHiddren() {
	    return isHiddren;
	}

	/**
	     * @mbg.generated
	     */
	public void setIsHiddren(String isHiddren) {
	    this.isHiddren = isHiddren == null ? null : isHiddren.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getIsLastLevel() {
	    return isLastLevel;
	}

	/**
	     * @mbg.generated
	     */
	public void setIsLastLevel(String isLastLevel) {
	    this.isLastLevel = isLastLevel == null ? null : isLastLevel.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getUrl() {
	    return url;
	}

	/**
	     * @mbg.generated
	     */
	public void setUrl(String url) {
	    this.url = url == null ? null : url.trim();
	}

	public ArrayList<SysMenu> getChildren() {
	    return children;
	}

	public void setChildren(ArrayList<SysMenu> children) {
	    this.children = children;
	}


}