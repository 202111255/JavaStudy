
package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class Jdbc03Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Jdbc03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("jdbcTemplate : " + jdbcTemplate);

		String result = jdbcTemplate.queryForObject("select now() as now", String.class);
		System.out.println("현재 시간 : " + result);

		List<Map<String, Object>> results = jdbcTemplate.queryForList("show databases");
		for (Map<String, Object> map : results) {
			System.out.println(map.get("Database"));
		}
	}
}
