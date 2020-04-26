package com.consion.designpartten.责任链模式;

/**
 * @author Consion
 * @create 2020-04-21 13:06
 */
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请求时：" + women.getRequest());
        System.out.println("丈夫的回答时：同意");
    }
}
