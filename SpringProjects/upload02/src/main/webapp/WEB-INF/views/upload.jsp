<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
upload.jsp
<br /><br />
<%--
    upload 경로 확인
    c:\Java\SpringProjects\upload02\src\main\resources\static\upload\
--%>
<form action="upload_ok" method="post" enctype="multipart/form-data">
    file : <input type="file" name="image" />
    <input type="submit" value="전송" />
</form>

</body>
</html>