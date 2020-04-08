package com.consion.designpartten.建造者模式;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-03-30 20:19
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    public final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if ("start".equals(actionName)) {
                start();
            } else if ("stop".equals(actionName)) {
                stop();
            } else if ("alarm".equals(actionName)) {
                alarm();
            } else if ("engine boom".equals(actionName)) {
                engineBoom();
            }
        }
    }

    public ArrayList<String> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
