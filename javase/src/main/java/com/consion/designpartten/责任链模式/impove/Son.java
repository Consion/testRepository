package com.consion.designpartten.责任链模式.impove;


/**
 * @author Consion
 * @create 2020-04-21 13:08
 */
public class Son extends IHandler {
    public Son(LevelEnum handleLevel) {
        super(handleLevel);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("母亲的请求时：" + women.getRequest());
        System.out.println("儿子的回答时：同意");
    }
}
