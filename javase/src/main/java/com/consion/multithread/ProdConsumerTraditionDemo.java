package com.consion.multithread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1个初始值为0的变量 两个线程交替操作 一个加1 一个减1来5轮
 *
 * 解答：
 * 1. 先是忽略了线程操作资源类，写在一块了
 * 2. 然后是await和signalAll写反了
 * @author Consion
 * @create 2021-07-12 10:39
 */
public class ProdConsumerTraditionDemo {
    public static void main(String[] args) {
        ProductConsumer productConsumer = new ProductConsumer();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                productConsumer.produce();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                productConsumer.consumer();
            }
        }, "B").start();
    }


}

class ProductConsumer {
    private int i = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void produce() {
        lock.lock();
        try {
            while (i == 0) {
                i++;
                System.out.println(Thread.currentThread().getName() + "\t " + i);
                condition.signalAll();
            }
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consumer() {
        lock.lock();
        try {
            while (i > 0) {
                i--;
                System.out.println(Thread.currentThread().getName() + "\t " + i);
                condition.signalAll();
            }
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
