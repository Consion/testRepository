package com.consion.designpartten.中介者模式.通过中介者模式实现;


public class Stock extends AbstractColeague{
    AbstractMediator abstractMediator;
    //初始库存
    private static int computerNumber = 100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void clearStock() {
        super.abstractMediator.execute("stock.clear");
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


}
