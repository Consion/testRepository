package com.consion.designpartten.中介者模式.通过中介者模式实现;

import com.consion.designpartten.中介者模式.Purchase;
import com.consion.designpartten.中介者模式.Sale;
import com.consion.designpartten.中介者模式.Stock;

public abstract class AbstractMediator {
    protected Sale sale;
    protected Stock stock;
    protected Purchase purchase;

    public AbstractMediator() {
        this.sale = new Sale(this);
        this.stock = new Stock(this);
        this.purchase = new Purchase(this);
    }

    public abstract void execute(String string, Object... objects);

}
