package com.example.rest.dao;

import com.example.rest.dto.EmpTO;
import com.example.rest.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmpDAO {

    @Autowired
    private EmpMapper empMapper;

    public ArrayList<EmpTO> empAll() {
        return empMapper.empAll();
    }

    public EmpTO empByEmpno(String empno) {
        return empMapper.empByEmpno(empno);
    }

    public int insert(EmpTO to) {
        return empMapper.insert(to);
    }

    public int update(EmpTO to) {
        return empMapper.update(to);
    }

    public int delete(EmpTO to) {
        return empMapper.delete(to);
    }
}
