package com.consion.java8.ch2;

import java.util.function.Function;

/**
 * @author Consion
 * @create 2020-08-22 12:15
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g); // g(f(x))
        System.out.println(h.apply(2));

        Function<Integer, Integer> i = f.compose(g); // f(g(x))
        System.out.println(i.apply(2));
    }
}

class Letter {
    public static String addHeader(String text) {
        return "From Raoul , Mario and Alan: " + text;
    }

    public static String addFooter(String text) {
        return text + " Kind regards ";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformatPipeline = addHeader
                .andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);
        System.out.println(transformatPipeline.apply("hello labda"));
    }
}

