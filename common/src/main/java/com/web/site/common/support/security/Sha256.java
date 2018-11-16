package com.web.site.common.support.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256 {

    //定义摘要算法为SHA-256
    private static final String SHA256 = "SHA-256";

    /**
     * 对字符串进行摘要,摘要算法使用SHA-256
     *
     * @param bts 要加密的字符串的byte数组
     * @return 16进制表示的大写字符串 长度一定是8的整数倍
     */
    public static byte[] encrypt(byte[] bts) {
        MessageDigest md = null;
        byte[] result = null;
        @SuppressWarnings("unused")
        byte[] bt = new byte[0];
        try {
            md = MessageDigest.getInstance(SHA256);
            md.update(bts);
            result = md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return result;
    }

    public static String encryptToString(byte[] bts) {
        return bytes2Hex(encrypt(bts));
    }

    static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
}
