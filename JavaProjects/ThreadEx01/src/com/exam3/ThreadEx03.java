package com.exam3;

public class ThreadEx03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("Go : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("Come : " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
