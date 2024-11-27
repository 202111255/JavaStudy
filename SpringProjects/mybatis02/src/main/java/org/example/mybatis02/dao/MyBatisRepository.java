package org.example.mybatis02.dao;

import org.example.mybatis02.dto.DeptTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyBatisRepository {
    private SqlSessionTemplate sqlSessionTemplate;

    public MyBatisRepository(SqlSessionTemplate sqlSessionTemplate) {
        System.out.println("MyBatisRepository(SqlSessionTemplate sqlSessionTemplate) 생성자 호출");
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public String select() {
        return sqlSessionTemplate.selectOne("org.example.mybatis01.select");
    }

    public List<DeptTO> selectlist() {
        return sqlSessionTemplate.selectList("org.example.mybatis01.selectlist");
    }
}
