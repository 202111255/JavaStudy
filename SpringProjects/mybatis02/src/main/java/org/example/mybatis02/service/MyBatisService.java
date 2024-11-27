package org.example.mybatis02.service;

import org.example.mybatis02.dao.MyBatisRepository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyBatisService {
    private MyBatisRepository myBatisRepository;

    public MyBatisService(MyBatisRepository myBatisRepository) {
        System.out.println("MyBatisService(MyBatisRepository myBatisRepository) 생성자 호출");
        this.myBatisRepository = myBatisRepository;
    }

    public void select() {
        System.out.println(myBatisRepository.select());
    }

    public void selectlist() {
        System.out.println(myBatisRepository.selectlist());
    }
}
