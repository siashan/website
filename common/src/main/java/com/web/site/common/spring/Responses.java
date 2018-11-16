package com.web.site.common.spring;

import com.web.site.common.enums.UploadState;
import jodd.util.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:  <br/>
 *
 * @param:
 * @return:
 * @Author: kfc
 * @Date: 2018/6/23 10:13
 */
public class Responses {

    // 成功标识
    private static final String SUCCESS_CODE = "1";
    // 失败标识
    private static final String ERROR_CODE = "-1";
    // 默认请求成功消息
    private static final String DEFAULT_SUCCESS_MSG = "操作成功";
    // 默认请求失败消息
    private static final String DEFAULT_FAIL_MSG = "操作失败";

    public static Map<String, Object> success(Object data) {
        return msg(SUCCESS_CODE,DEFAULT_SUCCESS_MSG, data);
    }

    public static Map<String, Object> success(String msg) {
        return msg(SUCCESS_CODE,msg, null);
    }
    public static Map<String, Object> success() {
        return msg(SUCCESS_CODE,DEFAULT_SUCCESS_MSG, null);
    }

    public static Map<String, Object> success(String msg,Object data) {
        return msg(SUCCESS_CODE,msg, data);
    }
    public static Map<String, Object> error(String errorMsg) {
        return msg(ERROR_CODE, errorMsg,null);
    }

    public static Map<String, Object> error() {
        return msg(ERROR_CODE, DEFAULT_FAIL_MSG,null);
    }


    public static Map<String, Object> msg(String code,String retMsg, Object data) {
        Map<String, Object> ret = new HashMap();
        ret.put("code", code);
        ret.put("msg",retMsg);
        if (data != null) {
            ret.put("data", data);
        } else {
            ret.put("data", "");
        }
        return ret;
    }


    public static Map<String, Object> bt(int total, Object rows) {
        Map<String, Object> ret = new HashMap();
        ret.put("code",SUCCESS_CODE);
        Map<String, Object> data = new HashMap();
        data.put("total", total);
        data.put("rows", rows);
        ret.put("data",data);
        return ret;
    }

    public static Map<String, Object> um(boolean success, String name, String url, UploadState state) {
        Map<String, Object> ret =new HashMap();
        if (success) {
            ret.put("name",name);
            ret.put("url",url);
        }
        ret.put("state", state.value());
        return ret;
    }
}
