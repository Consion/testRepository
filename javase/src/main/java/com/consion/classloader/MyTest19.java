package com.consion.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * java -Djava.ext.dirs=./ com.consion.classloader.MyTest19
 * 会抛错，当前目录不存在该类
 * 在classes目录下，加包名
 */
public class MyTest19 {
    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();
        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
