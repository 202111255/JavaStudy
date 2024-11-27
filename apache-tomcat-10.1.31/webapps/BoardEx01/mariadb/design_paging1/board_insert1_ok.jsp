<%--
  Created by IntelliJ IDEA.
  User: kevin
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

<%
  Connection conn = null;
  PreparedStatement pstmt = null;

  int flag = 1;

  try {
    Context initCtx = new InitialContext();
    Context envCtx = (Context) initCtx.lookup("java:comp/env");
    DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

    conn = dataSource.getConnection();

    String sql = "insert into board1 values ( 0, ?, ?, ?, password( ? ), ?, 0, ?, now() )";
    pstmt = conn.prepareStatement(sql);

    for ( int i=1 ; i<=150 ; i++ ) {
      pstmt.setString(1, "제목 : " + i );
      pstmt.setString(2, "이름");
      pstmt.setString(3, "test@test.com");
      pstmt.setString(4, "1234");
      pstmt.setString(5, "내용 : " + i );
      pstmt.setString(6, "000.000.000.000");

      int result = pstmt.executeUpdate();
    }

    flag = 0;

  } catch ( NamingException e ) {
    System.out.println( "[에러] " + e.getMessage() );
  } catch ( SQLException e ) {
    System.out.println( "[에러] " + e.getMessage() );
  } finally {
    if ( pstmt != null ) pstmt.close();
    if ( conn != null ) conn.close();
  }

  // 에러 중심의 후처리 = 자바스크립트 중심으로 처리

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