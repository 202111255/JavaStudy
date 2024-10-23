package com.test2;

public class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {
        System.out.println("이동");
    }

    public void attack(Unit u) {
        System.out.println("공격");
    }
}