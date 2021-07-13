package com.consion.java8.ch2;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * @author Consion
 * @create 2020-08-16 19:19
 */
public class ConstructorRef {
    public static void main(String[] args) {
        // 构造方法引用
        Supplier<Apple> c1 = () -> new Apple();
        System.out.println(c1.get());
        // lambda简化写法
        Supplier<Apple> c2 = Apple::new;
        System.out.println(c2.get());
        BiFunction<Integer, String, Apple> c3 = Apple::new;
        System.out.println(c3.apply(100, "red"));

    }
}
