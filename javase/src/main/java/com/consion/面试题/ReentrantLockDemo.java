package com.consion.面试题;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁，又名递归锁，同一个线程在外层方法获得锁的时候，再进入该线程的内层方法会总动获取锁（前提是锁对象是同一个对象）
 * ReentrantLock和sync关键字都是可重入锁，优点是避免死锁。
 * sync void a() {
 *     b();
 * }
 * sync void b() {}
 *
 *
 */
public class ReentrantLockDemo {

    private static final Object lockObj = new Object();

    public static void m1() {
        new Thread(() -> {
            synchronized (lockObj) {
                System.out.println("外层");
                synchronized (lockObj) {
                    System.out.println("中层");
                    synchronized (lockObj) {
                        System.out.println("内层");
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        m1();
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
    }
}
