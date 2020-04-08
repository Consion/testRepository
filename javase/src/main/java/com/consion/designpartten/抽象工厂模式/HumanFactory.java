package com.consion.designpartten.抽象工厂模式;

/**
 * @author Consion
 * @create 2020-03-24 20:54
 */
public interface HumanFactory {
    Human createYellowHuman();
    Human createBlackHuman();
    Human createWhiteHuman();
}
