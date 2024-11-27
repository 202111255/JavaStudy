package org.example.di03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {

    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

//        BoardTO to = new BoardTO();
//        to.setSeq(1);
//        to.setSubject("제목");
//        WriteAction action = new WriteAction();
//        action.setTo(to);
//        action.execute();
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");
        WriteAction action = (WriteAction) ctx.getBean("action");
        action.execute();

    }

}
