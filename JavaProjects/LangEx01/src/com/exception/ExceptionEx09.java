package com.exception;

public class ExceptionEx09 {
    public void method1(int num) {
        System.out.println("시작");
        System.out.println("끝");

        //단순한 입력값에 대한 검사
        try {
            if (num >= 100) {
                System.out.println("정상입력");
            } else {
                //System.out.println("비정상입력");
                throw new Exception("비정상입력");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //처리에 대한 위임 -> 실행할 때 알아서 해라
    public void method2(int num) throws Exception {
        System.out.println("시작");

        if (num >= 100) {
            System.out.println("정상입력");
        } else {
            //System.out.println("비정상입력");
            throw new Exception("비정상입력");
        }
        System.out.println("끝");
    }

    public static void main(String[] args) {
        ExceptionEx09 ex = new ExceptionEx09();
        ex.method1(10);
        try {
            ex.method2(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
