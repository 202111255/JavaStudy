package com.exam3;

public class InnerEx {
    //메서드
    public static void main(String[] args) {
        class Inner {
            private int x1 = 100;
            public int x2 = 100;
            private int y1 = 100;
            public int y2 = 100;

            Inner() {
                System.out.println("Inner : " + this);
            }

            public void viewInner() {
                System.out.println("viewInner 호출");
                System.out.println(y1);

            }
        }

    }
}
