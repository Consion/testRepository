package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:27
 */
public class Context {
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        liftState.open();
    }
    public void close(){
        liftState.close();
    }
    public void run(){
        liftState.run();
    }
    public void stop(){
        liftState.stop();
    }
}
