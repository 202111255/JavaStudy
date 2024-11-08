package com.exam3;

import com.exam3.Come;
import com.exam3.Go;

public class ThreadEx {
    public static void main(String[] args) {
        //thread 화 시켜야 가동이 됨
        Thread t1 = new Thread(new Go());
        Thread t2 = new Thread(new Come());

        System.out.println("시작");

        t1.start();
        t2.start();

        System.out.println("끝");
    }
}
