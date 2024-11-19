package org.example.zipcode.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ZipcodeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void searchZipcode(String strDong) {

        String sql = "select * from zipcode where dong like ?";
        ArrayList<ZipcodeTO> results = (ArrayList<ZipcodeTO>) jdbcTemplate.query
                (sql, new BeanPropertyRowMapper<>(ZipcodeTO.class), "%" + strDong + "%");
        for (ZipcodeTO to : results) {
            System.out.println(to);
        }
    }


}