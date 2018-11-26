package com.web.site.common.support.response;

/**
 * 系统返回码定义
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/11/19 15:37
 * @Modified By:
 */
public class ResponseCode extends ResponseCodeDesp {

    /* 参数错误：10001-19999 */
    public static final Integer CODE_10001 = 10001;  // 参数无效
    public static final Integer CODE_10004 = 10004;  //参数缺失
    // 用户错误
    public static final Integer CODE_20001 = 20001;  //用户未登录
    public static final Integer CODE_20002 = 20002;  // 账号不存在或密码错误
    public static final Integer CODE_20005 = 20005;  //用户已存在

    // 业务错误
    public static final Integer CODE_30001 = 30001;  //系统登录失败
    public static final Integer CODE_30002 = 30002;  //文件上传失败
    public static final Integer CODE_30003 = 30003;  //短信发送失败

    // 数据错误
    public static final Integer CODE_50005 = 50005;  //数据删除失败
}
