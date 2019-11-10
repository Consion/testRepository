package com.consion.classloader;

/**
 * 静态常量和方法时谁的就会初始化谁
 */
class Parent3 {
    static int a = 3;
    static {
        System.out.println("Parent3 static block.");
    }
    public static void doSomething() {
        System.out.println("do something");
    }
}
class Child3 extends Parent3{
    static int b = 4;
    static {
        System.out.println("Child3 static block.");
    }
}
public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child3.a);
        Child3.doSomething();
        //运行结果
        //Parent3 static block.
        //3
    }
}
