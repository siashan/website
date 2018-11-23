package com.web.site.controller.sys;

import com.alibaba.fastjson.JSONObject;
import com.web.site.common.controller.BaseController;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.Responses;
import com.web.site.conf.shiro.Shiro;
import com.web.site.service.sys.SysMenuService;
import com.web.site.service.sys.SysUserService;
import jodd.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/6/22 16:21
 * @Modified By:
 */
@Controller
@RequestMapping("sys/passport")
public class PassportController extends BaseController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysMenuService sysMenuService;


    @ResponseBody
    @RequestMapping("login")
//    public Object doLogin(@RequestBody Map param){
    public Object doLogin(String username,String password,String rememberMe){

//        String username = (String) param.get("username");
//        String password = (String) param.get("password");
//        String rememberMe = (String) param.get("rememberMe");
        if (StringUtil.isBlank(username) || StringUtil.isBlank(password)){
            return Responses.error(ResponseCode.CODE_20002);
        }
        // 创建Subject实例
        Subject currentUser = SecurityUtils.getSubject();
        // 将用户名及密码封装到UsernamePasswordToken
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        try {
            currentUser.login(token);
            // 判断当前用户是否登录
            if (currentUser.isAuthenticated() == true) {
                String _auth_token = UUID.randomUUID().toString().replace("-", "");
                session.setAttribute("_auth_token", _auth_token);
                return Responses.success("登录成功",_auth_token);
//                return Responses.success("登录成功");
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            logger.error("登录异常：{}",e.getStackTrace());
        }
        return Responses.error(ResponseCode.CODE_30001);
    }

    @ResponseBody
    @RequestMapping("userInfo")
    public Object userInfo(){
        Map<String,Object> map = new HashMap<>();

//        map.put("roles",new String[]{"admin"});
//        map.put("roles",new String[]{"admin"});
//        map.put("roles",new String[]{"admin"});
        ArrayList<JSONObject> userMenu = sysMenuService.getUserMenu(Shiro.getUserId());
//        System.out.println(JSONObject.toJSONString(userMenu));
        map.put("roles",userMenu);
        return Responses.success("ok",map);
    }

    @ResponseBody
    @RequestMapping("logout")
    public Object logout(){
        session.invalidate();
        Shiro.logout();
        return Responses.success("退出成功");
    }


}
