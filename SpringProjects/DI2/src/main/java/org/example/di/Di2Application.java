package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Di2Application implements CommandLineRunner {
	@Autowired
	private ApplicationContext ctx;
	public static void main(String[] args) {
		SpringApplication.run(Di2Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ctx: " + ctx);

		WriteAction writeAction = ctx.getBean("writeAction", WriteAction.class);
		System.out.println("writeAction : " + writeAction);

		writeAction.getDao();
	}
}
