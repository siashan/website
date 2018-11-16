[{
    "path": "/sys",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirct": "/sys/index",
    "alwaysShow": true,
    "meta": {"title": "系统管理", "icon": "lock", "roles": ["admin"]},
    "children": [{
        "path": "user",
        "name": "用户管理",
        "meta": {"title": "用户管理", "is_final": true, "roles": ["admin"]}
    }, {
        "path": "user/add",
        "hidden": true,
        "name": "userAdd",
        "meta": {"title": "新增用户", "roles": ["admin"]}
    }, {"path": "dict", "name": "字典管理", "meta": {"title": "字典管理", "roles": ["admin"]}}, {
        "path": "menu",
        "name": "菜单管理",
        "meta": {"title": "菜单管理", "roles": ["admin"]}
    }, {"path": "role", "name": "角色管理", "meta": {"title": "角色管理", "roles": ["admin"]}}, {
        "path": "role/add",
        "hidden": true,
        "name": "roleAdd",
        "meta": {"title": "新增角色", "roles": ["admin"]}
    }, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/icon",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "children": [{
        "path": "index",
        "name": "icons",
        "meta": {"title": "icons", "icon": "icon", "noCache": true, "single": true}
    }, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/components",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirect": "noredirect",
    "name": "component-demo",
    "meta": {"title": "components", "icon": "component"},
    "children": [{"path": "tinymce", "name": "tinymce-demo", "meta": {"title": "tinymce"}}, {
        "path": "markdown",
        "name": "markdown-demo",
        "meta": {"title": "markdown"}
    }, {"path": "json-editor", "name": "jsonEditor-demo", "meta": {"title": "jsonEditor"}}, {
        "path": "splitpane",
        "name": "splitpane-demo",
        "meta": {"title": "splitPane"}
    }, {"path": "avatar-upload", "name": "avatarUpload-demo", "meta": {"title": "avatarUpload"}}, {
        "path": "dropzone",
        "name": "dropzone-demo",
        "meta": {"title": "dropzone"}
    }, {"path": "sticky", "name": "sticky-demo", "meta": {"title": "sticky"}}, {
        "path": "count-to",
        "name": "countTo-demo",
        "meta": {"title": "countTo"}
    }, {"path": "mixin", "name": "componentMixin-demo", "meta": {"title": "componentMixin"}}, {
        "path": "back-to-top",
        "name": "backToTop-demo",
        "meta": {"title": "backToTop"}
    }, {"path": "drag-dialog", "name": "dragDialog-demo", "meta": {"title": "dragDialog"}}, {
        "path": "dnd-list",
        "name": "dndList-demo",
        "meta": {"title": "dndList"}
    }, {"path": "drag-kanban", "name": "dragKanban-demo", "meta": {"title": "dragKanban"}}, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/charts",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirect": "noredirect",
    "name": "charts",
    "meta": {"title": "charts", "icon": "chart"},
    "children": [{
        "path": "keyboard",
        "name": "keyboardChart",
        "meta": {"title": "keyboardChart", "noCache": true}
    }, {"path": "line", "name": "lineChart", "meta": {"title": "lineChart", "noCache": true}}, {
        "path": "mixchart",
        "name": "mixChart",
        "meta": {"title": "mixChart", "noCache": true}
    }, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/tab",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "children": [{
        "path": "index",
        "name": "tab",
        "meta": {"title": "tab", "icon": "tab", "single": true}
    }, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/table",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirect": "/table/complex-table",
    "name": "table",
    "meta": {"title": "Table", "icon": "table"},
    "children": [{
        "path": "dynamic-table",
        "name": "dynamicTable",
        "meta": {"title": "dynamicTable"}
    }, {"path": "drag-table", "name": "dragTable", "meta": {"title": "dragTable"}}, {
        "path": "inline-edit-table",
        "name": "inlineEditTable",
        "meta": {"title": "inlineEditTable"}
    }, {"path": "tree-table", "name": "treeTableDemo", "meta": {"title": "treeTable"}}, {
        "path": "custom-tree-table",
        "name": "customTreeTableDemo",
        "meta": {"title": "customTreeTable"}
    }, {"path": "complex-table", "name": "complexTable", "meta": {"title": "complexTable"}}, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/example",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirect": "/example/list",
    "name": "example",
    "meta": {"title": "example", "icon": "example"},
    "children": [{
        "path": "create",
        "name": "createArticle",
        "meta": {"title": "createArticle", "icon": "edit"}
    }, {
        "path": "edit/:id(\\d+)",
        "name": "editArticle",
        "meta": {"title": "editArticle", "noCache": true},
        "hidden": true
    }, {"path": "list", "name": "articleList", "meta": {"title": "articleList", "icon": "list"}}, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {
    "path": "/nested",
    "component": {
        "name": "layout",
        "components": {
            "Navbar": {
                "components": {
                    "Breadcrumb": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-84806d6e",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Breadcrumb\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Hamburger": {
                        "name": "hamburger",
                        "props": {"isActive": {"default": false}, "toggleClick": {"default": null}},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-b8942842",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Hamburger\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "ErrorLog": {
                        "name": "errorLog",
                        "computed": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-62e56fbc",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ErrorLog\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "Screenfull": {
                        "name": "screenfull",
                        "props": {"width": {"default": 22}, "height": {"default": 22}, "fill": {"default": "#48576a"}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-416a9041",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\Screenfull\\index.vue",
                        "beforeDestroy": [null]
                    },
                    "LangSelect": {
                        "computed": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-c0b435e0",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\LangSelect\\index.vue",
                        "beforeDestroy": [null],
                        "_Ctor": {},
                        "inject": {}
                    },
                    "ThemePicker": {
                        "watch": {},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ThemePicker\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-bb4f6990",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\Navbar.vue",
                "beforeDestroy": [null]
            },
            "Sidebar": {
                "components": {
                    "SidebarItem": {
                        "name": "SidebarItem",
                        "props": {"routes": {}, "isNest": {"default": false}},
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "__file": "src\\views\\layout\\components\\Sidebar\\SidebarItem.vue",
                        "beforeCreate": [null],
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\Sidebar\\index.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "AppMain": {
                "name": "AppMain",
                "computed": {},
                "staticRenderFns": [],
                "_compiled": true,
                "__file": "src\\views\\layout\\components\\AppMain.vue",
                "beforeCreate": [null],
                "beforeDestroy": [null]
            },
            "TagsView": {
                "components": {
                    "ScrollPane": {
                        "name": "scrollPane",
                        "methods": {},
                        "staticRenderFns": [],
                        "_compiled": true,
                        "_scopeId": "data-v-5dabeaca",
                        "beforeCreate": [null, null],
                        "__file": "src\\components\\ScrollPane\\index.vue",
                        "beforeDestroy": [null]
                    }
                },
                "computed": {},
                "watch": {},
                "methods": {},
                "staticRenderFns": [],
                "_compiled": true,
                "_scopeId": "data-v-2edda286",
                "beforeCreate": [null, null],
                "__file": "src\\views\\layout\\components\\TagsView.vue",
                "beforeDestroy": [null]
            }
        },
        "mixins": [{"watch": {}, "methods": {}}],
        "computed": {},
        "methods": {},
        "staticRenderFns": [],
        "_compiled": true,
        "_scopeId": "data-v-54b6c990",
        "beforeCreate": [null, null],
        "__file": "src\\views\\layout\\Layout.vue",
        "beforeDestroy": [null]
    },
    "redirect": "/nested/bar/profile",
    "name": "nested",
    "meta": {"title": "nested", "icon": "nested"},
    "children": [{
        "path": "/nested/bar",
        "name": "bar",
        "meta": {"title": "bar"},
        "children": [{"path": "profile", "name": "bar-profile", "meta": {"title": "barProfile"}}, {
            "path": "posts",
            "name": "bar-posts",
            "meta": {"title": "barPosts"}
        }, {
            "path": "test",
            "name": "ttttt",
            "hidden": true,
            "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
        }]
    }, {
        "path": "test",
        "name": "ttttt",
        "hidden": true,
        "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
    }]
}, {"path": "*", "redirect": "/404", "hidden": true}, {
    "path": "test",
    "name": "ttttt",
    "hidden": true,
    "meta": {"title": "documentation1111", "icon": "documentation", "noCache": true}
}]