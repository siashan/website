package com.web.site.controller.sys;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.sys.SysUser;
import com.web.site.entity.sys.SysUserExample;
import com.web.site.entity.sys.SysUserRole;
import com.web.site.service.sys.SysUserService;
import jodd.util.StringUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/3 17:58
 * @Modified By:
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController extends BaseController{

    @Autowired
    private SysUserService sysUserService;

    @RequiresPermissions("sys:user:list")
    @RequestMapping("userList")
    public Object userList(SysUser user){
        SysUserExample example = new SysUserExample();
        example.setOrderByClause(" id desc ");
        SysUserExample.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotBlank(user.getName())){
            criteria.andNameLike("%"+user.getName()+"%");
        }
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) sysUserService.countByExample(example));
        List<SysUser> sysUsers = sysUserService.selectByExample(example);
        return Responses.bt(page.getTotal(),sysUsers);
    }
    @RequiresPermissions("sys:user:save")
    @RequestMapping("save")
    public Object save(SysUser user,String rePassword,String roleList){
        if (null == user.getId()){
            sysUserService.create(user,roleList);
        }else{
            sysUserService.update(user,roleList);
        }
        return Responses.success("");
    }

    @RequiresPermissions("sys:user:del")
    @RequestMapping("del")
    public Object del(Long id){
       return sysUserService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error("删除失败");
    }

    @RequestMapping("getUser")
    public Object getUser(Long id){
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(SysUser.class,"id","name","gender","phoneNo","status","email");

        JSONArray roles = getUserRoles(sysUser);
        String str =  JSONObject.toJSONString(sysUser,filter);
        JSONObject o = JSONObject.parseObject(str);
        o.put("roleList",roles);
        return Responses.success(o);
    }



    private JSONArray getUserRoles(SysUser sysUser) {
        List<SysUserRole> list = sysUserService.findUserRoles(sysUser);
        if (!list.isEmpty() && list.size() > 0) {
            JSONArray sb = new JSONArray();
            for (SysUserRole sur : list) {
                sb.add(sur.getRoleId());
            }
            return sb;
        }
        return null;
    }
}
