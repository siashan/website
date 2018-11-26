package com.web.site.common.controller;

import com.web.site.common.consts.PUBConstants;
import com.web.site.common.orm.Page;
import com.web.site.common.spring.DateEditor;
import com.web.site.common.spring.StringEscapeEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected HttpServletRequest req;


    @Autowired
    protected HttpSession session;

    protected boolean isGET() {
        return "GET".equalsIgnoreCase(req.getMethod());
    }

    protected String ctx() {
        return req.getContextPath();
    }


    /**
     * Description: 获取分页对象 <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/2 9:46
     */
    protected Page initPage() {
        String cur = req.getParameter("currentPage");
        String size = req.getParameter("pageSize");
        int curPage = (cur == null || "0".equals(cur) ? 1 : Integer.parseInt(cur));
        int pageSize = (size == null ? PUBConstants.DEFAULT_PAGESIZE : Integer.parseInt(size));
        return new Page(curPage, pageSize);
    }


    /**
     * Description:  获取远程真实IP<br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/2 9:50
     */
    protected String getRemoteIp() {
        String remoteIp = req.getHeader("x-forwarded-for");
        String unknown = "unknown";
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getHeader("X-Real-IP");
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getHeader("Proxy-Client-IP");
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getHeader("WL-Proxy-Client-IP");
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getHeader("HTTP_CLIENT_IP");
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getRemoteAddr();
        }
        if (remoteIp == null || remoteIp.isEmpty() || unknown.equalsIgnoreCase(remoteIp)) {
            remoteIp = req.getRemoteHost();
        }
        return remoteIp;
    }


    /**
     * 封装请求参数到map
     *
     * @param request
     * @return
     */
    public static Map<String, String> requestMap(HttpServletRequest request) {
        Map<String, String> map = new HashMap();
        Enumeration<String> keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            map.put(key, request.getParameter(key));
        }
        return map;
    }


    /**
     * Description:获取session中的值  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/26 10:32
     */
    protected Object getSessionField(String key) {
        return  req.getSession().getAttribute(key);
    }

    /**
     * Description: 判断session中的值是否存在 <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/4/26 10:32
     */
    protected boolean checkSessionFieldExist(String key){
        return  null == getSessionField(key);
    }


    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringEscapeEditor());
        binder.registerCustomEditor(Date.class, new DateEditor());
    }


}
