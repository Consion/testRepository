package com.consion.hashmap;


import java.util.Iterator;

public class MyHashMap<K, V> {

    private Entry[] table;

    private int size;
    private static final int CAPACITY = 8;


    public MyHashMap() {
        table = new Entry[CAPACITY];
    }
    public MyHashMap(int capacity) {
        table = new Entry[capacity];
    }

    public int size() {
        return size;
    }

    public Object get(K key) {
        int hashCode = key.hashCode();
        int pos = hashCode % table.length;//得到数组位置

        for (Entry entry = table[pos]; entry != null; entry = entry.next) {
            if (entry.getK().equals(key)) {
                table[pos] = entry;
                return entry.getV();
            }
        }
        return null;
    }

    public Object put(K key, V value) {
        size++;
        int hashCode = key.hashCode();
        int pos = hashCode % table.length;//得到数组位置

        for (Entry entry = table[pos]; entry != null; entry = entry.next) {
            if (entry.getK().equals(key)) {
                table[pos] = entry;
                return entry.getV();
            }
        }
        addEntry(key, value, pos);
        return null;
    }

    private void addEntry(K key, V value, int pos) {
        Entry<K, V> entry = new Entry<K, V>(key, value, table[pos]);
        table[pos] = entry;
    }

    class Entry<K, V>{
        private K k;
        private V v;
        private Entry<K, V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }
        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }
}