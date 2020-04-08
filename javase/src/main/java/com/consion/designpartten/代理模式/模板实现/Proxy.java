package com.consion.designpartten.代理模式.模板实现;

/**
 * @author Consion
 * @create 2020-04-08 19:53
 */
public class Proxy implements Subject{

    private Subject subject;
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }
    private void before() {
        System.out.println("exec before...");
    }
    private void after() {
        System.out.println("exec after...");
    }
}
