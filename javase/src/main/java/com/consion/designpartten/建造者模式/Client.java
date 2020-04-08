package com.consion.designpartten.建造者模式;

import com.consion.designpartten.建造者模式.impove.BenzBuilder;
import com.consion.designpartten.建造者模式.impove.CarBuilder;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-31 12:24
 */
public class Client {
    public static void main(String[] args) {
        //不用建造者模式创建奔驰车
        CarModel benzCar = new BenzModel();
        ArrayList<String> seqList = new ArrayList<>();
        seqList.add("engine boom");
        seqList.add("start");
        seqList.add("stop");
        benzCar.setSequence(seqList);
        benzCar.run();

        //使用建造者模式来创建奔驰车
        CarBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(seqList);
        CarModel benzModelByBuilder = benzBuilder.getCarModel();
        benzModelByBuilder.run();
    }
}
