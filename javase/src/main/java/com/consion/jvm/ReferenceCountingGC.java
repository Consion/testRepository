package com.consion.jvm;

public class ReferenceCountingGC {
    public Object instance = null;
    public static void main(String[] args) {
        ReferenceCountingGC o1 = new ReferenceCountingGC();
        ReferenceCountingGC o2 = new ReferenceCountingGC();
        o1.instance = o2;
        o2.instance = o1;
        o1 = null;
        o2 = null;
        System.gc();

    }
}
