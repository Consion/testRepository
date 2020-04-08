package com.consion.designpartten.代理模式.普通代理;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        gamePlayer = new GamePlayer(this, name);
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
