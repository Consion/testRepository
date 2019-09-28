package com.consion.classloader;

public class Dog {
    public Dog() {

        System.out.println(String.format("Dog loaded by %s", Dog.class.getClassLoader()));
    }

}
