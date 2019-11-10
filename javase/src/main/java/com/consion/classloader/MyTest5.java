package com.consion.classloader;

/**
 * 老师讲的MyTest5例子只能够证明常量被调用类加载到其常量池中
 *  当一个接口初始化时，并不要求其父接口都完成了初始化
 *  只有真正使用到了父接口时（如引用父接口中定义的常量（编译期间无法确定之的常量）时）才会初始化
 *
 */
public class MyTest5 {
    public static void main(String[] args) {
        //System.out.println(MyChild5.b);
        System.out.println(MyParent5_1.THREAD1);//使用谁的常量，就初始化谁
    }
}

interface MyGrandpa {
    public static Thread THREAD = new Thread(){
        {
            System.out.println("MyGranpa invoked");
        }
    };
}

interface MyParent5 extends MyGrandpa{
    public static Thread THREAD = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

class MyChild5 implements MyParent5{
    public static int b = 5;
}


interface MyGrandpa5_1 {
    public static Thread THREAD1 = new Thread(){
        {
            System.out.println("MyGrandpa5_1 invoked");
        }
    };
}


interface MyParent5_1 extends MyGrandpa5_1 {
    public static Thread THREAD2 = new Thread(){
        {
            System.out.println("MyParent5_1 invoked");
        }
    };
}