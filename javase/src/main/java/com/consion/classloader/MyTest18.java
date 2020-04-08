package com.consion.classloader;

/**
 * 将class文件放入根类加载器的目录下，也会被根类加载器加载
 */
public class MyTest18 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));//对应的是根类加载器
        System.out.println(System.getProperty("java.ext.dirs"));//对应的是扩展类加载器
        System.out.println(System.getProperty("java.class.path"));//对应的是应用类加载器
    }
}
