<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-07
  Time: 오후 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String strDan = request.getParameter("dan");
    int iDan = Integer.parseInt(strDan);

    out.println("<table border='1' cellspacing='0'>");
    out.println("<tr>");
    for (int i=1; i <= 9; i++) {
        out.println("<td>" + iDan + " X " + i + " = " + (iDan*i) + "</td>");
    }
    out.println("</tr>");
    out.println("</table>");
%>
</body>
</html>
