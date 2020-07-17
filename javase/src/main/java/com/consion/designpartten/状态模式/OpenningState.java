package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:28
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.getContext().setLiftState(LiftStateEnum.CLOSE.getState());
        super.getContext().getLiftState().close();
    }

    @Override
    public void run() {
        System.out.println("电梯门开启状态，不能run！");
    }

    @Override
    public void stop() {
        System.out.println("开门状态，已经是停止了");
    }
}
