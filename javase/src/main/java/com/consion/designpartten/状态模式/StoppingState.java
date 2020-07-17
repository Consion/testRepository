package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:30
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.getContext().setLiftState(LiftStateEnum.OPEN.getState());
        super.getContext().getLiftState().open();
    }

    @Override
    public void close() {
        super.getContext().setLiftState(LiftStateEnum.CLOSE.getState());
        super.getContext().getLiftState().close();
    }

    @Override
    public void run() {
        super.getContext().setLiftState(LiftStateEnum.RUN.getState());
        super.getContext().getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
