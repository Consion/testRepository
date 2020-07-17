package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:36
 */
public class ZhaoYun {
    public static void main(String[] args) {
        // 刚到吴国，打开第一个锦囊
        Context context = new Context(new BackDoor());
        context.operate();
        // 刘备乐不思蜀，拆第二个
        context = new Context(new GivenGreenLight());
        context.operate();
        // 孙权的小兵追来了，拆第三个
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
