package org.example.model;

public class HelloBean {
    private String name;

    public HelloBean() {
        System.out.println("HelloBean() 생성자 호출");
        this.name = "홍길동";
    }

    public HelloBean(String name) {
        System.out.println("HelloBean(String name) 생성자 호출");
        this.name = name;
    }

    public HelloBean(String firstName, String lastName) {
        System.out.println("HelloBean(String firstName, String lastName) 생성자 호출");
        this.name = firstName + " " + lastName;
    }

    public void SayHello() {
        System.out.println(this.name + "님 안녕하세요");
    }
}
