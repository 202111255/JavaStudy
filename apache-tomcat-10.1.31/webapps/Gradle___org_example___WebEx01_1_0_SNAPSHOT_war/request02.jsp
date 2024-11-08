<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-07
  Time: 오후 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //요청시 숨겨진 클라이언트의 정보
    Enumeration e = request.getHeaderNames();
    while (e.hasMoreElements()) {
        String headerName = (String)e.nextElement();
        String headerValue = request.getHeader( headerName );
        out.println (headerName + ": " + headerValue + "<br />");
    }

    out.println("user-agent : " + request.getHeader("user-agent") + "<br />");

%>

</body>
</html>
