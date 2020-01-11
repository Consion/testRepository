package com.consion.bytecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        InvocationHandler invocationHandler = new DynamicSubject(rs);
        Class clazz = rs.getClass();
        Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), invocationHandler);
        System.out.println(subject.getClass());
        System.out.println("Parent Class:" + subject.getClass().getSuperclass());
        subject.request();
    }
}
