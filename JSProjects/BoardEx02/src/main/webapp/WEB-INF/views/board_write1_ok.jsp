<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<%
    int flag = (Integer)request.getAttribute("flag");


    // 에러 중심의 후처리 = 자바스크립트 중심으로 처리
    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println( "alert( '글쓰기 성공' );" );
        out.println( "location.href='./controller?path=list';" );
    } else {
        // 비정상
        out.println( "alert( '글쓰기 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>

