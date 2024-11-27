package org.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {

    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);
        /* 일반적인 자바 사용방법
        BoardTO to = new BoardTO();
        WriteAction action = new WriteAction(to);
        action.execute();
         */
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");
        WriteAction action = (WriteAction) ctx.getBean("action");
        action.execute();
        ctx.close();
    }

}
