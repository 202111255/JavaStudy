<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="org.example.model.BoardTO" %>
<%@ page import="org.example.model.BoardDAO" %>


<%
    BoardTO to = new BoardTO();
    to.setSeq(request.getParameter("seq"));
    String seq = request.getParameter("seq");
    to.setSubject(request.getParameter("subject"));
    to.setPassword(request.getParameter("password"));
    to.setMail(request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ));
    to.setContent(request.getParameter("content"));

    BoardDAO boardDAO = new BoardDAO();
    int flag = boardDAO.boardDeleteOk(to);
    // 에러 중심의 후처리 = 자바스크립트 중심으로 처리

    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println( "alert( '글수정 성공' );" );
        out.println( "location.href='./board_view1.jsp?seq="+ seq +"';" );
    } else if ( flag == 1 ) {
        // 비밀번호 오류
        out.println( "alert( '비밀번호 오류' );" );
        out.println( "history.back();" );
    } else {
        out.println( "alert( '글수정 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>
