<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-07
  Time: 오후 3:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Calendar" %>
<%
    int year = Integer.parseInt( request.getParameter( "year" ) );
    int month = Integer.parseInt( request.getParameter( "month" ) );

    Calendar startCalendar = Calendar.getInstance();
    Calendar endCalendar = Calendar.getInstance();

    startCalendar.set( year, month - 1, 1 );
    endCalendar.set( year, month, 1 - 1 );

    int startDayOfWeek = startCalendar.get( Calendar.DAY_OF_WEEK );
    int endDate = endCalendar.get( Calendar.DATE );
    int endDayOfWeek = endCalendar.get( Calendar.DAY_OF_WEEK );

    StringBuilder sbHtml = new StringBuilder();
    sbHtml.append( "<table border='1' cellspacing='0' width='600' height='400'>" );
    sbHtml.append( "<tr>" );
    sbHtml.append( "<td>일요일</td><td>월요일</td><td>화요일</td><td>수요일</td><td>목요일</td><td>금요일</td><td>토요일</td>" );
    sbHtml.append( "</tr>" );

    sbHtml.append( "<tr>" );
    for( int i=1 ; i<startDayOfWeek ; i++ ) {
        sbHtml.append( "<td></td>" );
    }

    for( int i=1, n=startDayOfWeek ; i<=endDate ; i++, n++ ) {
        if ( n % 7 == 1) {
            sbHtml.append("<tr>");
        }

        if ( n % 7 == 0 ) {
            sbHtml.append( "<td bgcolor='blue'>" + i + "</td>" );
        } else if ( n % 7 == 1 ) {
            sbHtml.append( "<td bgcolor='red'>" + i + "</td>" );
        } else {
            sbHtml.append( "<td>" + i + "</td>" );
        }

        if ( n % 7 == 0 ) {
            sbHtml.append( "</tr>");
        }
    }

    for ( int i=endDayOfWeek ; i<=6 ; i++ ) {
        sbHtml.append( "<td></td>" );
    }

    sbHtml.append( "</tr>" );
    sbHtml.append( "</table>" );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- calendar1_ok.jsp -->
<%=sbHtml.toString() %>

</body>
</html>