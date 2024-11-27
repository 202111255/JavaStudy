package com.exam6;

import com.exam4.Gugudan;

public class ThreadEx02 {
    public static void main(String[] args) {
        Thread th1 = new Gugudan(3);
        Thread th2 = new Gugudan(6);

        System.out.println("시작");

        th1.setDaemon(true);
        th2.setDaemon(true);


        th1.start();
        th2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }
}
