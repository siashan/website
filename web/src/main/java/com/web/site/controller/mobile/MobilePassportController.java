package com.web.site.controller.mobile;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.web.site.common.consts.PUBConstants;
import com.web.site.common.controller.BaseController;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.Responses;
import com.web.site.common.support.msg.MsgApi;
import com.web.site.common.support.msg.MsgResponse;
import com.web.site.common.support.validator.constraints.IsMobile;
import com.web.site.common.support.validator.constraints.IsPassword;
import com.web.site.entity.member.Member;
import com.web.site.service.member.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import jodd.util.RandomString;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/24 15:03
 * @Modified By:
 */
@RestController
@RequestMapping("mobile/passport")
@Validated
@Api(value = "移动端注册登录相关api", tags = "移动端注册登录相关api")
public class MobilePassportController extends BaseController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private DefaultKaptcha producer;

    private static CacheManager cacheManager = CacheManager.newInstance();

    /**
     * Description:注册  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/24 15:14
     */
    @ApiOperation(value = "会员注册", notes = "手机端会员注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "smsCapacha", value = "短信验证码", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "un", value = "推荐码", required = false, paramType = "form", dataType = "Integer")
    })

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Object register(
            @RequestParam(name = "mobile")
            @IsMobile()
                    String mobile,
            @RequestParam("password")
            @IsPassword
                    String passpword,
            String smsCapacha,
            String un) {
        Element smsCache = cacheManager.getCache("smsCache").get(mobile);
        Object objectValue = smsCache.getObjectValue();
        if (null == smsCache || smsCache.isExpired() || null == objectValue){
            return Responses.error(ResponseCode.CODE_10001,"验证码无效");
        }
        if (!smsCapacha.equalsIgnoreCase(objectValue.toString())){
            return Responses.error(ResponseCode.CODE_10001,"验证码无效");
        }
        Member member = memberService.selectByMobile(mobile);
        // 判断手机号是否注册
        if (null != member) {
            return Responses.error(ResponseCode.CODE_20005,"手机号已注册");
        }
        // 注册
        memberService.register(mobile, passpword, un);
        return Responses.success("注册成功");
    }

    /**
     * Description:用户名密码登陆  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/26 14:06
     */
    @ApiOperation(value = "会员登录", notes = "用户名密码登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "form", dataType = "String"),
    })
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Object login(
            @IsMobile()
                    String mobile,
            @IsPassword
                    String password) {
        Member member = memberService.checkLogin(mobile, password);
        if (null == member) {
            return Responses.error(ResponseCode.CODE_20002,"用户名或密码错误");
        }
        // 登陆成功
        session.setAttribute(PUBConstants.SESSION_CUR_USER, member.getId());
        session.setAttribute(PUBConstants.SESSION_CUR_USER_OBJ, member);
        return Responses.success();
    }

    @ApiOperation(value = "生成图形验证码", notes = "会员注册生成图形验证码")
    @RequestMapping(value = "/captcha", method = RequestMethod.POST)
    public Object captcha(HttpServletResponse response) throws ServletException, IOException {

        // 生成文字验证码

        String text = producer.createText();
        cacheManager.getCache("graphCache").put(new Element(session.getId(), text));
        // 生成图片验证码
        ByteArrayOutputStream outputStream = null;
        BufferedImage image = producer.createImage(text);

        outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outputStream);

        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return Responses.success(encoder.encode(outputStream.toByteArray()));
    }

    @ApiOperation(value = "发送验证码", notes = "会员注册发送短信验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "captcha", value = "图形验证码", required = true, paramType = "form", dataType = "String"),
    })
    @RequestMapping(value = "sendMsg",method = RequestMethod.POST)
    public Object sendMsg(
            @IsMobile
                    String mobile,
            @NotNull
            String captcha) {
        Element graphCache = cacheManager.getCache("graphCache").get(session.getId());
        if (null == graphCache || graphCache.isExpired() || null == graphCache.getObjectValue()) {
            return Responses.error(ResponseCode.CODE_10001,"验证码无效");
        }
        if (!captcha.equalsIgnoreCase(graphCache.getObjectValue().toString())){
            return Responses.error(ResponseCode.CODE_10001,"验证码无效");
        }
        // 发送短信验证码
        String msgCaptcha = RandomString.getInstance().randomNumeric(4);
        Map<String, String> params = new HashMap<>();
        params.put("captcha", msgCaptcha);
        MsgResponse msgResponse = MsgApi.sendMsg(mobile, MsgApi.MEMBER_REGISTER, params);
        if (msgResponse.isSuccess()) {
            cacheManager.getCache("smsCache").put(new Element(mobile, msgCaptcha));
            return Responses.success("短信发送成功");
        } else {
            return Responses.error(ResponseCode.CODE_30003,"短信发送失败");
        }
    }


}
