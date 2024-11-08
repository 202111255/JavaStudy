package com.exam4;

import com.exam4.Gugudan;

public class ThreadExam {
    public static void main(String[] args) {
        Thread th1 = new Gugudan(3);
        Thread th2 = new Gugudan(6);
        th1.start();
        th2.start();
    }
}
