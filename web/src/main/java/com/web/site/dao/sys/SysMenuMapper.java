package com.web.site.dao.sys;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.sys.SysMenu;
import com.web.site.entity.sys.SysMenuExample;

import java.util.List;

public interface SysMenuMapper extends BaseMapper<SysMenu, SysMenuExample> {

	List<SysMenu> selectTree();

	List<SysMenu> getUserFatherMenuList(Long id);


}