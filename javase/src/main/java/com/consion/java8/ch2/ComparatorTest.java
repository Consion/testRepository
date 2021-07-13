package com.consion.java8.ch2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Consion
 * @create 2020-08-15 23:18
 */
public class ComparatorTest {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(122, "red"));
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(apples);
    }
}
