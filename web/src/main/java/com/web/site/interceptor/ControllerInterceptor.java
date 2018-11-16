package com.web.site.interceptor;

import com.web.site.conf.shiro.Shiro;
import com.web.site.entity.sys.SysLog;
import com.web.site.entity.sys.SysUser;
import com.web.site.service.sys.SysLogService;
//import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//@Aspect
//@Component
public class ControllerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerInterceptor.class);

    @Autowired
    private SysLogService sysLogService;
    /**
     * 定义拦截规则：拦截com.xjj.web.controller包下面的所有类中，有@RequestMapping注解的方法。
     */
    @Pointcut("execution(* com.web.site.controller..*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut() {
    }

    /**
     * 拦截器具体实现
     *
     * @param pjp
     * @return JsonResult（被拦截方法的执行结果，或需要登录的错误提示。）
     */
    @Around("controllerMethodPointcut()") //指定拦截器规则；也可以直接把“execution(* com.xjj.........)”写进这里
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名
        logger.info("请求开始，方法：{}", methodName);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String requestURI = request.getRequestURI();
        System.out.println(request.getRequestURL());
        logger.info("uri:{}",requestURI);
        SysUser user = Shiro.getUser();
        if (null != user){
            Long userId = Shiro.getUserId();
            logger.info("userId:{}",userId);
            SysLog sysLog = new SysLog();
//            DefaultKeyGenerator keyGenerator = new DefaultKeyGenerator();
//            sysLog.setId(keyGenerator.generateKey().longValue());
            sysLog.setCreateTime(new Date());
            sysLog.setOperator(userId);
            sysLog.setUrl(requestURI);
//            sysLogService.insertSelective(sysLog);
            sysLogService.insert(sysLog);
        }

        Object result = null;
        result = pjp.proceed();
        return result;
    }

}
