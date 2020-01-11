package com.consion.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆转存
 */
public class MyTest1 {
    //-Xms5m -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();

        for (;;) {
            list.add(new MyTest1());
        }
    }
}
