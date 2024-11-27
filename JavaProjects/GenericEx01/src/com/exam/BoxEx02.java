package com.exam;

public class BoxEx02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2<>();
        box2.setT("홍길동");
        String name = box2.getT();
        System.out.println(name);

        Box2<Integer> box3 = new Box2<>();
        box3.setT(10);
        int number = box3.getT();
        System.out.println(name);
    }
}
