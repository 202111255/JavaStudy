package org.example.jdbc02.model;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class DeptTO {
    private String deptno;
    private String dname;
    private String loc;
}
