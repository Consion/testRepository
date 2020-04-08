package com.consion.designpartten.建造者模式.impove;

import com.consion.designpartten.建造者模式.BenzModel;
import com.consion.designpartten.建造者模式.CarModel;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-31 12:30
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
