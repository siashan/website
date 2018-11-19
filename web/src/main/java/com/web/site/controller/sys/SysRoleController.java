package com.web.site.controller.sys;

import com.alibaba.fastjson.JSONArray;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.sys.SysRole;
import com.web.site.entity.sys.SysRoleExample;
import com.web.site.service.sys.SysRoleService;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/10 10:23
 * @Modified By:
 */
@RestController
@RequestMapping("sys/role")
public class SysRoleController extends BaseController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("roleList")
    public Object roleList(SysRole role) {
        SysRoleExample example = new SysRoleExample();
        example.setOrderByClause(" id desc ");
        SysRoleExample.Criteria c = example.createCriteria();
        if (StringUtil.isNotBlank(role.getName())){
            c.andNameLike("%"+ role.getName()+"%");
        }
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) sysRoleService.countByExample(example));
        List<SysRole> sysRole = sysRoleService.selectByExample(example);
        return Responses.bt(page.getTotal(), sysRole);
    }


    @RequestMapping("save")
    public Object save(SysRole role, String menus) {
        if (StringUtil.isBlank(role.getName())) {
            return Responses.error("请填写角色名称");
        }
        if (StringUtil.isBlank(menus)) {
            return Responses.error("请至少选择一个权限");
        }
        SysRole roleDB = sysRoleService.selectByName(role.getName().trim());
        if (null != roleDB && null == role.getId()) {
            return Responses.error("角色已存在");
        }
        try {
            sysRoleService.create(role, menus);
        } catch (Exception e) {
            e.printStackTrace();
            return Responses.error();
        }
        return Responses.success();
    }

    @RequestMapping("getRole")
    public Object getRole(Long id) {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(id);

        List<Long> menus = sysRoleService.getRoleMenu(id);
        JSONArray menuIds = (JSONArray) JSONArray.toJSON(menus);
//        System.out.println("menuids: " + menuIds);

        Map<String, Object> reMap = new HashMap<>();
        reMap.put("menus", menuIds);
        reMap.put("id", sysRole.getId());
        reMap.put("name", sysRole.getName());
        reMap.put("remark", sysRole.getRemark());
        return Responses.success(reMap);
    }

    @RequestMapping("del")
    public Object del(Long id) {
        try {
            sysRoleService.deleteById(id);
        } catch (Exception e) {
            logger.warn("删除角色发生异常：", e);
            return Responses.error();
        }
        return  Responses.success();
    }
}
