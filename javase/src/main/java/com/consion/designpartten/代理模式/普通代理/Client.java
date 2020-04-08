package com.consion.designpartten.代理模式.普通代理;

/**
 * 此模式下，调用者只知道代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响
 * 通常在实际使用种，通过禁止new真实对象来保证该
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayerProxy("链家");
        gamePlayer.login("张三", "123");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
