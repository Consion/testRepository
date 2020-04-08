package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-03-24 20:51
 */
public class YellowHuman extends Human{
    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般都是单字节");
    }

    @Override
    public void getColor() {
        System.out.println("黄色仁宗的皮肤颜色是白色的！");
    }
}
