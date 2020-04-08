package com.consion.designpartten.代理模式.强制代理;

/**
 * 此模式下，调用者只知道代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响
 * 通常在实际使用种，通过禁止new真实对象来保证该
 * 代理对象的管理由真实对象自己去完成
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player1 = new GamePlayer("player1").getProxy();
        player1.login("张三", "123");
        player1.killBoss();
        player1.upgrade();
    }
}
