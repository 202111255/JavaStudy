<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mariadb://localhost:3306/sample";
    String user = "root";
    String password = "!123456";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuilder sbHtml = new StringBuilder();

    try {
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("드라이버 로딩 성공");

        conn = DriverManager.getConnection(url, user, password);
        System.out.println("데이터베이스 연결 성공");

        //코드 추가
        String sql = "select deptno, dname, loc from dept";
        pstmt = conn.prepareStatement(sql);

        rs = pstmt.executeQuery();

        sbHtml.append("<table border='1' cellspacing='0'>");
        while(rs.next()) {
            sbHtml.append("<tr>");
            sbHtml.append("<td>" + rs.getString("deptno") + "</td>");
            sbHtml.append("<td>" + rs.getString("dname") + "</td>");
            sbHtml.append("<td>" + rs.getString("loc") + "</td>");
            sbHtml.append("</tr>");
        }
        sbHtml.append("<table>");
    } catch ( ClassNotFoundException e ) {
        System.out.println(e.getMessage());
    } catch ( SQLException e ) {
        System.out.println(e.getMessage());
    } finally {
        if (conn != null) { conn.close(); }
        if (pstmt != null) { pstmt.close(); }
        if (rs != null) { rs.close(); }
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
HELLO JDBC<br />
<%= sbHtml.toString() %>
</body>
</html>
