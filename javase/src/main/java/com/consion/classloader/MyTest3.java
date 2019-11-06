package com.consion.classloader;

import java.util.UUID;

/**
 * 当一个常量值并非是在编译期间可以确认的，那么其值不会存放到调用类的常量池中
 * 这时，在程序运行时，会导致常量所在类的初始化，也就是对常量所在类的主动使用
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3 {
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent static block.");
    }
}