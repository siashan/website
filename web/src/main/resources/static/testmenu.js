[{
    "path": "/sys",
    "component": "Layout",
    "children": [{
        "path": "user",
        "component": "views/sys/SysUser/SysUser",
        "children": [{
            "path": "/user/add",
            "component": "views/sys/SysUser/SysUserAdd",
            "name": "新增用户",
            "type": "4"
        }, {
            "path": "user/add",
            "component": "views/sys/SysUser/SysUserAdd",
            "name": "修改用户",
            "type": "4"
        }, {"name": "删除用户", "type": "4"}],
        "name": "用户管理",
        "icon": "fa fa-user",
        "type": "2"
    }, {
        "children": [{"name": "新增菜单", "type": "4"}, {"name": "修改菜单", "type": "4"}, {"name": "删除菜单", "type": "4"}],
        "name": "菜单管理",
        "icon": "fa fa-bars",
        "type": "2"
    }, {
        "children": [{"name": "新增数据字典", "type": "4"}, {"name": "修改数据字典", "type": "4"}, {"name": "删除数据字典", "type": "4"}],
        "name": "数据字典",
        "icon": "fa fa-book",
        "type": "2"
    }, {
        "children": [{"name": "新增角色", "type": "4"}, {"name": "修改角色", "type": "4"}, {"name": "删除角色", "type": "4"}],
        "name": "角色管理",
        "icon": "fa fa-heart",
        "type": "2"
    }],
    "name": "系统管理",
    "icon": "fa fa-home",
    "type": "1"
}, {
    "redirect": "/test/index",
    "path": "/test1",
    "component": "views/documentation/test",
    "children": [{"path": "/test11", "name": "测试按钮", "type": "4"}, {"name": "测试按钮2", "type": "4"}],
    "name": "测试1",
    "type": "6"
}]
