package com.web.site.common.util;

import com.alibaba.fastjson.JSONObject;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


/**
 * httpClient工具类
 * <p/>
 * Created by kfc on 2016/11/2.
 */
public class HttpUtil {

    private static Logger log = LoggerFactory.getLogger(HttpUtil.class);
    // 默认字符集编码
    private static final String DEFAULT_CHARSET = "UTF-8";
    // 默认媒体类型
    private static final String DEFAULT_MEDIA_TYPE = "application/json";  // json格式数据类型
    private static final String MEDIA_TYPE_JAVASCRIPT = "application/javascript";  // JavaScript
    private static final String MEDIA_TYPE_MP4 = "audio/mp4";  // mp4
    private static final String MEDIA_TYPE_MP3 = "audio/mpeg";  // mp3

    /**
     * Description: GET请求 <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/6/21 10:22
     */
    public static String sendGet(String url, Map<String, String> params) {
        HttpRequest request = HttpRequest.get(url);
        request.contentType("text/json; charset=utf-8");
        request.charset(DEFAULT_CHARSET);
        if (params != null) {
            request.query(params);
        }
        HttpResponse response = request.send();
        response.charset(DEFAULT_CHARSET);
        String respJson = response.bodyText();
        return respJson;
    }

    /**
     * 发送Post请求-json数据
     *
     * @param url    : 请求的连接
     * @param params ：  请求参数，无参时传null
     * @return
     */
    public static String sendPostToJson(String url, Map<String, Object> params) {
        HttpRequest request = HttpRequest.post(url);
        request.contentType("application/json");
        request.charset(DEFAULT_CHARSET);
        //参数详情
        if (params != null) {
            request.bodyText(JSONObject.toJSONString(params),DEFAULT_MEDIA_TYPE,DEFAULT_CHARSET);
        }
        HttpResponse response = request.send();
        String respJson = response.bodyText();
        return respJson;
    }

    /**
     * Description:post请求  <br/>
     *
     * @param url 请求地址
     * @param jsonString  json字符串
     * @return:
     * @Author: kfc
     * @Date: 2018/11/1 14:04
     */
    public static String sendPostToJson(String url, String jsonString){
        HttpRequest request = HttpRequest.post(url);
        request.contentType("application/json");
        request.charset(DEFAULT_CHARSET);
        //参数详情
        if (StringUtil.isNotBlank(jsonString)) {
            request.bodyText(jsonString,DEFAULT_MEDIA_TYPE,DEFAULT_CHARSET);
        }
        HttpResponse response = request.send();
        String respJson = response.bodyText();
        return respJson;
    }


    /**
     * 发送Post请求   表单参数
     *
     * @param url    : 请求的连接
     * @param params ：  请求参数，无参时传null
     * @param params : 参数详情，没有时传null
     * @return
     */
    public static String sendPost(String url, Map<String, Object> params) {
        HttpRequest request = HttpRequest.post(url);
        request.charset(DEFAULT_CHARSET);
        //参数详情
        if (params != null) {
            request.form(params);
        }
        HttpResponse response = request.send();
        String respJson = response.bodyText();
        return respJson;
    }


    public static void main(String[] args) throws Exception {
//		String s = sendGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxfed98fa625203a63&secret=2697ca7b6e1744c0888a34fa50148fdf", null);
//		System.out.println(s);
//        TemplateMessage templateMessage = TemplateMessage.initTemplateMessage(
//                "o8jky1lssJW99TNn3ch_Mizmq3Gg", "ney3HoBAUChWpfgCGxSTmjQRLju7uZOdLAKpSDOzlNA");
//        templateMessage.addDataFirst("您的资质信息审核不通过", false);
//        templateMessage.addData("keyword1", "资质审核");
//        templateMessage.addData("keyword2", DateUtil.date2String(new Date(), "YYYY-MM-DD hh:mm:ss"));
//        templateMessage.addData("keyword3", "审核未通过");
//        templateMessage.addData("keyword4", "11111111111111");
//        templateMessage.addDataRemark("请在【个人中心】修改资质信息，并重新上传!");
//        String s1 = sendPostToJson("https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=10_CkG7aburMW5vhVrd8yY9dCGduqBLh_vEr7AgQEppKCZ8LEhQqrqdiuStaxMq5fJSfpsxNy8aW2RS_-EmjX31DUsO6vsaz-t2dDeK0u2zX3KMhcwNxgZGRATf9_1R9s7iMZuQGvpUfMXsXz1sREJfAAABOT", templateMessage);
//        System.out.println(s1);
    }


}
