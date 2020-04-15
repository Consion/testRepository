package com.consion.designpartten.中介者模式.通过中介者模式实现;

public class Mediator extends AbstractMediator{

    @Override
    public void execute(String string, Object... objects) {
        //采购电脑
        switch (string) {
            case "purchase.buy":
                this.buyIBMComputer((int) objects[0]);
                break;
            case "sale.sell": //销售电脑
                this.saleIBMComputer((int) objects[0]);
                break;
            case "sale.offSell": //打折销售
                this.offSell();
                break;
            case "stock.clear": //清仓销售
                this.clearStock();
                break;
        }
    }
    private void buyIBMComputer(int number) {
        //访问库存
        //访问销售
        //得到电脑销售情况
        int saleStatus = super.sale.getSaleStatus();
        //如果销售状态不好，折半采购
        if (saleStatus <= 80) {
            number = number/2;
        }
        stock.increase(number);
        System.out.println("采购IBM电脑：" + number + "台");
    }

    private void saleIBMComputer(int number) {
        //库存不足，需要采购人员开始采购
        if (super.stock.getStockNumber() < number) {
            this.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑：" + number + "台");
        super.stock.decrease(number);
    }
    private void offSell() {
        System.out.println("打折销售IBM电脑，数量：" + super.stock.getStockNumber());
        super.stock.decrease(super.stock.getStockNumber());
    }
    private void clearStock() {
        System.out.println("清理存货数量为：" + super.stock.getStockNumber());
        //要求打折销售
        this.offSell();
        //采购人员停止采购
        super.purchase.refuseBuyIBM();
    }


}
