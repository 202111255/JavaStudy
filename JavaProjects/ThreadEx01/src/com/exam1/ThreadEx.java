package com.exam1;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        //순차 처리
        g.run();
        c.run();
    }
}
