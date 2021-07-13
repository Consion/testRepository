package com.consion.gc;

public class MyTest2 {
    // -XX:+UseSerialGC -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -verbose:gc -XX:PretenureSizeThreshold=3145728
    //  -XX:PretenureSizeThreshold=3145728只针对Serial和ParNew收集器生效，可以使用ParNew+CMS使其生效
    public static void main(String[] args) {
        int _1MB = 1024 * 1024;
        byte[] myAlloc1 = new byte[_1MB * 4]; // eden 4M ; max 9(eden 8+s0 1) 对象>3M直接分配到老年代
    }

}
