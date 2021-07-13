package com.consion.multithread.volatile_;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * VolatileDemo代码演示可见性+原子性代码
 * @author Consion
 * @create 2021-07-09 11:06
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Op op = new Op();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    op.add();
                }
            }).start();
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(op.get());
        System.out.println(op.getM());
    }
}

class Op {
    private volatile int i = 0;
    private AtomicInteger m = new AtomicInteger(0);
    public void add() {
        i++;
        m.getAndIncrement();
    }

    public int get() {
        return i;
    }
    public AtomicInteger getM() {
        return m;
    }
}