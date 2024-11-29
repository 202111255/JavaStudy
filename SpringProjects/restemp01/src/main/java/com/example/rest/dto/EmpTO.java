package com.example.rest.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias( value = "to" )
@Getter
@Setter
public class EmpTO {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private String sal;
    private String comm;
    private String deptno;
}
