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
    String strDan = request.getParameter("strdan");
    int sDan = Integer.parseInt(strDan);

    String endDan = request.getParameter("enddan");
    int eDan = Integer.parseInt(endDan);


    StringBuilder sbHtml = new StringBuilder();

    sbHtml.append("<table border='1' cellspacing='0'>");
    for (int i=sDan; i <= eDan; i++) {
        sbHtml.append("<tr>");
        for (int j=1; j <= 9; j++) {
            sbHtml.append("<td>" + i + " X " + j + " = " + (i*j) + "</td>");
        }
        sbHtml.append("</tr>");
    }
    sbHtml.append("</table>");

    out.println(sbHtml.toString());
    
%>
</body>
</html>
