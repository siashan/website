package com.web.site.service.sys;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.web.site.common.consts.PUBConstants;
import com.web.site.dao.sys.SysMenuMapper;
import com.web.site.entity.sys.SysMenu;
import com.web.site.entity.sys.SysMenuExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Small
 * @since 2018-07-27
 */
@Service
public class SysMenuService extends BaseService<SysMenuMapper, SysMenu, SysMenuExample> {

    public List<SysMenu> selectTree() {
//	    List<SysMenu> menuTree = baseMapper.selectTree();
//	    //	    System.out.println(JSONArray.toJSONString(menuTree));

        SysMenuExample example = new SysMenuExample();
        example.setOrderByClause(" id ");
        List<SysMenu> sysMenus = selectByExample(example);
        List<SysMenu> menuTree = new ArrayList<>();

        SysMenu rootMenu = sysMenus.get(0);
        menuTree.add(rootMenu);

        fillMenu(menuTree, sysMenus, rootMenu);


        List<SysMenu> copyList = new ArrayList<SysMenu>();
        // 填充根节点
        SysMenu menu = menuTree.get(0);
        menu = fillMenu(menu, menuTree);
        copyList.add(menu);
        return copyList;

    }


    private void fillMenu(List<SysMenu> reList, List<SysMenu> srcMenus, SysMenu rootMenu) {
        List<SysMenu> menuList1 = srcMenus.stream().filter((SysMenu m1) -> m1.getParentId().longValue() == rootMenu.getId().longValue()).collect(Collectors.toList());
        if (!menuList1.isEmpty()) {
            menuList1.sort(new Comparator<SysMenu>() {
                @Override
                public int compare(SysMenu o1, SysMenu o2) {
                    return o1.getOrderBy() - o2.getOrderBy();
                }
            });

            for (SysMenu m : menuList1) {
                reList.add(m);
                fillMenu(reList, srcMenus, m);
            }
        }
    }


    private SysMenu fillMenu(SysMenu menu, List<SysMenu> menuTree) {
        List<SysMenu> children = menuTree.stream().filter((SysMenu m) -> m.getParentId().longValue() == menu.getId().longValue()).collect(Collectors.toList());
        if (!children.isEmpty()) {
            menu.setChildren((ArrayList<SysMenu>) children);
            for (SysMenu child : menu.getChildren()) {
                fillMenu(child, menuTree);
            }
        }
        return menu;
    }

    /**
     * Description:用户菜单列表  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/10 14:34
     */
    public ArrayList<JSONObject> getUserMenu(Long id) {
        List<SysMenu> menus = getUserFatherMenuList(id);
        ArrayList<JSONObject> menuLift = new ArrayList<>();
        // 过滤出type 为  1,6的菜单
        List<SysMenu> menuList = menus.stream().filter((SysMenu m) -> m.getType().equals(PUBConstants.MENU_TYPE_1) || m.getType().equals(PUBConstants.MENU_TYPE_6)).collect(Collectors.toList());
        // 循环封装
        for (SysMenu m : menuList) {
            genType11(menus, m, menuLift);
        }
        return menuLift;
    }

    private void genType11(List<SysMenu> menus, SysMenu m, ArrayList<JSONObject> menuLift) {
        //        long l = System.currentTimeMillis();
        menuLift.add(genType1(menus, m));
        //        System.out.println("用时：" + (System.currentTimeMillis()-l));
    }

    private JSONObject genType1(List<SysMenu> menus, SysMenu m) {
        JSONObject jsonMenu = genMenu(m);
        menus.remove(m);
        List<SysMenu> children = menus.stream().filter((SysMenu mu) -> mu.getParentId().longValue() == m.getId().longValue()).collect(Collectors.toList());
        if (!children.isEmpty()) {
            JSONArray arr = new JSONArray();
            for (SysMenu sm2 : children) {
                JSONObject jsonObject = genType1(menus, sm2);
                arr.add(jsonObject);
                menus.remove(sm2);
            }
            jsonMenu.put("children", arr);
        }
        return jsonMenu;
    }

    private JSONObject genMenu(SysMenu m) {
        JSONObject jo = new JSONObject();
        jo.put("path", m.getPath());
        jo.put("redirect", m.getRedirectPath());
        jo.put("component", m.getComponent());
        jo.put("name", m.getName());
        jo.put("icon", m.getIcon());
        jo.put("type", m.getType());
        if (m.getType().equals(PUBConstants.MENU_TYPE_4)) {
            jo.put("perm", m.getUrl());
        }
        return jo;
    }

    public List<SysMenu> getUserFatherMenuList(Long id) {

//	    return baseMapper.getUserFatherMenuList(id);
        List<SysMenu> userFatherMenuList = baseMapper.getUserFatherMenuList(id);
//		long rootId = 1;
        List<SysMenu> menuTree = new ArrayList<>();

        SysMenu rootMenu = selectByPrimaryKey(1l);

        fillMenu(menuTree, userFatherMenuList, rootMenu);
        return menuTree;
    }

    public List<SysMenu> selectByParentId(Long id) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        return selectByExample(example);
    }

    @Transactional
    public boolean delete(Long id) {
        try {
            List<SysMenu> menus = selectByParentId(id);
            if (!menus.isEmpty()) {
                for (SysMenu menu : menus) {
                    delete(menu.getId());
                }
            }
            deleteByPrimaryKey(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}