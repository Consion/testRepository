package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * 需求组
 * @author Consion
 * @create 2020-04-16 12:46
 */
public class RequirementGroup implements Group {
    @Override
    public void find() {
        System.out.println("找到需求");
    }

    @Override
    public void add() {
        System.out.println("新增需求");
    }

    @Override
    public void delete() {
        System.out.println("删除需求");
    }

    @Override
    public void change() {
        System.out.println("变更需求");
    }

    @Override
    public void plan() {
        System.out.println("变更计划");
    }
}
