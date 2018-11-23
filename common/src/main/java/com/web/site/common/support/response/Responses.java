package com.web.site.common.support.response;

import com.web.site.common.enums.UploadState;
import com.web.site.common.orm.Table;
import jodd.util.StringUtil;

import java.util.HashMap;
import java.util.List;
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
    //
//    // 成功标识
//    private static final String SUCCESS_CODE = "1";
//    // 失败标识
//    private static final String ERROR_CODE = "-1";
    // 成功标识
    private static final String SUCCESS_CODE = "SUCCESS";
    // 失败标识
    private static final String ERROR_CODE = "FAIL";
    // 默认请求成功消息
    private static final String DEFAULT_SUCCESS_MSG = "操作成功";
    // 默认请求失败消息
    private static final String DEFAULT_FAIL_MSG = "操作失败";

//    public static Map<String, Object> bt(int total, Object rows) {
//        Map<String, Object> ret = new HashMap();
//        ret.put("code", SUCCESS_CODE);
//        Map<String, Object> data = new HashMap();
//        data.put("total", total);
//        data.put("rows", rows);
//        ret.put("data", data);
//        return ret;
//    }

    public static Map<String, Object> um(boolean success, String name, String url, UploadState state) {
        Map<String, Object> ret = new HashMap();
        if (success) {
            ret.put("name", name);
            ret.put("url", url);
        }
        ret.put("state", state.value());
        return ret;
    }

    public static ResponseData table(long total, List list){
        Table table = new Table(total,list);
        return new ResponseData(SUCCESS_CODE,DEFAULT_SUCCESS_MSG,table);
    }

    public static ResponseData success() {
        return new ResponseData(SUCCESS_CODE, DEFAULT_SUCCESS_MSG);
    }

    public static ResponseData success(String msg) {
        return new ResponseData(SUCCESS_CODE,msg);
    }

    public static ResponseData success(String msg, Object data) {
        return new ResponseData(SUCCESS_CODE,msg,data);
    }

    public static ResponseData success(Object data) {
        return new ResponseData(SUCCESS_CODE,DEFAULT_SUCCESS_MSG,data);
    }

    public static ResponseData error(Integer subCode){
        return new ResponseData(ERROR_CODE,DEFAULT_FAIL_MSG,subCode);
    }

    public static ResponseData error(Integer subCode,String subMsg){
        return new ResponseData(ERROR_CODE,DEFAULT_FAIL_MSG,subCode,subMsg);
    }

}
