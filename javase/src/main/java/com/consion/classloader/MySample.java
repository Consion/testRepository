package com.consion.classloader;

public class MySample {
    public MySample() {
        System.out.println("Sample loaded by " + this.getClass().getClassLoader());

        new MyCat();
    }
}
