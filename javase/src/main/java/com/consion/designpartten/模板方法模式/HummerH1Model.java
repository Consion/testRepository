package com.consion.designpartten.模板方法模式;

/**
 * @author Consion
 * @create 2020-03-26 21:52
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1启动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音时这样的");
    }

    @Override
    protected boolean isAlarm() {
        return true;
    }
}
