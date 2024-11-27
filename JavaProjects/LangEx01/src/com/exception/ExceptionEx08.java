package com.exception;

public class ExceptionEx08 {
    public static void main(String[] args) {
        //강제 Exception 발생(throw)
        try {
            if (args.length == 1) {
                System.out.println("정상 실행");
            } else {
                System.out.println("실행 오류");
                throw new Exception("정상적인 입력을 받아야 합니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
