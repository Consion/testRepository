package com.consion.designpartten.建造者模式;

/**
 * @author Consion
 * @create 2020-03-30 20:24
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车是这样启动的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车是这样停车的的。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音是这样的。。。");
    }
}
