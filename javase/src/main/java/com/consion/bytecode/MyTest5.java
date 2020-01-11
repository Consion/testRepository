package com.consion.bytecode;

/**
 * 方法的静态分派
 *
 *  Grandpa g1 = new Father();
 *  Grandpa是g1的静态类型
 *  Father是g1的实际类型，真正指向的类型
 *  g1的静态类型是不会发生变化的，就算是使用向下类型转换
 *  我们可以得出这样一个结论，变量的静态类型是不会发生变化的，而实际类型是可以发生变化的，多态的一种体现，
 *  运行期方可确定。
 *
 *
 *
 */
public class MyTest5 {

    //方法重载：是一种静态行为，根据对象的静态类型去选择合适的重载方法去执行，这种行为在编译期间就可以完全确定的。
    public void test(Grandpa grandpa) {
        System.out.println("grandpa...");
    }
    public void test(Father father) {
        System.out.println("father...");
    }
    public void test(Sun sun) {
        System.out.println("sun...");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Sun();
        MyTest5 myTest5 = new MyTest5();
        myTest5.test(g1);
        myTest5.test(g2);
    }

}
class Grandpa {}
class Father extends Grandpa {}

class Sun extends Father{}