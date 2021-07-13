package com.consion.multithread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Consion
 * @create 2021-07-09 14:32
 */
public class MyCaChe {
    private volatile Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key, Object value) {
        readWriteLock.writeLock().lock();
        try {
            //模拟网络延时
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写入完成，key:" + key + "-value:" + value);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public Object get(String key) {
        readWriteLock.readLock().lock();
        try {
            return map.get(key);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        MyCaChe myCaChe = new MyCaChe();
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                myCaChe.put("key" + finalI, finalI);
            }).start();
        }
        for (int j = 0; j < 5; j++) {
            int finalJ = j;
            new Thread(() -> {
                System.out.println(myCaChe.get("key" + finalJ));
            }).start();
        }
    }
}
