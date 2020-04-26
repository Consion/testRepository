package com.consion.designpartten.责任链模式.impove;


/**
 * @author Consion
 * @create 2020-04-21 13:09
 */
public class Client {
    public static void main(String[] args) {

        IHandler father = new Father(LevelEnum.FATHER_LEVEL_REQUEST);
        IHandler husband = new Husband(LevelEnum.HUSBAND_LEVEL_REQUEST);
        IHandler son = new Son(LevelEnum.SON_LEVEL_REQUEST);
        father.setNext(husband);
        husband.setNext(son);
        IWomen women = new Women(LevelEnum.SON_LEVEL_REQUEST, "去逛街");
        father.handleMessage(women);
    }
}
