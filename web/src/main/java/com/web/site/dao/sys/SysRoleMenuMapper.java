package com.web.site.dao.sys;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.sys.SysRoleMenu;
import com.web.site.entity.sys.SysRoleMenuExample;

import java.util.ArrayList;

public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu, SysRoleMenuExample> {

	void deleteByRoleId(Long id);

	void insertBatch(ArrayList list);


}