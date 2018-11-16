package com.web.site.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import java.util.Set;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/8/17 15:06
 * @Modified By:
 */
public class JsonUtil {

    /**
     * Description:字符串转json对象  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/8/17 15:13
     */
    public static JSONObject str2JsonObject(String jsonStr){
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        return jsonObject;
    }

    /**
     * Description:字符串转jsonarray  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/8/17 15:13
     */
    public static JSONArray str2JSONArray(String jsonStr){
        JSONArray jsonArray = JSONArray.parseArray(jsonStr);
        return jsonArray;
    }

    /**
     * Description:Java对象转json字符串  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/8/17 15:14
     */
    public static String obj2jsonStr(Object obj,String[] excludesProperties){
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
        Set<String> excludes = filter.getExcludes();
        for(String s : excludesProperties){
            excludes.add(s);
        }
        String jsonString = JSONObject.toJSONString(obj, filter);
        return jsonString;
    }
}
