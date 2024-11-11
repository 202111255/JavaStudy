<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-11
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.BoardTO"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BoardTO to = new BoardTO();
    to.setId("tester");
    to.setPassword("1234");

    out.println(to.getId() + "<br />");
    out.println(to.getPassword() + "<br />");
%>

</body>
</html>
