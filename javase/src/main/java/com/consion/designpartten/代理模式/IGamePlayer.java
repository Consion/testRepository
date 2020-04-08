package com.consion.designpartten.代理模式;

/**
 * @author Consion
 * @create 2020-03-31 13:01
 */
public interface IGamePlayer {
    void login(String name, String password);//登录
    void killBoss();    //杀boss
    void upgrade(); // 升级
}
