package com.exam;

public class LambdaEx04 {
    public static void main(String[] args) {
        LambdaInter4 f = (a, b) -> a > b ? a : b;
        System.out.println(f.method(3, 4));
    }
}
