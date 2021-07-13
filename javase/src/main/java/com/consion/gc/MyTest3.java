package com.consion.gc;

public class MyTest3 {
    // -XX:+UseSerialGC -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -verbose:gc -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
    // -XX:+MaxTenuringThreshold=1 设置经过几次gc对象进入老年代
    public static void main(String[] args) {
        int _1MB = 1024 * 1024;
        byte[] myAlloc1 = new byte[_1MB / 4]; // 什么时候进入老年代取决于-XX:+MaxTenuringThreshold的设置
        byte[] myAlloc2 = new byte[_1MB * 4];
        byte[] myAlloc3 = new byte[_1MB * 4];
        myAlloc3 = null;
        myAlloc3 = new byte[_1MB * 4];

    }

}
