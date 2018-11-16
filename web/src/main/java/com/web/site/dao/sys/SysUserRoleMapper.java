package com.web.site.dao.sys;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.sys.SysUserRole;
import com.web.site.entity.sys.SysUserRoleExample;

import java.util.ArrayList;

public interface SysUserRoleMapper extends BaseMapper<SysUserRole, SysUserRoleExample> {

	void deleteByRoleId(Long id);

	void deleteByUserId(Long id);

	void insertBatch(ArrayList list);


}