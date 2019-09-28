package com.consion.designpartten.asingleton;

/**
 * 皇帝类，因为事间只有一个皇帝，所以要设计成单例类
 */
public class Emperor {
    private Emperor(){}
    private static final Emperor instans = new Emperor();
    public static Emperor getInstance() {
        return instans;
    }

    public void say() {
        System.out.println("我是皇帝某某某");
    }
}
