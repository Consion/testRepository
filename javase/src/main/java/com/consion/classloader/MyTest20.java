package com.consion.classloader;

import java.lang.reflect.Method;

public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        Class<?> clazz1 = loader1.loadClass("com.consion.classloader.MyPerson");
        Class<?> clazz2 = loader2.loadClass("com.consion.classloader.MyPerson");
        //都由应用类加载器加载，所以结果为true
        System.out.println(clazz1 == clazz2);

        Method method = clazz1.getMethod("setMyPerson", Object.class) ;
        Object obj1 = clazz1.newInstance();
        Object obj2 = clazz2.newInstance();
        method.invoke(obj1, obj2);
    }
}
