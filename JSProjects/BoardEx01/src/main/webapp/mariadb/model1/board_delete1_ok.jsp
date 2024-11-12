<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.BoardTO" %>
<%@ page import="org.example.model.BoardDAO" %>

<%
    BoardTO to = new BoardTO();
    to.setSeq(request.getParameter("seq"));
    to.setPassword(request.getParameter("password"));

    BoardDAO boardDAO = new BoardDAO();
    int flag = boardDAO.boardDeleteOk(to);


    // 에러 중심의 후처리 = 자바스크립트 중심으로 처리

    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println( "alert( '글삭제 성공' );" );
        out.println( "location.href='./board_list1.jsp';" );
    } else if ( flag == 1 ) {
        // 비밀번호 오류
        out.println( "alert( '비밀번호 오류' );" );
        out.println( "history.back();" );
    } else {
        out.println( "alert( '글삭제 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>

