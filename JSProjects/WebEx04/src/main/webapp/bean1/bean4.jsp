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
<jsp:setProperty name="to" property="id" value="tester"/>
<jsp:setProperty name="to" property="password" value="1234"/>
<jsp:getProperty name="to" property="id"/> <br/>
<jsp:getProperty name="to" property="password"/> <br/>
</body>
</html>
