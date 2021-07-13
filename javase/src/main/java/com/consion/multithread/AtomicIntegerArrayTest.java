package com.consion.multithread;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author Consion
 * @create 2021-07-09 13:13
 */
public class AtomicIntegerArrayTest {
    private static int[] value =new int[]{1,2};
    private static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        atomicIntegerArray.compareAndSet(0, 1, 3);
        System.out.println(atomicIntegerArray.get(0));
    }
}
