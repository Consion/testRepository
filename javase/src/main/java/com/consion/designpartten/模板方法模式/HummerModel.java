package com.consion.designpartten.模板方法模式;

/**
 * @author Consion
 * @create 2020-03-26 21:51
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    protected abstract boolean isAlarm();
    public void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
