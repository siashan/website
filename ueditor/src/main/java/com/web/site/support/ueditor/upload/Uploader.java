package com.web.site.support.ueditor.upload;


import com.alibaba.fastjson.JSON;
import com.web.site.common.enums.UploadState;
import com.web.site.common.spring.Responses;
import com.web.site.common.util.UploadImgUtils;
import com.web.site.support.fastdfs.client.FastDFSClient;
import com.web.site.support.fastdfs.client.FastDFSException;
import com.web.site.support.ueditor.PathFormat;
import com.web.site.support.ueditor.define.BaseState;
import com.web.site.support.ueditor.define.State;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;


public class Uploader {
	private HttpServletRequest request = null;
	private Map<String, Object> conf = null;

	public Uploader(HttpServletRequest request, Map<String, Object> conf) {
		this.request = request;
		this.conf = conf;
	}

//	public final State doExec() {
//		String filedName = (String) this.conf.get("fieldName");
//		State state = null;
//
//
//		FastDFSClient fastDFSClient = new FastDFSClient();
//
//        try {
//            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//            MultipartFile file = multipartRequest.getFile("upfile");
//            // 上传到服务器
//            state = new BaseState(true);
//            String filepath = fastDFSClient.uploadFileWithMultipart(file);
//            Responses.um(true,filepath,filepath, UploadState.SUCCESS);
//            state.putInfo("url", PathFormat.format(filepath));
////            storageState.putInfo("type", suffix);
////            storageState.putInfo("original", "");
////            responseData.setFileName(file.getOriginalFilename());
////            responseData.setFilePath(filepath);
////            responseData.setFileType(FastDFSClient.getFilenameSuffix(file.getOriginalFilename()));
////            // 设置访文件的Http地址. 有时效性.
////            String token = FastDFSClient.getToken(filepath, fastDFSHttpSecretKey);
////            responseData.setToken(token);
////            responseData.setHttpUrl(fileServerAddr+"/"+filepath+"?"+token);
//        } catch (FastDFSException e) {
////            responseData.setSuccess(false);
////            responseData.setCode(e.getCode());
////            responseData.setMessage(e.getMessage());
//        }
////		if ("true".equals(this.conf.get("isBase64"))) {
////			state = Base64Uploader.save(this.request.getParameter(filedName),
////					this.conf);
////		} else {
////			state = BinaryUploader.save(this.request, this.conf);
////		}
//
//		return state;
//	}


	public final State doExec() {
		String filedName = (String) this.conf.get("fieldName");
		State state = null;



		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile file = multipartRequest.getFile("upfile");
			// 上传到服务器
			String fileName = UUID.randomUUID().toString().replaceAll("-", "");
			String filepath = UploadImgUtils.uploadingImageOFStream(file.getInputStream(), fileName);
//			System.out.println(s);
//            return Responses.success(JSON.parseObject(s).getString("key"));
//			return Responses.um(true, JSON.parseObject(s).getString("key"), JSON.parseObject(s).getString("key"), UploadState.SUCCESS);
			filepath = JSON.parseObject(filepath).getString("key");
			state = new BaseState(true);
//            String filepath = fastDFSClient.uploadFileWithMultipart(file);
			Responses.um(true,filepath,filepath, UploadState.SUCCESS);
			state.putInfo("url", PathFormat.format(filepath));
		} catch (Exception e) {
//            responseData.setSuccess(false);
//            responseData.setCode(e.getCode());
//            responseData.setMessage(e.getMessage());
		}


		return state;
	}


}
