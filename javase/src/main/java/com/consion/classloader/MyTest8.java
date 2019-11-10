package com.consion.classloader;

import java.util.Random;

class FinalTest {
   // public static final int x = 3;//不会初始化该类，如果由调用该常量
    public static final int x = new Random().nextInt(3);//会初始化该类，如果由调用该常量，编译期间无法确定该值
    static {
        System.out.println("FinalTest static block.");
    }
}
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}
