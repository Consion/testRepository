package com.consion.designpartten.中介者模式;

import com.consion.designpartten.中介者模式.通过中介者模式实现.AbstractMediator;

import java.util.Random;

public class Sale {

    public Sale(AbstractMediator abstractMediator) {
    }

    public void saleIBMComputer(int number) {
        //访问库存
        Stock stock = new Stock();

        //访问采购
        Purchase purchase = new Purchase();
        //库存不足，需要采购人员开始采购
        if (stock.getStockNumber() < number) {
            purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑：" + number + "台");
        stock.decrease(number);
    }

    //发聩销售情况，0-100，0代表没人买，100代表畅销
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    //打折销售，清空库存
    public void offSale() {
        Stock stock = new Stock();
        System.out.println("打折销售IBM电脑，数量：" + stock.getStockNumber());
        stock.decrease(stock.getStockNumber());
    }
}
