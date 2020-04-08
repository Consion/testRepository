package com.consion.designpartten.代理模式.动态代理;

import com.consion.designpartten.代理模式.普通代理.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    public IGamePlayer realGamePlayer;

    public GamePlayerIH(IGamePlayer realGamePlayer) {
        this.realGamePlayer = realGamePlayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(realGamePlayer, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("before...");
    }
    public void after() {
        System.out.println("after...");
    }
}
