package com.consion.designpartten.中介者模式.通过中介者模式实现;

import java.util.Random;

public class Sale extends AbstractColeague{
    AbstractMediator abstractMediator;

    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void saleIBMComputer(int number) {
        super.abstractMediator.execute("sale.sell", number);
    }

    public void offSell() {
        super.abstractMediator.execute("sale.offSell");
    }
    //发聩销售情况，0-100，0代表没人买，100代表畅销
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }
}
