package org.example.di02;

import org.example.di02.BoardTO;
import org.example.di.WriteAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {

    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

//        BoardTO to = new BoardTO();
//        to.setSeq(10);
//        to.setSubject("제목");

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");
        BoardTO to = (BoardTO)ctx.getBean("to");

        System.out.println("to : " + to);


    }

}
