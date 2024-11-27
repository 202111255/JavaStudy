package com.exam;

public class LambdaEx01 {
    public static void main(String[] args) {
        new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        }.method();

        LambdaInter1 f = new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        };

        f.method();


        //lambda
        f = () -> {System.out.println("Hello Lambda 3");};
        f.method();

        //한줄 짜리는 중괄호도 지울 수 있음
        f = () -> System.out.println("Hello Lambda 4");;
        f.method();
    }
}
