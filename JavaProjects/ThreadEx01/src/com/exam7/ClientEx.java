package com.exam7;

public class ClientEx {
    public static void main(String[] args) {
        Account account = new Account();

        //첫번째 ATM
        Client client1 = new Client(account);
        //두번째 ATM
        Client client2 = new Client(account);

        Thread t1 = new Thread(client1);
        Thread t2 = new Thread(client2);

        System.out.println("시작");

        t1.start();
        t2.start();

        System.out.println("끝");
    }
}
