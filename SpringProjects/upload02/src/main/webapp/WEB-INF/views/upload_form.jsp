<%@page language="java" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
form.jsp

<form action="form_ok" method="post" enctype="multipart/form-data">
    아이디 : <input type = "text" name = "userid" /><br />
    비밀번호 : <input type = "password" name = "userpw" /><br />
    <br />
    <input type = "file" name="upload" />
    <input type = "submit" value="파일 전송"/>
</form>

</body>
</html>