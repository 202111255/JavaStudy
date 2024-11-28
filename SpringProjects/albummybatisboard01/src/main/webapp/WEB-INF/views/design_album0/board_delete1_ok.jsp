<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int flag = (Integer)request.getAttribute( "flag" );

    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println("alert( '앨범삭제 성공' );");
        out.println("location.href='./list.do';");
    } else if ( flag == 1 ) {
        out.println( "alert( '비밀번호 오류' );" );
        out.println( "history.back();" );
    } else {
        // 비정상
        out.println( "alert( '앨범삭제 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>