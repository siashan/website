package com.web.site.controller.sys;

import com.web.site.common.controller.BaseController;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.sys.SysMenu;
import com.web.site.service.sys.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/6 11:21
 * @Modified By:
 */
@RestController
@RequestMapping("sys/menu")
public class SysMenuController extends BaseController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("menuList")
    public Object menuList(){
        return Responses.success(sysMenuService.selectTree());
    }

    @RequestMapping("del")
    public Object del(Long id){
        return sysMenuService.delete(id) ? Responses.success() : Responses.error();
    }

    @RequestMapping("save")
    public Object save(SysMenu menu){
        if (null == menu.getId()){
            menu.setStatus("1");
            menu.setCreateTime(new Date());
            sysMenuService.insertSelective(menu);
        }else{
            SysMenu menu1 = sysMenuService.selectByPrimaryKey(menu.getId());
            menu1.setName(menu.getName());
            menu1.setType(menu.getType());
            menu1.setUrl(menu.getUrl());
            menu1.setIcon(menu.getIcon());
            menu1.setPermissions(menu.getPermissions());
            menu1.setPath(menu.getPath());
            menu1.setComponent(menu.getComponent());
            menu1.setRedirectPath(menu.getRedirectPath());
            menu1.setIsHiddren(menu.getIsHiddren());
            menu1.setOrderBy(menu.getOrderBy());


            sysMenuService.updateByPrimaryKey(menu1);
        }
        return Responses.success();
    }
}
