package com.consion.classloader;


/**
 * 数组的类型是由JVM创建的，具体的类加载器类型是和数组元素类型相关
 * 如果数据类型为原生类型，则数组类是没有类加载器的
 */
public class MyTest15 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("-------------");
        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());
        System.out.println("---------------");
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());
    }
}
