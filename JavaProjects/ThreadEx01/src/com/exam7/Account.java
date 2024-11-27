package com.exam7;

public class Account {
    //통장잔고
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    //인출메서드
    //synchronized : 하나의 쓰레드가 접근중일때는 lock이 걸림
    public synchronized void withdraw(int money) {
        if (balance >= money) {
            //실제 인출
            try {
                Thread.sleep(1000);
                balance -= money;
            } catch (InterruptedException e) {
                System.out.println("에러: " + e.getMessage());
            }
        } else {
            System.out.println("잔고가 없음");
        }
    }
}
