<%@page language="java" contentType="text/html; utf-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>HTML !DOCTYPE declaration</title>
</head>
<body>
<form action="./login_ok" method="get">
    아이디 : <input type="text" name="userid" />
    비밀번호 : <input type="password" name="userpw" />
    <br />
    <!--
    <input type="checkbox" name="fruits" value="사과"/>사과<br />
    <input type="checkbox" name="fruits" value="수박" checked/>수박<br />
    <input type="checkbox" name="fruits" value="딸기"/>딸기<br />
    <input type="checkbox" name="fruits" value="참외"/>참외<br />
    -->
    <br /><br />
    <input type="submit" value="전송" />
</form>
</body>
</html>