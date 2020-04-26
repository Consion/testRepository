package com.consion.designpartten.责任链模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Consion
 * @create 2020-04-21 13:09
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要去逛街。。。"));
        }


        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            System.out.println("type:" + women.getType());
            int type = women.getType();
            if (type == 1) {
                father.handleMessage(women);
            } else if (type == 2) {
                husband.handleMessage(women);
            } else if (type == 3) {
                son.handleMessage(women);
            }
        }

    }
}
