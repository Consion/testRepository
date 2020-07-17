package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:32
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
