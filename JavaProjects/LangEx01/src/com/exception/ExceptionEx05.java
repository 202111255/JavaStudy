package com.exception;

import java.util.Date;

public class ExceptionEx05 {
    public static void main(String[] args) {
        System.out.println("시작");

        Date date1 = new Date();
        Date date2 = null;

        System.out.println(date1.toLocaleString());
        try {
            //try로 설정하는 구역은 가능한 최소로
            System.out.println(date2.toLocaleString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("객체를 생성하지 않음");

        }


        System.out.println("끝");
    }
}
