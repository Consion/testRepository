package com.consion.bytecode;

/**
 * 查看3种使用sync关键字的区别，查看字节码
 */
public class MyTest2 {
    String str = "Welcome";
    private int x = 5;
    Object object = new Object();
    public static Integer in = 10;

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        myTest2.setX(8);
        in = 20;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }

    public void test(String str) {
        synchronized (str) {
            System.out.println("hello world");
        }
    }

    public synchronized static void test2() {

    }
}
