package com.consion.classloader;

import java.sql.Driver;
import java.sql.DriverManager;

public class MyTest27 {
    public static void main(String[] args) throws Exception {
        /**
         * 1. Class<?> caller = Reflection.getCallerClass();//获取调用该方法的类，native方法
         * 2.forName0（）方法调用，传入参数1:类的完全限定名称，2：是否初始化=true，3：使用调用者的类加载器加载
         */
        Class.forName("com.mysql.jdbc.Driver");
        /**
         * 1.将user和pwd放入properties对象中
         * 2.调用getConnection方法，依次传入user, info(user和pwd)， callerClass
         * 3.获取到调用者的classLoader对象
         * 4.对DriverManager的class对象加锁
         * 5.如果3获取的ClassLoader对象==null，则说明调用者的类加载器是由根类加载器加载，则获取线程上下文类加载器，默认为app类加载器
         * 6.遍历COW容器registeredDrivers
         * 7.判断给定的类加载器能否加载驱动类，如果加载不了则跳过它
         *
         *
         */
        DriverManager.getConnection("jdbc:mysql://localhost:3306", "username", "password");
    }
}
