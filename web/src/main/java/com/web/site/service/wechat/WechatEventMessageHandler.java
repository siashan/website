package com.web.site.service.wechat;

import com.alibaba.fastjson.JSONObject;
import org.weixin4j.Weixin;
import org.weixin4j.WeixinBuilder;
import org.weixin4j.WeixinException;
import org.weixin4j.component.UserComponent;
import org.weixin4j.factory.WeixinFactory;
import org.weixin4j.model.message.OutputMessage;
import org.weixin4j.model.message.event.*;
import org.weixin4j.model.message.output.TextOutputMessage;
import org.weixin4j.model.user.User;
import org.weixin4j.spi.IEventMessageHandler;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/11/5 15:43
 * @Modified By:
 */
public class WechatEventMessageHandler implements IEventMessageHandler {
    @Override
    public OutputMessage subscribe(SubscribeEventMessage subscribeEventMessage) {

        Weixin weixin = new Weixin();
        UserComponent userComponent = new UserComponent(weixin);
        try {
            User info = userComponent.info(subscribeEventMessage.getFromUserName());
            System.out.println(JSONObject.toJSONString(info));
        } catch (WeixinException e) {
            e.printStackTrace();
        }


        TextOutputMessage message = new TextOutputMessage();
        message.setContent("我是自定义的。。。。。。");
        return message;
    }

    @Override
    public OutputMessage unSubscribe(UnSubscribeEventMessage unSubscribeEventMessage) {
        return null;
    }

    @Override
    public OutputMessage qrsceneSubscribe(QrsceneSubscribeEventMessage qrsceneSubscribeEventMessage) {
        return null;
    }

    @Override
    public OutputMessage qrsceneScan(QrsceneScanEventMessage qrsceneScanEventMessage) {
        return null;
    }

    @Override
    public OutputMessage location(LocationEventMessage locationEventMessage) {
        return null;
    }

    @Override
    public OutputMessage click(ClickEventMessage clickEventMessage) {
        return null;
    }

    @Override
    public OutputMessage view(ViewEventMessage viewEventMessage) {
        return null;
    }

    @Override
    public OutputMessage scanCodePush(ScanCodePushEventMessage scanCodePushEventMessage) {
        return null;
    }

    @Override
    public OutputMessage scanCodeWaitMsg(ScanCodeWaitMsgEventMessage scanCodeWaitMsgEventMessage) {
        return null;
    }

    @Override
    public OutputMessage picSysPhoto(PicSysPhotoEventMessage picSysPhotoEventMessage) {
        return null;
    }

    @Override
    public OutputMessage picPhotoOrAlbum(PicPhotoOrAlbumEventMessage picPhotoOrAlbumEventMessage) {
        return null;
    }

    @Override
    public OutputMessage picWeixin(PicWeixinEventMessage picWeixinEventMessage) {
        return null;
    }

    @Override
    public OutputMessage locationSelect(LocationSelectEventMessage locationSelectEventMessage) {
        return null;
    }
}
