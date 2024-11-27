package org.example.di02;

import org.example.model.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di02Application {

    public static void main(String[] args) {
        SpringApplication.run(Di02Application.class, args);


        GenericXmlApplicationContext ctx
                = new GenericXmlApplicationContext("classpath:context.xml");

        //같은 클래스의 빈 2개
        HelloBean helloBean11 = (HelloBean) ctx.getBean("helloBean11");
        HelloBean helloBean12 = (HelloBean) ctx.getBean("helloBean12");
        System.out.println("helloBean11 " + helloBean11);
        System.out.println("helloBean12 " + helloBean12);

        helloBean11.sayHello("홍길동");
        helloBean12.sayHello("박문수");



        ctx.close();


    }
}
