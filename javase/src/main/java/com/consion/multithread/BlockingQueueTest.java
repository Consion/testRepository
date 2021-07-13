package com.consion.multithread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Consion
 * @create 2021-07-12 10:19
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        synchronousQueueTest();
    }

    public static void synchronousQueueTest() throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "\tput start" + finalI);
                    queue.put(finalI);
                    System.out.println(Thread.currentThread().getName() + "\tput end" + finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        TimeUnit.SECONDS.sleep(3);

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "\ttake " + finalI);
                    queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}

