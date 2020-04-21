package com.consion.designpartten.命令模式;

/**
 * @author Consion
 * @create 2020-04-16 12:50
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------客户增加一项需求----------");
        Group gp = new RequirementGroup();
        gp.find();
        gp.add();
        gp.plan();

        System.out.println("------------客户增加一个页面----------");
        Group gp2 = new PageGroup();
        gp2.find();
        gp2.add();
        gp2.plan();
        //客户太难了，所以引申出命令模式
    }
}
