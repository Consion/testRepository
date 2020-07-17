package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:59
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Calculator.ADD.exec(1, 2));
        System.out.println(Calculator.SUB.exec(2, 1));
    }
}
