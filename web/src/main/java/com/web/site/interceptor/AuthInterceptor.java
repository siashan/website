package com.web.site.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.web.site.common.consts.PUBConstants;
import com.web.site.common.support.annotation.Auth;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.ResponseData;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.member.Member;
import jodd.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;

import static com.alibaba.fastjson.serializer.SerializerFeature.*;

/**
 * 判断是否登录的拦截器
 *
 * @author zhangkeyuan
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    private static Logger log = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handleMethod = (HandlerMethod) handler;
        Auth auth = handleMethod.getMethodAnnotation(Auth.class);
        ResponseBody ajax = handleMethod.getMethodAnnotation(ResponseBody.class);
        if (null == auth) {
            // 没有声明权限,放行
            return true;
        }
        boolean isSimulate = auth.value(); // 是否是模拟登录限制的操作
        HttpSession session = request.getSession();
        // 取得session中的用户信息, 以便判断是否登录了系统
        Member worker = (Member) session.getAttribute(PUBConstants.SESSION_CUR_USER_OBJ);
        if (null == worker) {
            // 需要登录
            // ajax页面的登录
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=UTF-8");
            OutputStream out = response.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out, "utf-8"));
            // 返回json格式的提示
            ResponseData error = Responses.error(ResponseCode.CODE_20001);
            String errStr  = JSONObject.toJSONString(error, WriteMapNullValue);
//            pw.println("{\"result\":false,\"code\":11,\"errorMessage\":\"您未登录,请先登录\"}");
            pw.println(errStr);
            pw.flush();
            pw.close();
            return false;
        }
        return true;
    }

}
