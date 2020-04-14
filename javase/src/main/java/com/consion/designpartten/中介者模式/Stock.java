package com.consion.designpartten.中介者模式;

import com.consion.designpartten.中介者模式.通过中介者模式实现.AbstractMediator;

public class Stock {
    //初始库存
    private static int computerNumber = 100;

    public Stock(AbstractMediator abstractMediator) {
    }

    //增加库存
    public void increase(int number) {
        computerNumber += number;
        System.out.println("库存容量为：" + computerNumber);
    }

    //库存降低
    public void decrease(int number) {
        computerNumber -= number;
        System.out.println("库存容量为：" + computerNumber);
    }

    //获得库存数量
    public int getStockNumber() {
        return computerNumber;
    }

    //库存压力大，通知销售人员尽快销售，采购人员停止采购
    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + computerNumber);
        //要求打折销售
        sale.offSale();
        //采购人员停止采购
        purchase.refuseBuyIBM();
    }

}
