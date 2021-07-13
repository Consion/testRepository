package com.consion.java8.ch2;

/**
 * @author Consion
 * @create 2020-08-15 23:03
 */
public class Apple {
    private int weight;
    private String color;

    public Apple() {
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getWeight();
    }
}
