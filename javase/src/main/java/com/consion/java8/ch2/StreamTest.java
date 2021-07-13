package com.consion.java8.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Consion
 * @create 2020-08-22 13:39
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        // 输出不重复的字符搞不定！
        words.stream().map(s -> s.split("")).distinct().forEach(arr -> Arrays.stream(arr).forEach(System.out::print));
        System.out.println();
        // 使用flatMap解决
        words.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::print);
        // 练习：给定2个数字列表，如何返回所有的数对呢？例如，给力列表【1，2，3】和【3，4】应该返回（1，3）（1，4）（2，3）（2，4）（3，3）（3，4）
       List<Integer> n1 = Arrays.asList(1,2,3);
       List<Integer> n2 = Arrays.asList(3, 4);
        List<int[]> collect = n1.stream().flatMap(n -> n2.stream().map(nn -> new int[]{n, nn})).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
