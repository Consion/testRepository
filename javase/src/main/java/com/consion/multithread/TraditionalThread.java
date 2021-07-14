package com.consion.multithread;

import java.util.Arrays;

/**
 * 传统方式创建线程
 * 1，继承Thread类
 * 2，实现Runnable接口
 * Thread为线程对象，Runnable为运行在该线程对象上面的代码
 * <p>
 * 多线程会提高程序的运行效率吗？答案是不会，多线程下载技术原理是服务器为每个用户提供的带宽是固定的，
 * 每个线程为一个用户，多线程下载则可以看作是多个用户同时下载，增加带宽。
 */
public class TraditionalThread {
    public static void main(String[] args) {
        Persion persion = new Persion();
        System.out.println(persion);
        changePerson(persion);
        System.out.println(persion);
    }

    public static void changePerson(Persion persion) {
        persion = new Persion();
    }
}

class Persion {

}
