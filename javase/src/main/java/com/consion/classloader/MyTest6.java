package com.consion.classloader;

/**
 * 类在链接的准备阶段时，会为类的静态成员变量分配空间，赋予初值，counter1=0,counter2=0，
 * 初始化S到new ingleton对象时，将counter1和counter2分别+1,但是counter2后面被赋值成为了0，
 * 所以最终的结果为：1，0
 */
public class MyTest6 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.counter1);
        System.out.println(Singleton.counter2);
    }
}

class Singleton {
    public static int counter1;
    public static int counter2 = 0;//1，1
    private static Singleton instance = new Singleton();//1,1

    public  Singleton() {
        counter1++;
        counter2++;
    }
//    public static int counter2 = 0;//1，0
    public static Singleton getInstance() {
        return instance;
    }
}