package com.consion.designpartten.代理模式;

/**
 * @author Consion
 * @create 2020-03-31 13:05
 * 定义：为其他对象提供一种代理以控制对这个对象的访问
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        gamePlayer.login("张三", "123");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        //通过代理模式
        IGamePlayer playerProxy = new GamePlayerProxy(gamePlayer);
        playerProxy.login("张三", "123");
        playerProxy.killBoss();
        playerProxy.upgrade();


    }
}
