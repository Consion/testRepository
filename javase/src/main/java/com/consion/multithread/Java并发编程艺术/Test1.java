package com.consion.multithread.Java并发编程艺术;

/**
 * 多线程一定快吗？
 * 答案是不一定，原因是线程的上下文切换耗时
 * 如何减少上下文切换？
 *  1.无锁并发编程
 *  2.CAS算法
 *  3.使用最少线程和使用协程
 */
public class Test1 {
    public static final long COUNT = 10000000001L;

    public static void main(String[] args) throws InterruptedException {
        // 多线程执行
        concurrency();
        // 单线程执行
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            long a = 0L;
            for (long i = 0; i < COUNT; i++) {
                a += 5;
            }
        });
        thread.start();
        long b = 0L;
        for (long j = 0; j < COUNT; j++) {
            b--;
        }
        thread.join();
        System.out.println("concurrency cost:" + (System.currentTimeMillis() - start) + "ms");
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        long a = 0L;
        for (long i = 0; i < COUNT; i++) {
            a += 5;
        }
        long b = 0L;
        for (long j = 0; j < COUNT; j++) {
            b--;
        }
        System.out.println("serial cost:" + (System.currentTimeMillis() - start) + "ms");
    }


}
