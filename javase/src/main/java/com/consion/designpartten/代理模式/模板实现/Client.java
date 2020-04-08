package com.consion.designpartten.代理模式.模板实现;

/**
 * @author Consion
 * @create 2020-04-08 19:54
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);
        proxy.request();
    }
}
