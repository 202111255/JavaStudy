package com.exam;

public class LambdaEx06 {
    public static LambdaInter6 getLambdaInter6() {
        LambdaInter6 f = () -> System.out.println("Hello Lambda");
        return f;
    }
    public static void main(String[] args) {
        LambdaInter6 f = getLambdaInter6();
        f.run();
    }
}
