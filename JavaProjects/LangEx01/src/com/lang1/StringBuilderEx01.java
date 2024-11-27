package com.lang1;

public class StringBuilderEx01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder("Hello StringBuilder");

        System.out.println(sb1.capacity()); //16
        System.out.println(sb2.capacity()); //100
        System.out.println(sb3.capacity()); //데이터 길이 + 16

        //문자열의 길이
        System.out.println(sb1.length()); //0
        System.out.println(sb2.length()); //0
        System.out.println(sb3.length()); //19

        //문자열 추출
        //charAt, substring, indexOf, replace

        //버퍼의 문자열 조작
        //append, insert, delete
        System.out.println(sb3);
        sb3.append(" 안녕");
        System.out.println(sb3);
        sb3.insert(3, "추가");
        System.out.println(sb3);
        sb3.delete(0, 4);
        System.out.println(sb3);

        System.out.println(sb3.reverse());

    }
}
