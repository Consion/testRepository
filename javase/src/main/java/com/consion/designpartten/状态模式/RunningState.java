package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:30
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        System.out.println("运行状态不允许开门");
    }

    @Override
    public void close() {
        System.out.println("运行状态已经是关门状态");
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        super.getContext().setLiftState(LiftStateEnum.STOP.getState());
        super.getContext().getLiftState().stop();
    }
}
