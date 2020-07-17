package com.consion.designpartten.状态模式;

/**
 * @author Consion
 * @create 2020-05-19 13:26
 */
// 电梯状态抽象接口
public abstract class LiftState {
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
