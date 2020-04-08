package com.consion.designpartten.模板方法模式;

/**
 * @author Consion
 * @create 2020-03-26 21:57
 */
public class Client {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();
        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
