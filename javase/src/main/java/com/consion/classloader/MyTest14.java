package com.consion.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 *  线程上下文类加载器是由线程创建者提供的
 */
public class MyTest14 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Enumeration<URL> urls =  classLoader.getResources("com/consion/classloader/MyTest13.class");
        while (urls.hasMoreElements()) {
            System.out.println(urls.nextElement());
        }
        System.out.println();
    }
}
