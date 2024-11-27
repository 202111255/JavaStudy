package com.exam2;

public class Outer {
    private int x1 = 100;
    public int x2 = 100;

    //인스턴스 내부 클래스
    static class Inner {
        private int y1 = 200;
        public int y2 = 200;

        public Inner() {
            System.out.println("Inner: " + this);
        }

        public void viewInner() {
            System.out.println("ViewInner 호출");

            //System.out.println(x1); -> 직접 접근 불가
            //System.out.println(x2);
            System.out.println(y1);
            System.out.println(y2);
        }
    }
}
