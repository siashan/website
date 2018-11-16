package com.web.site.common.util;

import com.web.site.common.support.security.Digests;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.SecureRandom;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/26 11:25
 * @Modified By:
 */
public class PasswordUtil {

    private static SecureRandom random = new SecureRandom();
    // 默认加密盐字节长度
    private static int DEFAULT_NEXT_BYTES_SIZE = 16;
    // 默认迭代次数
    private static int DEFAULT_HASHITERATIONS = 1000;

    /**
     * Description:随机加密盐  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/26 11:26
     */
    public static byte[] random(int numBytes) {
        if (numBytes < 1) {
            throw new RuntimeException("数组大小必须大于0");
        }
        byte[] bytes = new byte[numBytes];
        random.nextBytes(bytes);
        return bytes;
    }

    /**
     * Description:生成随机密码加密盐  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/26 11:47
     */
    public static String generatorSalt(){
        return Hex.encodeHexString(random(DEFAULT_NEXT_BYTES_SIZE),false);
    }

    public static String encode(String source, String salt, int hashIterations) throws DecoderException {
        MessageDigest digest = DigestUtils.getSha1Digest();
        byte[] saltBytes = Hex.decodeHex(salt);
        if (saltBytes != null) {
            digest.reset();
            digest.update(saltBytes);
        }

        byte[] hashed = digest.digest(Hex.decodeHex(source));
        int iterations = hashIterations - 1;

        for (int i = 0; i < iterations; ++i) {
            digest.reset();
            hashed = digest.digest(hashed);
        }
        return Hex.encodeHexString(hashed, false);
    }

    /**
     * Description:加密密码  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/26 11:45
     */
    public static String encodePassword(String password,String salt){
        try {
            return encode(password,salt,DEFAULT_HASHITERATIONS);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        return null;
    }
}
