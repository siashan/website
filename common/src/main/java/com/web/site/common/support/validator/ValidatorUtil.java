package com.web.site.common.support.validator;

import jodd.util.StringUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/25 14:37
 * @Modified By:
 */
public class ValidatorUtil {
    //手机号格式表达式
    private static final Pattern MOBILE_REGEX = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
    // 密码格式表达式(6-16位，包含大小写字母和下-_)
    private static final Pattern PASSWORD_REGEX =Pattern.compile("^[\\w_-]{6,16}$");
    /**
     * 校验src是否为指定的手机号格式
     * @param src 需要校验的手机号
     * @return 是指定的手机号返回true,否则false
     */
    public static boolean isMobile(String src){
        if (StringUtil.isEmpty(src)){
            return false;
        }
        Matcher m = MOBILE_REGEX.matcher(src);
        return m.matches();
    }

    /**
     * Description:校验密码  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/25 15:48
     */
    public static boolean isPassword(String password){
        if (StringUtil.isEmpty(password)){
            return false;
        }
        Matcher matcher = PASSWORD_REGEX.matcher(password);
        return matcher.matches();
    }
}
