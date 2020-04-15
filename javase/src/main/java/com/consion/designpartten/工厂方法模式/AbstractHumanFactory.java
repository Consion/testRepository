package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-03-24 20:54
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
    public abstract Human createHuman(HumanTypeEnum humanTypeEnum);

}
