package com.consion.designpartten.适配器模式;

/**
 * @author Consion
 * @create 2020-04-29 13:23
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfo();
        System.out.println(userInfo.getHomeAddress());
    }
}
