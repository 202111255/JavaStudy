<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-11
  Time: 오후 2:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello JSP 1<br />
<jsp:include page="sub1.jsp">
    <jsp:param name="data1" value="20"/>
</jsp:include>
<jsp:include page="sub2.jsp"></jsp:include>
Hello JSP 7<br />
</body>
</html>
