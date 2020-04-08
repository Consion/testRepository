package com.consion.designpartten.代理模式;

/**
 * @author Consion
 * @create 2020-03-31 13:07
 */
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer;
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String name, String password) {
        gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
