package org.example.di03;

import org.example.model.HelloBean;
import org.example.model2.WriteAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di03Application {

    public static void main(String[] args) {
        SpringApplication.run(Di03Application.class, args);

        GenericXmlApplicationContext ctx
                = new GenericXmlApplicationContext("classpath:context.xml");

        HelloBean helloBean1 = (HelloBean) ctx.getBean("helloBean1");
        helloBean1.SayHello();

        HelloBean helloBean2 = (HelloBean) ctx.getBean("helloBean2");
        helloBean2.SayHello();

        HelloBean helloBean3 = (HelloBean) ctx.getBean("helloBean3");
        helloBean3.SayHello();


//      writeAction
        WriteAction writeAction = (WriteAction) ctx.getBean("writeAction1");
        writeAction.execute();
        ctx.close();
    }

}
