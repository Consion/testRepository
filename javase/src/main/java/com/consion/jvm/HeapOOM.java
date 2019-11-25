package com.consion.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于测试堆内存溢出的问题
 * 设置 -Xms20m -Xmx20 来减少堆内存的大小
 * 设置-XX:+HeapDumpOnOutOfMemoryError来生成dump文件用于分析堆内存溢出的原因。
 */
public class HeapOOM {
    static class OOMObject {

    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
