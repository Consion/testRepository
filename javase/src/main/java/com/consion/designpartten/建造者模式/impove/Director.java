package com.consion.designpartten.建造者模式.impove;

import com.consion.designpartten.建造者模式.CarModel;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-31 12:41
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private CarBuilder benzCarBuilder = new BenzBuilder();
    private CarBuilder bwmCarBuilder = new BWMBuilder();
    public CarModel getABenzModel() {
        // start, stop
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        benzCarBuilder.setSequence(sequence);
       return benzCarBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        // engine boom,start
        sequence.clear();
        sequence.add("engine boom");
        sequence.add("start");
        benzCarBuilder.setSequence(sequence);
        return benzCarBuilder.getCarModel();
    }
    public CarModel getCWMModel() {
        // alarm, start, stop
        sequence.clear();
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        bwmCarBuilder.setSequence(sequence);
        return bwmCarBuilder.getCarModel();
    }

    public CarModel getDBWMModel() {
        // start
        sequence.clear();
        sequence.add("start");
        bwmCarBuilder.setSequence(sequence);
        return bwmCarBuilder.getCarModel();
    }
}
