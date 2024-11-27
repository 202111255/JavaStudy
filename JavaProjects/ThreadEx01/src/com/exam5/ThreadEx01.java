package com.exam5;

public class ThreadEx01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
    }
}
