package com.consion.classloader;

import java.util.Random;

/**
 * 该实例按时如果实例化一个类，则会先初始化其父类，再初始化自己
 * D继承C，访问D的静态常量或者成员方法，不会导致D被初始化
 */
public class C_ExtendInitTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(D.x);
        D.foo();
    }
}

class A extends B{
    static {
        System.out.println("A is init.");
    }
}

class B{
    static {
        System.out.println("B is init.");
    }
}

interface C{
    static int x = 10;
}

class E {
    static void foo() {
        System.out.println("E foo method..");
    }
}

class  D extends E implements C{
    static {
        System.out.println("D is init.");
    }
   /* static void foo() {
        System.out.println("D foo method..");
    }*/
}