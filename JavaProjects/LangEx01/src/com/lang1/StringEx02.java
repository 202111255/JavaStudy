package com.lang1;

public class StringEx02 {
    public static void main(String[] args) {
        String str1 = "Hello String";

        System.out.println(str1.length());

        //문자열 치환
        String rstr = str1.replaceAll("Hello", "안녕");
        System.out.println(rstr);

        //문자열 연결
        String jstr = str1.concat("안녕");
        System.out.println(jstr);

        //대소문자 변환
        System.out.println("hello".toUpperCase());
        System.out.println("HELLO".toLowerCase());

        //공백 제거(문자열 앞, 뒤)
        String ostr = "       Hello String       ";
        System.out.println(ostr.length());
        String ostr2 = ostr.trim();
        System.out.println(ostr2.length());
        System.out.println(ostr2);
    }
}
