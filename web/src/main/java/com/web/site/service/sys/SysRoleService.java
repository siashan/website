package com.web.site.service.sys;

import com.web.site.dao.sys.SysRoleMapper;
import com.web.site.dao.sys.SysRoleMenuMapper;
import com.web.site.dao.sys.SysUserRoleMapper;
import com.web.site.entity.sys.SysRole;
import com.web.site.entity.sys.SysRoleExample;
import com.web.site.entity.sys.SysRoleMenu;
import com.web.site.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-07-27
 */
@Service
public class SysRoleService extends BaseService<SysRoleMapper, SysRole, SysRoleExample> {

	@Autowired
private SysRoleMenuMapper sysRoleMenuMapper;

	@Autowired
private SysUserRoleMapper sysUserRoleMapper;

	@Transactional
	public void create(SysRole role, String menus) {
	    if (null == role.getId()) {
	        role.setCreateTime(new Date());
	        baseMapper.insert(role);
	    } else {
	        baseMapper.updateByPrimaryKeySelective(role);
	    }
	    savePrivileges(role, menus);
	}

	/**
     * Description:  保存角色权限<br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/9 16:08
     */
	private void savePrivileges(SysRole role, String privileges) {
	    sysRoleMenuMapper.deleteByRoleId(role.getId());
	    String[] ps = privileges.split(",");
	    ArrayList list = new ArrayList();
	    for (String s : ps) {
	        SysRoleMenu srr = new SysRoleMenu();
	        srr.setRoleId(role.getId());
	        srr.setMenuId(Long.parseLong(s));
	        list.add(srr);
	    }
	    sysRoleMenuMapper.insertBatch(list);
	}

	public SysRole selectByName(String name) {
	    SysRoleExample example = new SysRoleExample();
	    example.createCriteria().andNameEqualTo(name);
	    return selectOneByExample(example);
	}

	public List<Long> getRoleMenu(Long id) {
	    return baseMapper.getRoleMenu(id);
	}

	@Transactional
	public void deleteById(Long id) {
	    deleteByPrimaryKey(id);
	    sysRoleMenuMapper.deleteByRoleId(id);
	    sysUserRoleMapper.deleteByRoleId(id);
	}


}