package com.consion.bytecode;

/**
 * jvm为每个新创建的线程都分配一个堆栈。堆栈以帧为单位保存线程的状态。jvm对堆栈只进行两种操作：以帧为单位的压栈和出栈操作。
 * 栈帧(Stack Frame)是虚拟机运行时数据区的虚拟机栈(Virtual Machine Stack)的栈元素。
 * 它是一种用于帮助虚拟机执行方法调用与方法执行的结构，每个栈帧都是由某个线程执行的，当一个方法调用另外一个方法的时候，
 * 就会生成并向虚拟机栈压入一个栈帧。
 * 栈帧本身是一种数据结构，封装了局部变量表，动态链接，方法的返回地址以及操作数栈等信息。
 * 符号引用：A类调用B类，会在A类的常量池中维护B类的全局唯一的完全限定名，调用B类的方法或者属性的时候，
 *          会将符号引用转换成直接引用
 * 直接引用，直接获取到所要调用的方法的内存地址，编译期间无法确认
 * 有些符号引用会在类加载阶段或者是类的第一次使用时，就会转换成直接引用，这种转换称为“静态解析”，另外一些符号引用，
 * 在每次运行期转换为直接引用，这种转换，叫做动态链接，体现在java的多态性。
 *
 * Animal a = new Cat();
 * a.sleep()
 * a = new Dog();
 * a.sleep()
 * a = new Tiger();
 * a.sleep()
 * 以上多态代码在编译期间程序并不知道a指向的是哪个Animal的子类，字节码中可以看到的都是调用的Animal的实例方法，
 * invokevirtual
 * 动态派发指令，会检查a的具体类型是什么。
 *
 *
 *
 * 动态链接：C++
 *
 * 3-2=1 ，首先将3压入栈帧，然后将2压入栈帧，然后通过调用一个指令执行减法操作，先弹出2，然后弹出3，此时栈帧为空，然后将
 * 运算结果压入栈帧中
 * 局部变量表是用于存储局部变量，slot，存储局部变量最小单位，如果有10个变量就会有10个slot，但是不绝对，如对long或者double
 * 来说会用2个连续的slot，读的时候会连续读取2个slot，同时，slot是可以复用的，对于方法的局部变量来说，对于局部变量表并不区分
 * 作用域，如果a,b存在与test方法，而e，f同时又存在于test方法的if作用域中（ab在if后面），当if作用域结束后，a,b有可能复用
 * ef的slot
 *
 *
 * java 栈和栈帧：https://www.cnblogs.com/minisculestep/articles/4934947.html
 *
 * Java方法调用的五种方式：
 * 1. invokeinterface:调用接口，调用接口中的方法是在运行期间决定到底调用实现该接口的哪个对象的特定方法。
 * 2. invokestatic:调用静态方法，重要！
 * 3. invokespecial:它可以调用自己的私有方法，也可以调用构造方法，用<init>，以及父类的方法。
 * 4. invokevirtual:表示调用虚方法，和多态相关，运行期动态查找的过程，重要！
 * 5. invokedynamic:动态调用方法，了解即可。
 *
 *
 * 静态解析四种情形；
 * 1. 静态方法
 * 2. 父类方法
 * 3. 构造方法
 * 4. 私有方法（无法被重写）
 * 以上4类方法称作为非虚方法，它们是在类加载阶段就可以将符号引用转换为直接引用。
 */
public class MyTest4 {
    public static void test() {
        System.out.println("test invoked");
    }

    public void test2() {
        System.out.println("test2 invoked");
    }

    public static void main(String[] args) {
        test();
        new MyTest4().test2();
    }
}
