package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * @author Consion
 * @create 2020-04-16 13:04
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
