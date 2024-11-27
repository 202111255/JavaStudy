package com.lang1;

public class WrapperEx02 {
    public static void main(String[] args) {
        //Wrapper class 생성
        Integer i1 = Integer.valueOf(10);
        Integer i2 = 10; //Auto Boxing


        //i1은 참조자료형, i3은 기본자료형 -> UnBoxing
        int i3 = i1;

    }
}
