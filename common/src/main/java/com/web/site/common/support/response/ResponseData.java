package com.web.site.common.support.response;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/11/19 16:55
 * @Modified By:
 */
public class ResponseData {
    private String code;
    private String msg;
    private Integer subCode;
    private String subMsg;
    private Object data;

    public ResponseData(){}

    public ResponseData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(String code, String msg, Integer subCode) {
        this.code = code;
        this.msg = msg;
        this.subCode = subCode;
        this.subMsg = ResponseCode.messageMap.get(subCode);
    }

    public ResponseData(String code, String msg, Integer subCode, String subMsg) {
        this.code = code;
        this.msg = msg;
        this.subCode = subCode;
        this.subMsg = subMsg;
    }

    public ResponseData(String code, String msg, Integer subCode, String subMsg, Object data) {
        this.code = code;
        this.msg = msg;
        this.subCode = subCode;
        this.subMsg = subMsg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getSubCode() {
        return subCode;
    }

    public void setSubCode(Integer subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
