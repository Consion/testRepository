package com.consion.designpartten.装饰器模式.impove;

/**
 * @author Consion
 * @create 2020-04-26 12:59
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort() {
        System.out.println("我的排名使第38名");
    }
    @Override
    public void report() {
        sr.report();
        this.reportSort();

    }
}
