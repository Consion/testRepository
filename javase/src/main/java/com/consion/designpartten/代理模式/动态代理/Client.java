package com.consion.designpartten.代理模式.动态代理;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer realGamePlayer = new GamePlayer("张三");
        GamePlayerIH gamePlayerIH = new GamePlayerIH(realGamePlayer);
        IGamePlayer gamePlayer = (IGamePlayer) Proxy.newProxyInstance(Client.class.getClassLoader(), GamePlayer.class.getInterfaces(),gamePlayerIH);
        gamePlayer.login("张三", "123");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
