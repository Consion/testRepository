package com.consion.designpartten.代理模式.强制代理;

/**
 * @author Consion
 * @create 2020-03-31 13:03
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    private IGamePlayer gamePlayerProxy;

    public GamePlayer(String name) {
        this.name = name;
    }
    @Override
    public void login(String name, String password) {
        if (isProxy()) {
            System.out.println("登录名：" + name + "密码：" + password);
        } else {
            System.out.println("请通过代理访问。");
        }


    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请通过代理访问。");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println(this.name + "又升了一级");
        } else {
            System.out.println("请通过代理访问。");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        gamePlayerProxy = new GamePlayerProxy(this);
        return gamePlayerProxy;
    }

    // 判断是否设置代理
    private boolean isProxy() {
        if (gamePlayerProxy == null) {
            return false;
        }
        return true;
    }


}
