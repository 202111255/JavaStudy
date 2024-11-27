<%--
  Created by IntelliJ IDEA.
  User: kbd11
  Date: 2024-11-07
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Calendar"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello Calendar

<%
    int year = 2024;
    int month = 12;

    Calendar startCalendar = Calendar.getInstance();
    Calendar endCalendar = Calendar.getInstance();

    startCalendar.set( year, month - 1, 1 );
    endCalendar.set( year, month, 1 - 1 );

    int startDayOfWeek = startCalendar.get( Calendar.DAY_OF_WEEK );
    int endDate = endCalendar.get( Calendar.DATE );

    System.out.println( startDayOfWeek );
    System.out.println( endDate );

    System.out.println( " SU MO TU WE TH FR SA" );
    for( int i=1 ; i<startDayOfWeek ; i++ ) {
        System.out.print( "   " );
    }

    for( int i=1, n=startDayOfWeek ; i<=endDate ; i++, n++ ) {
        System.out.print( ( i < 10 ) ? "  " + i : " " + i );
        if ( n % 7 == 0 ) {
            System.out.println();
        }
    }
%>

</body>
</html>
