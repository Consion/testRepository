package com.consion.classloader;

public class Sample {
    private int v = 1;

    public Sample() {
        new Dog();
        System.out.println(String.format("Sample is loaded by: %s", this.getClass().getClassLoader()));
    }
}
