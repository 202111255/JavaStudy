package org.example.mybatis02;

import org.example.mybatis02.service.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mybatis02Application implements CommandLineRunner {
    @Autowired
    private MyBatisService myBatisService;

    public static void main(String[] args) {
        SpringApplication.run(Mybatis02Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myBatisService.select();
        myBatisService.selectlist();
    }
}
