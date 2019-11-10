package com.consion.classloader;

public class MyCat {
    public MyCat() {
        System.out.println("MyCat loaded by " + this.getClass().getClassLoader());
        System.out.println("from MyCat:" + MySample.class);
    }
}
