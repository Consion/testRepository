package com.consion.designpartten.抽象工厂模式;

/**
 * @author Consion
 * @create 2020-03-24 20:59
 */
public class NvWa {
    public static void main(String[] args) {
        Human femalHuman = new FemalFactory().createYellowHuman();
        femalHuman.talk();
        femalHuman.getSex();
        Human maleHuman = new MalFactory().createYellowHuman();
        maleHuman.talk();
        maleHuman.getSex();
    }
}
