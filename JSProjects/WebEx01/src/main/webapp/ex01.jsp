<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-07
  Time: 오전 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  Date date = new Date();
  out.println(date.toLocaleString());
%>

</body>
</html>
