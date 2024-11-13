<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-13
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
zipcode.jsp <br/><br/>
<form action="./controller" method="post">
    <input type="hidden" name="path" value="zipcode_ok">
    동이름 <input type="text" name="dong" />
    <input type="submit" value="동이름 검색">
</form>
</body>
</html>
