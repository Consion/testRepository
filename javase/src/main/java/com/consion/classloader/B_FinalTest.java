package com.consion.classloader;

import java.util.Random;

/**
 * FinalTest演示引用类的常量不会导致类被初始化
 * FinalTest2和FinalTest2演示引用类的变量会导致类被初始化
 */
public class B_FinalTest {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
        System.out.println(FinalTest2.x);
        System.out.println(FinalTest3.x);
    }
}

class FinalTest {
    public static final int x = 6/3;

    static {
        System.out.println("FinalTest is init.");
    }
}

class FinalTest2 {

    public static final int x = new Random().nextInt(10);

    static {
        System.out.println("FinalTest2 is init.");
    }
}

class FinalTest3 {

    public static int x;

    static {
        System.out.println("FinalTest3 is init.");
    }
}