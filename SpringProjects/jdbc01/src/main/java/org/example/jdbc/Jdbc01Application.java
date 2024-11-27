package org.example.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class Jdbc01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jdbc01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url="jdbc:mariadb://localhost:3306/mysql";
		String user="root";
		String password="!123456";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select now() as now";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("현재 시간 : " + rs.getString("now"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (rs != null) try {rs.close();} catch (SQLException e) {}
			if (pstmt != null) try {pstmt.close();} catch (SQLException e) {}
			if (conn != null) try {conn.close();} catch (SQLException e) {}

		}
	}
}
