package com.example.rest.mapper;

import com.example.rest.dto.EmpTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EmpMapper {

    ArrayList<EmpTO> empAll();
    EmpTO empByEmpno(String empno);
    int insert(EmpTO to);
    int update(EmpTO to);
    int delete(EmpTO to);
}
