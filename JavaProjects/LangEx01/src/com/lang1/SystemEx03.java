package com.lang1;

public class SystemEx03 {
    //엔터키
    public static void main(String[] args) {
        //엔터키
        System.out.println("hello");
        System.lineSeparator();
        System.out.println("hello");
        System.lineSeparator();

        //환경값
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getenv("PATH"));
    }
}
