package com.consion.bytecode;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
