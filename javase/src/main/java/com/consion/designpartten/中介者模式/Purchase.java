package com.consion.designpartten.中介者模式;

import com.consion.designpartten.中介者模式.通过中介者模式实现.AbstractMediator;

public class Purchase {
    public Purchase(AbstractMediator abstractMediator) {
    }

    public void buyIBMComputer(int number) {
        //访问库存
        Stock stock = new Stock();

        //访问销售
        Sale sale = new Sale();

        //得到电脑销售情况
        int saleStatus = sale.getSaleStatus();
        //如果销售状态不好，折半采购
        if (saleStatus <= 80) {
            number = number/2;
        }
        stock.increase(number);
        System.out.println("采购IBM电脑：" + number + "台");
    }
    public void refuseBuyIBM() {
        System.out.println("不在采购IBM电脑");
    }
}
