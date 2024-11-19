<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String seq = (String)request.getAttribute( "seq" );
    int flag = (Integer)request.getAttribute( "flag" );

    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println("alert( '글수정 성공' );");
        out.println("location.href='./view.do?seq=" + seq + "';");
    } else if ( flag == 1 ) {
        out.println( "alert( '비밀번호 오류' );" );
        out.println( "history.back();" );
    } else {
        // 비정상
        out.println( "alert( '글수정 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>
