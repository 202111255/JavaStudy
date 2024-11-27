<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.DataSource" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Connection conn = null;

    Context initCtx = new InitialContext();
    Context envCtx = (Context)initCtx.lookup("java:comp/env");
    DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

    conn = dataSource.getConnection();
    out.println("데이터베이스 연결 성공");

    conn.close();

%>

</body>
</html>
