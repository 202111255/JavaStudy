<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="org.example.model.BoardTO" %>
<%@ page import="org.example.model.BoardDAO" %>

<%
  BoardTO to = new BoardTO();
  to.setSubject( request.getParameter( "subject" ) );
  to.setWriter( request.getParameter( "writer" ) );
  to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
  to.setPassword( request.getParameter( "password" ) );
  to.setContent( request.getParameter( "content" ) );
  to.setWip( request.getRemoteAddr() );

  BoardDAO dao = new BoardDAO();
  int flag = dao.boardWriteOk( to );

  out.println( "<script type='text/javascript'>" );
  if ( flag == 0 ) {
    // 정상
    out.println( "alert( '글쓰기 성공' );" );
    out.println( "location.href='./board_list1.jsp';" );
  } else {
    // 비정상
    out.println( "alert( '글쓰기 실패' );" );
    out.println( "history.back();" );
  }
  out.println( "</script>" );
%>