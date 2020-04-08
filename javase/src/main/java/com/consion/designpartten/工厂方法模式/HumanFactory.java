package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-03-24 20:56
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHnman(Class<T> c) {
        T human = null;
        try {
           human = c.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return human;
    }
}
