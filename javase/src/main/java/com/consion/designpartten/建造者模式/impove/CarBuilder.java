package com.consion.designpartten.建造者模式.impove;

import com.consion.designpartten.建造者模式.CarModel;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-31 12:28
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
