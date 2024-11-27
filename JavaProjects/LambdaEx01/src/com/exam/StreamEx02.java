package com.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {
    public static void main(String[] args) {
        //스트림생성

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        //for문을 통한 출력
        intStream.forEach(System.out::println);

    }
}
