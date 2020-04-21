package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * 美工组
 * @author Consion
 * @create 2020-04-16 12:46
 */
public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println("找到页面");
    }

    @Override
    public void add() {
        System.out.println("新增页面");
    }

    @Override
    public void delete() {
        System.out.println("删除页面");
    }

    @Override
    public void change() {
        System.out.println("变更页面");
    }

    @Override
    public void plan() {
        System.out.println("变更计划");
    }
}
