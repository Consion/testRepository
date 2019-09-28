package com.consion.designpartten.asingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 该单例模式可以产生固定数量的对象
 */
public class EmperorOfNumber2 {
    private EmperorOfNumber2(String name){
        nameList.add(name);
    }
    private static int num = 2;
    private static List<String> nameList = new ArrayList<>();
    private static List<EmperorOfNumber2> emperorList = new ArrayList<>();
    private static int curSeq = 0;
    static {
        for (int i = 0; i < num; i++) {
            emperorList.add(new EmperorOfNumber2("皇帝" + (i + 1)));
        }
    }

    public static EmperorOfNumber2 getInstance(){
        Random random = new Random();
        curSeq = random.nextInt(num);
        return emperorList.get(curSeq);
    }

    public void say() {
        System.out.println(nameList.get(curSeq));
    }
}
