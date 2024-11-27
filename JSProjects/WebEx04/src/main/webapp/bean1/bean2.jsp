<%@ page import="org.example.model.BoardTO" %><%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-11
  Time: 오후 3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="to" class="org.example.model.BoardTO"/>
<%
    to.setId("tester");
    to.setPassword("1234");

    out.println(to.getId() + "<br />");
    out.println(to.getPassword() + "<br />");
%>
</body>
</html>
