package com.exam2;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        System.out.println("시작");

        //g.run();
        //c.run();

        //Thread는 실행용 메서드가 따로 있다.
        g.start();
        c.start(); //->병렬 처리

        System.out.println("끝");
    }
}
