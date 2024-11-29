<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.rest.dto.EmpTO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
list.jsp
<br /> <br/>
<%
    ArrayList<EmpTO> lists = (ArrayList<EmpTO>) request.getAttribute("lists");

%>

</body>
</html>