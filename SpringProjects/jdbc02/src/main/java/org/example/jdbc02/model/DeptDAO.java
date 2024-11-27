package org.example.jdbc02.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DeptDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void listDepts() {
//        List<Map<String, Object>> results = jdbcTemplate.queryForList("select * from dept");
//
//        for (Map<String, Object> result : results) {
//            System.out.println(result.get("deptno") + "/" + result.get("dname") + "/" + result.get("loc"));
//        }
        String sql = "select * from dept where deptno=?" ;
        ArrayList<DeptTO> result = (ArrayList<DeptTO>) jdbcTemplate.query
                (sql, new BeanPropertyRowMapper<>(DeptTO.class), "20");
        for (DeptTO to : result) {
            System.out.println(to);
        }
    }
}
