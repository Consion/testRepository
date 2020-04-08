package com.consion.designpartten.抽象工厂模式;

/**
 * @author Consion
 * @create 2020-03-25 21:40
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
