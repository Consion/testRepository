package com.consion.classloader;

/**
 *调用CLassLoader的loadClass方法并不会导致被加载类的初始化，即不是对该类的主动使用，
 * 通过反射的方式可以使类被初始化
 */
public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz =  classLoader.loadClass("com.consion.classloader.CL");
        System.out.println(clazz);
        System.out.println("=======================================");
        clazz = Class.forName("com.consion.classloader.CL");
        System.out.println(clazz);
    }
}
class CL {
    static {
        System.out.println("CL static block.");
    }
}