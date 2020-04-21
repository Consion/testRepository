package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * @author Consion
 * @create 2020-04-16 13:08
 */
public class Client {
    public static void main(String[] args) {
        Command deletePage = new DeletePageCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(deletePage);
        invoker.action();
    }
}
