package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:32
 */
public enum  LiftStateEnum {
    OPEN(new OpenningState()),
    CLOSE(new ClosingState()),
    RUN(new RunningState()),
    STOP(new StoppingState());
    LiftStateEnum(LiftState state) {
        this.state = state;
    }

    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
    }
}
