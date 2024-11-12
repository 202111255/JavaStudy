<%@ page import="org.example.model.MemberTO" %><%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-12
  Time: 오후 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    MemberTO to = new MemberTO("10", "영업부", "부산");
    //to.setDeptno("10");
    //to.setDname("영업부");
    //to.setLoc("부산");

    out.println(to.getDeptno() + "<br />");
    out.println(to.getDname() + "<br />");
    out.println(to.getLoc() + "<br />");
%>

</body>
</html>
