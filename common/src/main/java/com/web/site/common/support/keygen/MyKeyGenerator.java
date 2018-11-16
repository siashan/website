package com.web.site.common.support.keygen;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/11 9:25
 * @Modified By:
 */
public class MyKeyGenerator {

    public static Long genKey(){
        KeyGenerator keyGenerator = KeyGeneratorFactory.newInstance("com.web.site.common.support.keygen.DefaultKeyGenerator");
        Number number = keyGenerator.generateKey();
        return number.longValue();
    }
}
