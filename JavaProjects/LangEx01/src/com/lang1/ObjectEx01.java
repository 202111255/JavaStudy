package com.lang1;

public class ObjectEx01 {
    public static void main(String[] args) {
        //Object 클래스 생성
        Object obj1 = new Object();
        System.out.println(obj1);
        //java.lang.Object@41629346

        System.out.println(obj1.toString()); //java.lang.Object@41629346

        //자료형만 분리
        System.out.println(obj1.getClass().getName()); //java.lang.Object

        System.out.println(obj1.hashCode()); //1096979270

        //@41629346은 16진수, 1096979270는 10진수
        //10진수를 16진수로 출력하려면?
        System.out.printf("%x\n", obj1.hashCode());

        Person person = new Person(1001, "이순신", 40);
        System.out.println(person);
        System.out.println(person.toString()); //object 안의 toString이라는 메서드를 호출한 것 <- 상속이 되었기 때문에
    }
}
