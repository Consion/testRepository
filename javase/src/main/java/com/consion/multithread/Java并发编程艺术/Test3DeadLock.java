package com.consion.multithread.Java并发编程艺术;

import java.util.concurrent.TimeUnit;

/**
 * 避免死锁的几个方法
 * 1.避免1个线程获取多个锁
 * 2.避免一个线程在锁内同时占用多个资源，尽量保证每个锁只占用一个资源
 * 3.尝试使用定时锁，lock.tryLock(timeout)来替代使用内部锁的机制
 * 4.对于数据库锁，加锁和解锁必须在一个数据库连接里，否则可能会出现解锁失败的情况
 */
public class Test3DeadLock {
    private static final String A = "A";
    private static final String B = "B";
    public static void main(String[] args) {
        deadLock();
    }

    private static void deadLock() {
        new Thread(() -> {
            // 这里睡眠1s是保证2个线程都开始跑了
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (A) {
                System.out.println(Thread.currentThread().getName() + "拿到A对象的锁以后睡眠1s");
                // 这里睡眠1s是保证另外一个线程已经拿到B对象的锁
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "准备拿B锁");
                synchronized (B) {

                }
            }
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "拿到B对象的锁以后睡眠1s");
            synchronized (B) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "准备拿A锁");
                synchronized (A) {

                }
            }
        }).start();
    }
}
