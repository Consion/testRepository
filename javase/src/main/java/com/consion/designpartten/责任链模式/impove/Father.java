package com.consion.designpartten.责任链模式.impove;


/**
 * @author Consion
 * @create 2020-04-21 13:05
 */
public class Father extends IHandler {
    public Father(LevelEnum handleLevel) {
        super(handleLevel);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("女儿的请求时：" + women.getRequest());
        System.out.println("父亲的回答时：同意");
    }
}
