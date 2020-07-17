package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:35
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        strategy.operate();
    }
}
