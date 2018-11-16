package com.web.site.common.support.msg;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/29 13:49
 * @Modified By:
 */
public class MsgResponse {
    private boolean success;
    private String msg;

    public MsgResponse() {
    }

    public MsgResponse(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
