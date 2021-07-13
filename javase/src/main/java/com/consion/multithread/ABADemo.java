package com.consion.multithread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author Consion
 * @create 2021-07-09 12:54
 */
public class ABADemo {
    private static AtomicReference<String> atomicReference = new AtomicReference<>("A");
    private static AtomicStampedReference<String> stampedReference = new AtomicStampedReference<>("A", 1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("===以下是ABA问题的产生===");
        new Thread(() -> {
            System.out.println(atomicReference.get());
            atomicReference.compareAndSet("A", "B");
            System.out.println(atomicReference.get());
            atomicReference.compareAndSet("B", "A");
            System.out.println(atomicReference.get());
        }).start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {
            atomicReference.compareAndSet("A", "X");
            System.out.println(atomicReference.get());
        }).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("===以下是ABA问题的解决===");
        System.out.println("初始stamp:" + stampedReference.getStamp() + ",值为：" + stampedReference.getReference());
        new Thread(() -> {
            int stamp = stampedReference.getStamp();
            stampedReference.compareAndSet("A", "B", stamp, stamp + 1);
            System.out.println("第一次CAS stamp:" + stampedReference.getStamp() + ",值为：" + stampedReference.getReference());
            stampedReference.compareAndSet("B", "A", stampedReference.getStamp(), stampedReference.getStamp() + 1);
            System.out.println("第二次CAS stamp:" + stampedReference.getStamp() + ",值为：" + stampedReference.getReference());
        }).start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(() -> {
            int stamp = stampedReference.getStamp();
            stampedReference.compareAndSet("A", "X", stamp, stamp + 1);
            System.out.println("第三次CAS stamp:" + stampedReference.getStamp() + ",值为：" + stampedReference.getReference());
        }).start();
    }
}
