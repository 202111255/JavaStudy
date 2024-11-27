package org.example.zipcode;

import org.example.zipcode.model.ZipcodeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zipcode01Application implements CommandLineRunner {

	@Autowired
	ZipcodeDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(Zipcode01Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		for (String arg : args) {
			dao.searchZipcode(arg);
		}
	}
}
