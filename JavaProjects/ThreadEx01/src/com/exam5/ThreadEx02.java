package com.exam5;

import com.exam4.Gugudan;

public class ThreadEx02 {
    public static void main(String[] args) {
        Thread th1 = new Gugudan(3);
        Thread th2 = new Gugudan(6);

        System.out.println("시작");
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());

        th1.setPriority(9);
        th2.setPriority(1);

        th1.start();
        th2.start();
    }
}
