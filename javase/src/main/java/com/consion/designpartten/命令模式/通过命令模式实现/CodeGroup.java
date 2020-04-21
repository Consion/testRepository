package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * Code组
 * @author Consion
 * @create 2020-04-16 12:46
 */
public class CodeGroup implements Group {
    @Override
    public void find() {
        System.out.println("找到代码");
    }

    @Override
    public void add() {
        System.out.println("新增代码");
    }

    @Override
    public void delete() {
        System.out.println("删除代码");
    }

    @Override
    public void change() {
        System.out.println("变更代码");
    }

    @Override
    public void plan() {
        System.out.println("变更计划");
    }
}
