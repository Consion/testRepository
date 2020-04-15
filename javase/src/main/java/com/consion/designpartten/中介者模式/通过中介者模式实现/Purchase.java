package com.consion.designpartten.中介者模式.通过中介者模式实现;

public class Purchase extends AbstractColeague{

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buyIBMComputer(int number) {
        super.abstractMediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不在采购IBM电脑");
    }
}
