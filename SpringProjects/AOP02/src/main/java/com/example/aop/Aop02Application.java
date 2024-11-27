package com.example.aop;

import com.example.aop.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Aop02Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Aop02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Hello hello = ctx.getBean("target", Hello.class );
		hello.sayHello();
	}
}
