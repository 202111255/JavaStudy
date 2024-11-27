<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-12
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./servlet" method="get">
    데이터 <input type="text" name="data" />
    <input type="submit" value="get 방식 전송"/>
</form>

<form action="./servlet" method="post">
    데이터 <input type="text" name="data" />
    <input type="submit" value="post 방식 전송"/>
</form>ZZZZZZZ

<br />

</body>
</html>
