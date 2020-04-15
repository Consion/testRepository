package com.consion.designpartten.中介者模式.通过中介者模式实现;


/**
 * @author Consion
 * @create 2020-04-15 13:24
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        // 采购人员采购电脑
        System.out.println("采购人员采购电脑");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        //销售人员销售电脑
        System.out.println("销售人员销售电脑");
        Sale sale = new Sale(mediator);
        sale.saleIBMComputer(1);

        //库房管理人员管理库存
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
