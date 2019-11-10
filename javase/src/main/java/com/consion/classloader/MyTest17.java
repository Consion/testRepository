package com.consion.classloader;

public class MyTest17 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 =  new MyTest16("loader1");
        Class<?> clazz = loader1.loadClass("com.consion.classloader.MySample");
        //如果注释掉该行，则并不会s实例化MySample对象，即MySample的构造方法不会被调用，MyCat对象也不会
        //被创建，即没有对MyCat进行主动使用，但是MyCat类是否被加载，这个是不一定的
        Object o = clazz.newInstance();
        System.out.println(clazz.hashCode());
    }
}
