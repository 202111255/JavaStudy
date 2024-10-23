package com.lang1;

public class SystemEx01 {
    public static void main(String[] args) {
        System.out.println("시작");
        if (args.length != 1) {
            System.out.println("비정상 실행");
            System.exit(0);
        } else {
            System.out.println("정상 실행");
        }

        //프로그램 강제 종료 ?


        System.out.println("끝");
    }
}
