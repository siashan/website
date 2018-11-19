package com.web.site.controller.common;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import com.web.site.common.enums.UploadState;
import com.web.site.common.support.response.Responses;
import com.web.site.common.util.UploadImgUtils;
import com.web.site.support.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/4/13 17:49
 * @Modified By:
 */
@Controller
@RequestMapping("upload")
public class UploadController {
    //处理文件上传
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object uploadImg(@RequestParam("file") MultipartFile file,
                     HttpServletRequest request) {
        String contentType = file.getContentType();
        String name = file.getOriginalFilename();
        String sufix = name.substring(name.lastIndexOf("."));
        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + sufix;
        try {
            String s = UploadImgUtils.uploadingImageOFStream(file.getInputStream(), fileName);
            System.out.println(s);
            JSONObject jsonObject = JSON.parseObject(s);
            System.out.println(jsonObject.getString("key"));
            return Responses.success(jsonObject.getString("key"));
        } catch (Exception e) {
            // TODO: handle exception
            return Responses.error("error");
        }
    }



    @ResponseBody
    @RequestMapping(value = "file", method = RequestMethod.POST)
    public Object uploadFile(@RequestParam("file") MultipartFile file,
                            HttpServletRequest request) {
        String name = file.getOriginalFilename();
//        String sufix = name.substring(name.lastIndexOf("."));
//        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + sufix;
        try {
            String s = UploadImgUtils.uploadingImageOFStream(file.getInputStream(), name);
            System.out.println(s);
            return Responses.success(JSON.parseObject(s).getString("key"));
        } catch (Exception e) {
            // TODO: handle exception
            return Responses.error("error");
        }
    }

    @ResponseBody
    @RequestMapping("umupload")
    public Object umUpload(@RequestParam(value = "upfile", required = false) MultipartFile file, String editorid) {
        String fileName = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            String s = UploadImgUtils.uploadingImageOFStream(file.getInputStream(), fileName);
            System.out.println(s);
//            return Responses.success(JSON.parseObject(s).getString("key"));
            return Responses.um(true, JSON.parseObject(s).getString("key"), JSON.parseObject(s).getString("key"), UploadState.SUCCESS);
        } catch (Exception e) {
            // TODO: handle exception
            return JSON.toJSONString(Responses.um(true, fileName, fileName, UploadState.REQUEST));
        }

    }


    @ResponseBody
    @RequestMapping("ue")
    public Object umUpload(HttpServletRequest request, String editorid) {
        try{
            String action = request.getParameter("action");
            System.out.println(action);
//        request.setCharacterEncoding("utf-8");
            String rootPath = request.getRealPath("/");
            String exec = new ActionEnter(request, rootPath).exec();
            System.out.println(exec);
            return JSONObject.parseObject(exec);
//        return uploadSample(file,request);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }


}
