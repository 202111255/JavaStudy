package com.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class DeptTO {
    private String deptno;
    private String dname;
    private String loc;
}
