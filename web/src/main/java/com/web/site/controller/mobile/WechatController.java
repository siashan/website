package com.web.site.controller.mobile;

import com.web.site.common.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.weixin4j.WeixinException;
import org.weixin4j.spi.HandlerFactory;
import org.weixin4j.spi.IMessageHandler;
import org.weixin4j.util.TokenUtil;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 微信消息
 * <p>
 * Created by kfc on 2017/1/6.
 */
@Controller
@RequestMapping("mobile")
public class WechatController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(WechatController.class);


    /**
     * 微信发起绑定服务器的Get请求
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "wechat", method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("微信服务器绑定开始");
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        if (checkSignature(signature, timestamp, nonce)) {
            logger.info("微信服务器绑定成功");
            out.print(echostr);
        } else {
            logger.warn("微信服务器绑定失败");
        }
        out.close();
    }

    /**
     * 接收用户微信消息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "wechat", method = RequestMethod.POST)
    @ResponseBody
    public String post(HttpServletRequest request, HttpServletResponse response) {
        logger.info("接收用户微信消息 :  {}", (request));
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        if (!checkSignature(signature, timestamp, nonce)) {
            logger.warn("微信消息签名验证失败");
            return "";
        }
        String result = processRequest(request, response);
        try {
            response.setContentType("text/xml;charset=UTF-8");
            logger.info("回复：{}", result);
            response.getWriter().write(result);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    private String processRequest(HttpServletRequest request, HttpServletResponse response){
        try {
            ServletInputStream in = request.getInputStream();
            IMessageHandler messageHandler = HandlerFactory.getMessageHandler();
            String xml = messageHandler.invoke(in);
            return xml;
        } catch (WeixinException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }


    /**
     * Description:微信验签  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/11/5 14:52
     */
    private boolean checkSignature(String signature, String timestamp, String nonce) {
        String token = TokenUtil.get();
        return TokenUtil.checkSignature(token, signature, timestamp, nonce);
    }
}
