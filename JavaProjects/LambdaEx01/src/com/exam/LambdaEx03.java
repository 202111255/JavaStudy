package com.exam;

public class LambdaEx03 {
    public static void main(String[] args) {
        LambdaInter3 f = (int x, int y) -> {System.out.println("method 호출");};
        f.method(10, 20);

        //자료형도 삭제 가능
        f = (x, y) -> System.out.println("method 호출");
        f.method(10, 20);
    }
}
