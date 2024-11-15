package org.example.di07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

		AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(BeanConfig1.class, BeanConfig2.class);

		HelloBean1 helloBean1 = ctx.getBean("helloBean1", HelloBean1.class);
		HelloBean2 helloBean2 = ctx.getBean("helloBean2", HelloBean2.class);


		ctx.close();
	}


}
