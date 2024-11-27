package com.exam;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        //데이터 생성
        String[] nameArr = {"IronMan", "Captain", "SpiderMan", "Thor"};
        //데이터 처리
        Arrays.sort(nameArr);

        //데이터 출력
        for (String name : nameArr) {
            System.out.println(name);
        }

        //Stream
        //Stream 생성
        Stream<String> nameStream = Arrays.stream(nameArr);
        //Stream 처리
        //Stream 출력
        nameStream.sorted().forEach(System.out::println);
    }
}
