package com.web.site.common.util;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;


public class UploadImgUtils {
	//设置好账号的ACCESS_KEY和SECRET_KEY  
    private static String ACCESS_KEY = "BCb-O7nWpewzTG2h5kdAbs6lJnkP6LcjIjgTsx-Z"; //这两个登录七牛 账号里面可以找到
    private static String SECRET_KEY = "z6_-ARP7q6zT5Qicm8kP21EB9Q4PskFbLgQ9vLi7";

    //要上传的空间  
    private static String bucketName = "website"; //填写新建的那个存储空间对象的名称
    
    /**
     * 上传图片方法
     * @param imgFile 图片流
     * @param imgName 图片名称
     */
    public static String uploadingImage(MultipartFile imgFile, String imgName){
    	//密钥配置  
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String token = auth.uploadToken(bucketName);
        //创建上传对象  
        //构造一个带指定Zone对象的配置类 
        //--Zone.zone0()华东    --Zone.zone1()华北    --Zone.zone2()华南    --Zone.zone3()北美    
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);
        CommonsMultipartFile cf = (CommonsMultipartFile)imgFile;
        DiskFileItem fi = (DiskFileItem) cf.getFileItem();
        File file = fi.getStoreLocation();
        try {
			com.qiniu.http.Response response = uploadManager.put(file, imgName, token);
			return response.bodyString();
		} catch (QiniuException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 上传图片方法
     * @param file 图片流
     * @param imgName 图片名称
     */
    public static String uploadingImage(File file,String imgName){
        //密钥配置
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String token = auth.uploadToken(bucketName);
        //创建上传对象
        //构造一个带指定Zone对象的配置类
        //--Zone.zone0()华东    --Zone.zone1()华北    --Zone.zone2()华南    --Zone.zone3()北美
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);
        try {
            com.qiniu.http.Response response = uploadManager.put(file, imgName, token);
            return response.bodyString();
        } catch (QiniuException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 上传图片方法
     * @param imgName 图片名称
     */
    public static String uploadingImageOFStream(InputStream inputStream, String imgName){
        //密钥配置
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String token = auth.uploadToken(bucketName);
        //创建上传对象
        //构造一个带指定Zone对象的配置类
        //--Zone.zone0()华东    --Zone.zone1()华北    --Zone.zone2()华南    --Zone.zone3()北美
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);
        try {
            com.qiniu.http.Response response = uploadManager.put(inputStream, imgName, token,null,null);
            return response.bodyString();
        } catch (QiniuException e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public static String uploadToken(){
    	 Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
         String token = auth.uploadToken(bucketName);
         return token;
    }
	public static void main(String []args){
		File file=new File("D://aaa.jpg");
		String reulut=UploadImgUtils.uploadingImage(file, UUID.randomUUID().toString().replaceAll("-", ""));
		System.out.println(reulut);
	}
}
