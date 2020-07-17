package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:45
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenningState());

        context.close();
        context.run();
        context.open();
        context.stop();
    }
}
