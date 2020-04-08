package com.consion.designpartten.单例模式;

/**
 * 臣子类，和皇帝是1：n的关系
 */
public class Minister {
    public static void main(String[] args) {
//        for (int day = 0; day < 3; day++) {
//            Emperor.getInstance().say();
//            System.out.println(Emperor.getInstance());//3天见到的皇帝是同一位！
//        }

        for (int day = 0; day < 3; day++) {
            EmperorOfNumber2.getInstance().say();
        }
    }
}
