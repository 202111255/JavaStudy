package org.example.di02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

		AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(BeanConfig.class);

		HelloBean1 helloBean1 = ctx.getBean("helloBean1", HelloBean1.class);
		HelloBean1 helloBean2 = ctx.getBean("helloBean2", HelloBean1.class);

		System.out.println(helloBean1);
		System.out.println(helloBean2);

		HelloBean1 helloBean3 = ctx.getBean("helloBean1", HelloBean1.class);
		System.out.println(helloBean3);
		ctx.close();



	}


}
