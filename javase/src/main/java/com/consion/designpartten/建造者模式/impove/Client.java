package com.consion.designpartten.建造者模式.impove;

import com.consion.designpartten.建造者模式.CarModel;

/**
 * @author Consion
 * @create 2020-03-31 12:58
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarModel carModel = director.getABenzModel();
        carModel.run();

        CarModel bwmCar = director.getCWMModel();
        bwmCar.run();
    }
}
