package com.consion.classloader;

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在类的常量池中，
 * 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义
 * 这个常量的初始化
 * 注意，这里指的是将常量存放到MyTest2的常量池中，之后MyParent2就与MyTest2没有关系了
 * 甚至可以删除掉MyParent2.class
 * javap -c MyTest2.class，查看MyTest2.class的字节码
 *
 * 助记符(在rt.jar包中都有具体类与之对应)：
 * ldc表示将int,float或者时String类型的常量值从常量池推送到栈顶
 * bipush表示将字节（-128~127 ）的常量值推送值栈顶
 * sipush表示将一个短整型(-32768~32767)推送至栈顶
 * ioonst_1表示将int类型1推送至栈顶（iconst_m1-iconst_5）
 *
 *
 * ss
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }
}
class MyParent2 {
//    public static String str = "hello world";
    public final static String str = "hello world";
    static {
        System.out.println("MyParent2 static block.");
    }
}