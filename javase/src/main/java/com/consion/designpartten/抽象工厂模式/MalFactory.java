package com.consion.designpartten.抽象工厂模式;

/**
 * @author Consion
 * @create 2020-03-25 21:46
 */
public class MalFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return null ;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
