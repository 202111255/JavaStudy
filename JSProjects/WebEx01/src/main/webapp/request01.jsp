<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-07
  Time: 오후 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //웹서버에 접속한 클라이언트 아이피
    //IPv6(*) / IPv4
    out.println(request.getRemoteAddr() + "<br />"); //클라이언트(브라우저)의 IP 주소를 반환
    out.println(request.getContextPath() + "<br />"); //웹 애플리케이션의 컨텍스트 경로를 반환
    out.println(request.getRequestURI() + "<br />"); //요청된 URI(Uniform Resource Identifier)를 반환
    out.println(request.getRequestURL() + "<br />"); //요청된 전체 URL을 반환

    out.println(request.getServerName() + "<br />"); //요청을 받은 서버의 이름(호스트 이름)을 반환
    out.println(request.getServerPort() + "<br />"); //요청을 받은 서버의 포트 번호를 반환

%>

</body>
</html>
