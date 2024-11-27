package org.example.di03;

public class HelloBean {
    private String name;
    public HelloBean() {
        System.out.println("HelloBean1 생성자 호출");
        this.name = "홍길동";
    }

    public HelloBean(String name) {
        System.out.println("HelloBean1 생성자 호출");
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println(name + "님 안녕하세요");
    }
}
