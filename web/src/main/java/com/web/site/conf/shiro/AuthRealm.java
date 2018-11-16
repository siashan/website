package com.web.site.conf.shiro;



import com.web.site.entity.sys.SysUser;
import com.web.site.service.sys.SysMenuService;
import com.web.site.service.sys.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.Set;

public class AuthRealm extends AuthorizingRealm {
    @Lazy
    @Autowired
    private SysUserService sysUserService;
    @Lazy
    @Autowired
    private SysMenuService sysMenuService;
    private SimpleAuthenticationInfo info = null;

    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;//获取用户输入的token
        String username = utoken.getUsername();
        SysUser user = sysUserService.findByUserName(username);
        if (null != user) {
            // 用户加密盐
            ByteSource salt = ByteSource.Util.bytes(user.getSalt());
//            info = new SimpleAuthenticationInfo(user, user.getPassword(), salt, this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
            // 此处将用户名当做Principal，因为如果将用户对象当做Principal，生成的cookie大小可能会超过4kb造成记住我失效
            // 浏览器cookie一般最大值不超过4KB
            info = new SimpleAuthenticationInfo(username, user.getPassword(), salt, this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
        } else {
            // 如果没有查询到，抛出一个异常
            throw new AuthenticationException();
        }
        // 初始化
        SysUser sysUser = sysUserService.initUserShiroContext(username);
        Shiro.setSessionAttribute("user", sysUser);
        return info;
    }

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {

        Set<String> shiroPerSet = Shiro.getUser().getShiroPerSet();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(shiroPerSet);
        return info;
    }

}