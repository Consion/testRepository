package com.consion.designpartten.代理模式.模板实现;

/**
 * @author Consion
 * @create 2020-04-08 19:52
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real Subject");
    }
}
