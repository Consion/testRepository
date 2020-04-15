package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-03-24 20:59
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human whiteHuman = humanFactory.createHuman(HumanTypeEnum.WHITE_HUMAN);
        whiteHuman.getColor();
        whiteHuman.talk();
        whiteHuman.sleep();

        Human blackHuman = humanFactory.createHuman(HumanTypeEnum.BLACK_HUMAN);
        blackHuman.getColor();
        blackHuman.talk();
        blackHuman.sleep();

        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        yellowHuman.sleep();
    }
}
