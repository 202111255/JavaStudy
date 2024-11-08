package com.exam3;

public class ThreadEx02 {
    public static void main(String[] args) {
        //익명 내부 클래스로 처리
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println("Go : " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println("Come : " + i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
