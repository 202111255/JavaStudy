<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    //out.println( "flag : " + (Integer)request.getAttribute( "flag" ) );
    out.println( "<script type='text/javascript'>" );
    int flag = (Integer)request.getAttribute( "flag" );
    if ( flag == 0 ) {
        out.println( "alert('로그인되었습니다.');");
        out.println( "location.href='./login_complete';");
    } else if ( flag == 1 ) {
        out.println( "alert('아이디 비밀번호 오류');");
        out.println( "history.back();");
    } else {
        out.println( "alert('시스템 오류');");
        out.println( "history.back();");
    }
    out.println( "</script>" );
%>
</body>
</html>