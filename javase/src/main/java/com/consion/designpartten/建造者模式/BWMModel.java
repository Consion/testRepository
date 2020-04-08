package com.consion.designpartten.建造者模式;

/**
 * @author Consion
 * @create 2020-03-31 12:22
 */
public class BWMModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车是这样启动的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车是这样停车的。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这样的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声音是这样的。。。");
    }
}
