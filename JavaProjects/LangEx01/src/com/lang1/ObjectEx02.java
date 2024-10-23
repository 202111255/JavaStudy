package com.lang1;

public class ObjectEx02 {
    public static void main(String[] args) {
        String string = new String("Hello");
        System.out.println(string.toString());

        //Object - toString - 참조값
        // -> overriding
        //String - toString - 내용값

        Person person = new Person(1001, "이순신", 40);
        //person = person.toString()
        System.out.println(person.toString());
        System.out.println(person);
    }
}
