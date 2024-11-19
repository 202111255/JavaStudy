package org.example.lifecycle;

import org.example.di05.BoardMapTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {

    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:lifecycle.xml");

        Action action = (Action) ctx.getBean("writeAction");
        action.execute();
        ctx.close();

    }
}