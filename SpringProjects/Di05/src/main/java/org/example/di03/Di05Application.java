package org.example.di03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

		AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloBean helloBean1 = ctx.getBean("helloBean1", HelloBean.class);
		HelloBean helloBean2 = ctx.getBean("helloBean2", HelloBean.class);

		ctx.close();



	}


}
