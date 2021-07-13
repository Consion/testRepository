package com.consion.multithread.container;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * * 1.故障现象
 *          *  java.util.ConcurrentModificationException
 *          * 2.导致原因
 *          *    并发争抢修改导致
 *          * 3.解决方案
 *          *  3.1 new Vector<>()
 *          *  3.2 Collections.synchronizedList(new ArrayList<>());
 *          *  3.3 new CopyOnWriteArrayList<>();
 *          *
 *
 *
 * List线程copyOnWriteArrayList
 * set线程CopyOnWriteHashSet
 * map线程ConcurrentHashMap
 * 写时加锁，copy一份容器，add后将集合引用指向新容器，这样保证其他线程共享一份容器，不会丢失数据
 * @author Consion
 * @create 2021-07-09 13:26
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString());
                System.out.println(list);
            }).start();
        }

    }
}
