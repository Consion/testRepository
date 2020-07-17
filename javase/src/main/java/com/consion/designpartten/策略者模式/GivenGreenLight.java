package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:33
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
