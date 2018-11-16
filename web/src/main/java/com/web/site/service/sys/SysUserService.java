package com.web.site.service.sys;

import com.web.site.dao.sys.SysUserMapper;
import com.web.site.dao.sys.SysUserRoleMapper;
import com.web.site.entity.sys.SysUser;
import com.web.site.entity.sys.SysUserExample;
import com.web.site.entity.sys.SysUserRole;
import com.web.site.entity.sys.SysUserRoleExample;
import com.web.site.service.BaseService;
import jodd.util.StringUtil;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class SysUserService extends BaseService<SysUserMapper, SysUser, SysUserExample> {

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    @Value("${password.algorithmName}")
    private String algorithmName;

    @Value("${password.hashIterations}")
    private int hashIterations;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Autowired
    private SysMenuService sysMenuService;

    /**
     * Description:查询用户角色  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/9 16:16
     */
    public List<SysUserRole> findUserRoles(SysUser sysUser) {
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria c = example.createCriteria();
        c.andUserIdEqualTo(sysUser.getId());
        return sysUserRoleMapper.selectByExample(example);
    }

    @Transactional(rollbackFor = Exception.class)
    public void create(SysUser user, String roleList) {
        user.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword = new //迭代次数
                SimpleHash(algorithmName, user.getPassword(), ByteSource.Util.bytes(user.getSalt()), hashIterations).toHex();
        user.setPassword(newPassword);
        insertSelective(user);
        // 保存用户角色信息
        saveRole(user, roleList);
    }

    @Transactional
    public void update(SysUser user, String roleList) {
        updateByPrimaryKeySelective(user);
        saveRole(user, roleList);
    }

    private void saveRole(SysUser user, String roleList) {
        // 删除用户原有的角色，重新分配
        sysUserRoleMapper.deleteByUserId(user.getId());
        String[] roles = roleList.split(",");
        ArrayList list = new ArrayList();
        for (String roleId : roles) {
            Long rId = Long.parseLong(roleId);
            SysUserRole sur = new SysUserRole();
            sur.setRoleId(rId);
            sur.setUserId(user.getId());
            list.add(sur);
        }
        sysUserRoleMapper.insertBatch(list);
    }

    public SysUser findByUserName(String username) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria c = example.createCriteria();
        c.andNameEqualTo(username);
        List<SysUser> sysUsers = selectByExample(example);
        if (!sysUsers.isEmpty() && sysUsers.size() > 0) {
            return sysUsers.get(0);
        }
        return null;
    }

    /**
     * Description:  用户权限列表for Shiro<br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/10 14:29
     */
    public Set<String> getShiroPerSet(Long userId) {
        List<String> permissionsList = queryAllPerms(userId);
        Set<String> permsSet = new HashSet<>();
        for (String permission : permissionsList) {
            if (StringUtil.isBlank(permission)) {
                continue;
            }
            permsSet.addAll(Arrays.asList(permission.trim().split(",")));
        }
        return permsSet;
    }

    /**
     * Description:  查询用户所有权限<br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/10 9:30
     */
    public List<String> queryAllPerms(Long id) {
        return baseMapper.queryAllPerms(id);
    }

    public SysUser initUserShiroContext(String username) {
        SysUser user = findByUserName(username);
        // 用户菜单信息
        //        ArrayList<SysMenu> menuLift = sysMenuService.getUserMenu(user.getId());
        // 用户权限
        Set<String> permsSet = getShiroPerSet(user.getId());
        user.setShiroPerSet(permsSet);
        //        user.setUserMenus(menuLift);
        return user;
    }

    public SysUser findByOpenId(String openId) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        return selectOneByExample(example);
    }

    public boolean checkPassword(SysUser sysUser, String oldPwd) {
        String newPassword = new SimpleHash(algorithmName, oldPwd, ByteSource.Util.bytes(sysUser.getSalt()), hashIterations).toHex();
        return newPassword.equals(sysUser.getPassword());
    }

    public void changePassword(SysUser sysUser, String newPwd) {
        sysUser.setIsPasswordChanged("1");
        String newPassword = new SimpleHash(algorithmName, newPwd, ByteSource.Util.bytes(sysUser.getSalt()), hashIterations).toHex();
        sysUser.setPassword(newPassword);
        updateByPrimaryKeySelective(sysUser);
    }


}