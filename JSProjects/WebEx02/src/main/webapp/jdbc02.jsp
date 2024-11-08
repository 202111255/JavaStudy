<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
HELLO JDBC<br />
<%
    String url = "jdbc:mariadb://localhost:3306/sample";
    String user = "root";
    String password = "!123456";

    Connection conn = null;

    try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");
    } catch ( ClassNotFoundException e ) {
        System.out.println(e.getMessage());
    } catch ( SQLException e ) {
        System.out.println(e.getMessage());
    } finally {
        if (conn != null) { conn.close(); }
    }

%>

</body>
</html>
