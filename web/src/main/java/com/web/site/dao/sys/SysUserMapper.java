package com.web.site.dao.sys;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.sys.SysUser;
import com.web.site.entity.sys.SysUserExample;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser, SysUserExample> {

	List<String> queryAllPerms(Long id);


}