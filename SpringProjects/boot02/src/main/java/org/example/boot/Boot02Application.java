package org.example.boot;

import org.example.boot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot02Application implements CommandLineRunner {
	@Autowired
	private ApplicationContext ctx;

	/*@Value("${my.name}")
	private String name;

	@Value("${my.fullname}")
	private String fullname;
	*/
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(Boot02Application.class);
		//app.addListeners(new CustomListener1(), new CustomListener2());
		app.run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(name);
		//System.out.println(fullname);

		User user = ctx.getBean("user", User.class);
		System.out.println(user.getFullname());
		System.out.println(user.getAge());
	}
}
