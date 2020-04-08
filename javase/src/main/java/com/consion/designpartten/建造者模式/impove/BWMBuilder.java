package com.consion.designpartten.建造者模式.impove;

import com.consion.designpartten.建造者模式.BWMModel;
import com.consion.designpartten.建造者模式.CarModel;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-31 12:32
 */
public class BWMBuilder extends CarBuilder {
    private BWMModel bwmModel = new BWMModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwmModel;
    }
}
