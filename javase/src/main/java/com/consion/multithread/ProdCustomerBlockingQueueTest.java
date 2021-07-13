package com.consion.multithread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Consion
 * @create 2021-07-12 14:17
 */
public class ProdCustomerBlockingQueueTest {
    public static void main(String[] args) {
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue();
        MyResource myResource = new MyResource(synchronousQueue);
        new Thread(myResource::prod).start();
        new Thread(myResource::consumer).start();
    }
}
class MyResource {
    private volatile boolean flag = true;
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private BlockingQueue<Integer> blockingQueue;

    public MyResource(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void prod() {
        while (flag) {
            int data = atomicInteger.incrementAndGet();
            try {
                blockingQueue.offer(data, 2, TimeUnit.SECONDS);
                System.out.println(Thread.currentThread().getName() + "\t 生产" + data + "成功");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void consumer() {
        while (flag) {
            try {
                Integer data = blockingQueue.poll(2, TimeUnit.SECONDS);
                System.out.println(Thread.currentThread().getName() + "\t 消费" + data + "成功");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean stop() {
        flag = false;
        return flag;
    }
}