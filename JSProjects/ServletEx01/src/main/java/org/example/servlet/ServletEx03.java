package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletEx03 extends HttpServlet {
    // service <= get / post
    // doGet        - get 방식
    // doPost       - post 방식

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get 방식 처리
        //System.out.println( "doGet 호출" );
        doProcess(req, resp);
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post 방식 처리
        //System.out.println( "doPost 호출" );
        doProcess(req, resp);
        //super.doPost(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) {
        // get, post 통합 방식 처리
        System.out.println( "doProcess 호출" );
        System.out.println( "data : "+req.getParameter("data") );
        //super.doPost(req, resp);
    }
}