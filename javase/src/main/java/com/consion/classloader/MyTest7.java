package com.consion.classloader;

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());//由启动类（Bootstrap类加载器）加载的

        clazz = Class.forName("com.consion.classloader.C");
        System.out.println(clazz.getClassLoader());//由应用类加载器（APPClassLoader）加载的
    }
}
class C {

}