package com.consion.classloader;

class TestClass {
    static {
        System.out.println("TestClass is init.");
    }
}

/**
 * 调用ClassLoader的loadClass方法并不会使被加载的类被初始化，并不是对类的主动使用
 * 通过Class.forName方法加载类则可以导致初始化
 */
public class LoadClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("classloader.TestClass");
        System.out.println(clazz);

        clazz = Class.forName("classloader.TestClass");
        System.out.println(clazz);
    }
}
