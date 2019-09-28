package com.consion.hashmap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();

        for (int i=0; i<10; i++) {
            map.put(String.format("key%d", i), String.format("value%d", i));
        }

        System.out.println(map.size());
    }
}
