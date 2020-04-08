package com.consion.designpartten.代理模式.动态代理;

/**
 * @author Consion
 * @create 2020-03-31 13:03
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }
    @Override
    public void login(String name, String password) {
        System.out.println("登录名：" + name + "密码：" + password);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级");

    }
}
