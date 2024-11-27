package com.exam4;

public class Gugudan extends Thread{
    private int dan;

    public Gugudan(int dan) {
        this.dan = dan;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }
}
