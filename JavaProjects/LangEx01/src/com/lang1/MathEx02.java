package com.lang1;

public class MathEx02 {
    public static void main(String[] args) {
        //난수
        System.out.println(Math.random()); // 0~1 사이의 double형 실수

        //0에서 9까지 정수
        System.out.println((int)(Math.random()*10));

        //1에서 45까지 정수
        System.out.println((int)(Math.random()*45)+1);
    }
}
