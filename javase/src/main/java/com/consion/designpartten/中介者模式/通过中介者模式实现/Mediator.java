package com.consion.designpartten.中介者模式.通过中介者模式实现;

public class Mediator extends AbstractMediator{

    @Override
    public void execute(String string, Object... objects) {
        //采购电脑
        if (string.equals("purchase.buy")) {
            this.buyComputer((int)objects[0]);
        }
    }
    protected void buyComputer(int object) {

    }
}
