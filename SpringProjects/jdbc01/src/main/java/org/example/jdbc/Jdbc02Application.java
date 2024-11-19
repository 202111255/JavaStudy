package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.*;

@SpringBootApplication
public class Jdbc02Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(Jdbc02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Hikari Database Pooling
		System.out.println("dataSource : " + dataSource);
		System.out.println("Connection : " + dataSource.getConnection());

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			String sql = "select now() as now";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("현재 시간 : " + rs.getString("now"));
			}
		} catch (SQLException e) {
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (rs != null) try {rs.close();} catch (SQLException e) {}
			if (pstmt != null) try {pstmt.close();} catch (SQLException e) {}
			if (conn != null) try {conn.close();} catch (SQLException e) {}

		}
	}
}
