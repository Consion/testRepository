package com.consion.java8.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Consion
 * @create 2020-08-15 23:01
 */
public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(122, "red"));
        List<Apple> heavyApples = filterApples(apples, new AppleHeavyWeightPridicate());
        List<Apple> greenColorApples = filterApples(apples, new AppleGreenColorPridicate());

    }
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
interface ApplePredicate {
    boolean test(Apple apple);
}
class AppleHeavyWeightPridicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
class AppleGreenColorPridicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}