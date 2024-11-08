<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-08
  Time: 오전 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
    String strDong = request.getParameter( "dong" );

    String url = "jdbc:mariadb://localhost:3306/sample";
    String user = "root";
    String password = "!123456";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuilder sbHtml = new StringBuilder();

    try {
        Class.forName("org.mariadb.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
        pstmt = conn.prepareStatement( sql );
        pstmt.setString( 1, strDong + "%" );

        rs = pstmt.executeQuery();

        // 출력결과 저장
        sbHtml.append( "<table border='1' cellspacing='0'>" );
        while( rs.next() ) {
            sbHtml.append( "<tr>" );
            sbHtml.append( "<td>" + rs.getString( "zipcode" ) + "</td>" );
            sbHtml.append( "<td>" + rs.getString( "sido" ) + "</td>" );
            sbHtml.append( "<td>" + rs.getString( "gugun" ) + "</td>" );
            sbHtml.append( "<td>" + rs.getString( "dong" ) + "</td>" );
            sbHtml.append( "<td>" + rs.getString( "ri" ) + "</td>" );
            sbHtml.append( "<td>" + rs.getString( "bunji" ) + "</td>" );
            sbHtml.append( "</tr>" );
        }
        sbHtml.append( "<table>" );

    } catch ( ClassNotFoundException e ) {
        System.out.println( "[에러] " + e.getMessage() );
    } catch ( SQLException e ) {
        System.out.println( "[에러] " + e.getMessage() );
    } finally {
        // 데이터베이스 연결 종료
        if ( rs != null ) rs.close();
        if ( pstmt != null ) pstmt.close();
        if ( conn != null ) conn.close();
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- zipcode1_ok.jsp -->
<%=sbHtml.toString()%>

</body>
</html>