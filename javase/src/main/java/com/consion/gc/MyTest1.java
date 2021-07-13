package com.consion.gc;

public class MyTest1 {
    // -XX:+UseSerialGC -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -verbose:gc
    public static void main(String[] args) {
        int _1MB = 1024 * 1024;
        byte[] myAlloc1 = new byte[_1MB * 2]; // eden 2M ; max 9(eden8+s0)
        byte[] myAlloc2 = new byte[_1MB * 2]; // eden 4M : max 9(eden8+s0)
        byte[] myAlloc3 = new byte[_1MB * 2]; // eden 6M : max 9(eden8+s0)
        byte[] myAlloc4 = new byte[_1MB * 4]; // 新生代空间不足，出发minor gc，6M大小对象通过分配担保进入老年代
    }

}
