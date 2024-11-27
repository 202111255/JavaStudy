package org.example.di05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

		AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(BeanConfig.class);

		BoardTO boardTO = ctx.getBean("boardTO", BoardTO.class);
		System.out.println(boardTO);

		ctx.close();
	}


}
