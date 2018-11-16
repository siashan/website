package com.web.site;

import com.alibaba.fastjson.JSONObject;
import com.web.site.common.support.security.Digests;
import com.web.site.common.util.HttpUtil;
import jodd.util.RandomString;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/26 9:50
 * @Modified By:
 */
public class TestDemo {

    @Test
    public void  testRandom() throws DecoderException {
//        PBKDF2算法
//        4142722B3F5AF011A9A146E4338095EC
//        1E05F72E37BD8FAACE18B26BA3D7FE4D4B8FAEAF
//        String pwd = "12345678";   // 明文
//        int hashIterations = 1000; // hash次数
//        // 16位随机加密盐
//        byte[] bytes = Digests.generateSalt(16);
//        // 加密盐转字符串
//        String s = Hex.encodeHexString(bytes,false);
//        System.out.println(s);
//       //
//        MessageDigest digest = DigestUtils.getSha1Digest();
//
//        if (bytes != null) {
//            digest.reset();
//            digest.update(bytes);
//        }
//
//        byte[] hashed = digest.digest(Hex.decodeHex(pwd));
//        int iterations = hashIterations - 1;
//
//        for(int i = 0; i < iterations; ++i) {
//            digest.reset();
//            hashed = digest.digest(hashed);
//        }
//        System.out.println(Hex.encodeHexString(hashed,false));


        byte[] bytes = Digests.generateSalt(16);
        String s = Hex.encodeHexString(bytes,false);
        System.out.println(s);

    }

    @Test
    public void  decode() throws DecoderException {
        String pwd = "12345678";   // 明文
        int hashIterations = 1000; // hash次数
        // 16位随机加密盐
        byte[] bytes = Digests.generateSalt(16);
        // 加密盐转字符串
        String s = "4142722B3F5AF011A9A146E4338095EC";
        //
        MessageDigest digest = DigestUtils.getSha1Digest();

        if (bytes != null) {
            digest.reset();
            digest.update(Hex.decodeHex(s));
        }

        byte[] hashed = digest.digest(Hex.decodeHex(pwd));
        int iterations = hashIterations - 1;

        for(int i = 0; i < iterations; ++i) {
            digest.reset();
            hashed = digest.digest(hashed);
        }
        System.out.println(Hex.encodeHexString(hashed,false));
    }

    @Test
    public void testJoddRandom(){
        System.out.println(RandomString.getInstance().randomNumeric(4));
    }

    @Test
    public void testDC(){
        Map<String,String> map = new HashMap<>();
        map.put("courseId","1");
        String s = HttpUtil.sendGet("https://www.dcxueyuan.com/common/course/head.json", map);
        System.out.println(s);
        JSONObject jsonObject = JSONObject.parseObject(s);
        JSONObject data = (JSONObject) jsonObject.get("data");
        System.out.println((data).getDouble("nowPrice"));
        System.out.println((data).get("courseInfo"));
        String name = data.getJSONObject("courseInfo").getString("name");
        System.out.println("name:" + name);
        if(!jsonObject.getBoolean("flag")){
            System.out.println(111);
        }
    }
}
