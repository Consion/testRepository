package com.consion.multithread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Consion
 * @create 2021-07-12 9:14
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "上完自习");
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("关门");
    }
}
