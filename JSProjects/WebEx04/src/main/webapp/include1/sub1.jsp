<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-11
  Time: 오후 2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
Hello JSP 2<br />
Hello JSP 3<br />
Hello JSP 4<br />
<%
  String data1 = request.getParameter("data1");
  out.println("data1 = " + data1 + "<br />");
%>
