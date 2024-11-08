<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ex01</title>
    </head>

    <body>
        Hello JSP<br />
        <% 
        // 웹 컨테이너의 로그로 출력
        System.out.println("Hello JSP"); 
        // 웹 브라우저에 출력
        out.println("<b>Hello JSP</b>"); 
        %>
    </body>

    </html>