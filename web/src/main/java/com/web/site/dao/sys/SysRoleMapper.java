package com.web.site.dao.sys;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.sys.SysRole;
import com.web.site.entity.sys.SysRoleExample;

import java.util.List;

public interface SysRoleMapper extends BaseMapper<SysRole, SysRoleExample> {

	List<Long> getRoleMenu(Long id);


}