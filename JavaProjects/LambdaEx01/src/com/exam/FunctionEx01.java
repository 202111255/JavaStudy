package com.exam;

import java.util.function.Function;

public class FunctionEx01 {
    public static void main(String[] args) {
        //Function
        Function<Integer, String> intToStr = t->String.valueOf(t);
        System.out.println(intToStr.apply(5)); //5를 문자열로 바꿈
    }
}
