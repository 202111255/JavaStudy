<%@ page import="org.example.model.DataDAO" %><%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-11
  Time: 오후 3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    DataDAO dataDAO = new DataDAO();
    StringBuilder sbResult = dataDAO.selectList();
    out.println(sbResult.toString());
%>

</body>
</html>
