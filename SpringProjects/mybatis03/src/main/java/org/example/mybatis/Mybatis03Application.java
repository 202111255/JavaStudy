package org.example.mybatis;

import org.example.mybatis.service.DeptMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mybatis03Application implements CommandLineRunner {
    @Autowired
    private DeptMybatisService deptMybatisService;

    public static void main(String[] args) {
        SpringApplication.run(Mybatis03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        deptMybatisService.select();
    }
}
