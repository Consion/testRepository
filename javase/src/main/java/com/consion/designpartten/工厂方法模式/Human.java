package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-03-24 20:50
 */
public abstract class Human {
    abstract void talk();
    abstract void getColor();

    //产品类的通用方法
    void sleep() {
        System.out.println("无论是白种人，黑种人，黄种人，睡觉的时候都一个样，呼呼呼！");
    }

}
