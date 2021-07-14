package com.consion.面试题;


/**
 * 解释：java这个字符串是rt.jar加载后就已经初始化在字符串常量池中了，所以java.intern()返回的是常量池的地址，而通过StringBuilder创建的java
 * 在堆中，所以是2个不同的对象，一个在常量池中，一个在堆中，因此返回false（当然，常量池也在堆中），tongcheng58.intern()会将堆中创建的tongcheng58
 * 字符串对象引用存入到字符串常量池中，因此对应的是一个对象，地址必然相等
 * 面试目的：考察求职者是否读过《深入理解JVM》这本书。
 */
public class AStringBuilder {
    public static void main(String[] args) {
        String str1 = new StringBuilder("tongcheng").append("58").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println(str2.intern() == str2);
    }
}
