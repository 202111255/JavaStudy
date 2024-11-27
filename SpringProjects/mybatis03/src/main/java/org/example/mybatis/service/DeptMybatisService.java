package org.example.mybatis.service;

import org.example.mybatis.mapper.DeptMyBatisMapper;
import org.springframework.stereotype.Service;

@Service
public class DeptMybatisService {
    private DeptMyBatisMapper deptMyBatisMapper;

    public DeptMybatisService(DeptMyBatisMapper deptMyBatisMapper) {
        this.deptMyBatisMapper = deptMyBatisMapper;
    }

    public void select() {
        System.out.println(deptMyBatisMapper.select());
    }
}
