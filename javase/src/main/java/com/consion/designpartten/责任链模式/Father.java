package com.consion.designpartten.责任链模式;

/**
 * @author Consion
 * @create 2020-04-21 13:05
 */
public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请求时：" + women.getRequest());
        System.out.println("父亲的回答时：同意");
    }
}
