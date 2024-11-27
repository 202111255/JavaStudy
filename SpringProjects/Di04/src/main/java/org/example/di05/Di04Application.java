package org.example.di05;

import org.example.di04.BoardListTO;
import org.example.di04.BoardTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;

@SpringBootApplication
public class Di04Application {

    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

        /*
        HashMap<String, String> userMaps = new HashMap<>();
        userMaps.put("1", "제목1");
        userMaps.put("2", "제목2");

        BoardMapTO mapTO = new BoardMapTO();
        mapTO.setUserMaps(userMaps);

        for ( String value : mapTO.getUserMaps().values() ) {
            System.out.println(value);
        }
         */
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context3.xml");
        BoardMapTO mapTO = (BoardMapTO) ctx.getBean("mapTO");
        for ( String value : mapTO.getUserMaps().values() ) {
            System.out.println(value);
        }
        ctx.close();

    }
}