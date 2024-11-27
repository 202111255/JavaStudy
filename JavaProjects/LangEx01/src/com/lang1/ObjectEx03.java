package com.lang1;

public class ObjectEx03 {
    public static void main(String[] args) {
        //동등비교 (==)
        int a = 10;
        int b = 10;

        //내용값을 비교
        System.out.println(a==b);

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2); //false
        System.out.println(o1.equals(o2)); //false -> 내용값이 없기 때문

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        Person p1 = new Person(1001, "박문수", 40);
        Person p2 = new Person(1001, "박문수", 40);

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //false -> equals를 정의를 안했기 때문
        // ㄴ> 재정의 이후 true로 바뀜


    }
}
