package com.web.site.controller.common;

import com.web.site.common.support.response.Responses;
import com.web.site.service.sys.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/5 15:19
 * @Modified By:
 */
@RestController
@RequestMapping("comm")
public class CommonController {
    @Autowired
    private SysDictService sysDictService;

    @RequestMapping("dictItem")
    public Object dictItem(String groups){
        String[] group = groups.split(",");
        Map<String, Object> map = sysDictService.initDict();
        Map reMap = new HashMap();
        if (group.length>0){
            for (String str: group){
                reMap.put(str,map.get(str));
            }
        }
        return Responses.success(reMap);
    }

    @RequestMapping("dictMap")
    public Object dictMap(String groups){
        String[] group = groups.split(",");
        Map<String, Object> map = sysDictService.initDictMap();
        Map reMap = new HashMap();
        if (group.length>0){
            for (String str: group){
                reMap.put(str,map.get(str));
            }
        }
        return Responses.success(reMap);
    }
}
