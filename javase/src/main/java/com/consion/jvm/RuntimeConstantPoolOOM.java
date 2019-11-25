package com.consion.jvm;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //在堆中单纯的创建一个对象，值为计算机软件
        String str1 = new StringBuilder("计算机").append("软件").toString();
        //str1.intern方法将”计算机软件“这个值的引用扔到常量池，并返回这个引用
        System.out.println(str1.intern() == str1);//常量池返回的引用和str1指向的引用都是堆中的”计算机软件“对象

        //在堆中创建一个对象，值为”java“
        String str2 = new StringBuilder("ja").append("va").toString();//java
        //str2.intern方法将常量池中java对象地址返回
        System.out.println(str2.intern() == str2);//常量池返回的java对象地址和堆中的java对象地址不同
        //堆中创建abc对象
        String str4 = new String("abc");
        //常量池增加abc对象，str3指向这个对象
        String str3 = "abc";
        //str3指向的是常量池对象，str4.intern方法返回常量池中的abc对象的地址
        System.out.println(str3 == str4.intern());

        System.out.println(new String("abcde").intern() == "abcde");
    }
}
