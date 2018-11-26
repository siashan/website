package com.web.site.common.support.msg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/27 14:05
 * @Modified By:
 */
public class MsgApi {
    private static Logger logger = LoggerFactory.getLogger(MsgApi.class);
    public static final String MEMBER_REGISTER = "memberRegister";

    /**
     * Description:短信发送入口  <br/>
     *
     * @param:  mobile 手机号码
     * @param  bizCode 业务代码（注册，活动。。。。）
     * @param params 业务参数
     * @return:
     * @Author: kfc
     * @Date: 2018/10/29 11:48
     */
        public static MsgResponse sendMsg(String mobile, String bizCode, Map<String,String> params){
        try {
            Class clazz = Class.forName("com.web.site.common.support.msg.ali.AliMsg");
            Method declaredMethod = clazz.getDeclaredMethod(bizCode, String.class, Map.class);
            return   (MsgResponse) declaredMethod.invoke(clazz.newInstance(), mobile, params);
        } catch (Exception e) {
            logger.warn("发送短信接口调用失败:{}",e.getStackTrace());
        }
        return new MsgResponse(false,"短信路由入口异常");
    }
}
