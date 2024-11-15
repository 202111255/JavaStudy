package org.example.di08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

//		AnnotationConfigApplicationContext ctx
//				= new AnnotationConfigApplicationContext(BeanConfig.class);
//
//		WriteAction writeAction = ctx.getBean("writeAction", WriteAction.class);
//		writeAction.getDao();

		//ctx.close();
	}


}
