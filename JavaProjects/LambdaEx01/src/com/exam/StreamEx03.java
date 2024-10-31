package com.exam;

import java.util.stream.IntStream;

public class StreamEx03 {
    public static void main(String[] args) {
        //1~10숫자
        IntStream test1 = IntStream.rangeClosed(1, 10);
        //test1.forEach(System.out::println);

        test1.filter(i -> i%2 == 0).forEach(System.out::println);

        IntStream test2 = IntStream.of(1, 2, 3, 3, 2, 5, 7, 6, 9);
        test2.distinct().forEach(System.out::print);
    }
}
