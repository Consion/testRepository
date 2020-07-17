package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:33
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
