package com.consion.multithread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS并发原语体现在Java语言中就是sun.misc.UnSaffe类中的各个方法.
 * 调用UnSafe类中的CAS方法,JVM会帮我实现CAS汇编指令.这是一种完全依赖于硬件功能,
 * 通过它实现了原子操作,再次强调,由于CAS是一种系统原语,原语属于操作系统用于范畴,是由若干条指令组成,
 * 用于完成某个功能的一个过程,并且原语的执行必须是连续的,
 * 在执行过程中不允许中断,也即是说CAS是一条原子指令,不会造成所谓的数据不一致的问题
 * @author Consion
 * @create 2021-07-09 12:32
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.compareAndSet(5, 2021);
        System.out.println("current:" + atomicInteger.get());
        atomicInteger.compareAndSet(2021, 2019);
        System.out.println("current:" + atomicInteger.get());
    }
}
