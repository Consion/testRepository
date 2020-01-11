package com.consion.bytecode;

/**
 * 方法的动态分派
 */
public class MyTest6 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.test();//Apple
        orange.test();//Orange

        Orange orange1 = new Orange();
        orange1.test();//Orange
    }
}

class Fruit{
    public void test() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit{
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit{
    public void test() {
        System.out.println("Orange");
    }
}