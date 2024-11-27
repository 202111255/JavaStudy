package org.example.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet( urlPatterns = {"*.do"} )
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp)  {
        //실제 경로를 파악
        //System.out.println(req.getRequestURI());
        //System.out.println(req.getContextPath());
        //System.out.println(req.getServletPath());

        try {
            String path = req.getServletPath();
            String url = "";
            if (path.equals("/*.do") || path.equals("/view1.do")) {
                System.out.println("view1.do 호출");
                url = "/WEB-INF/views/view1.jsp";
            } else if (path.equals("/view2.do")) {
                System.out.println("view2.do 호출");
                url = "/WEB-INF/views/view2.jsp";
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher(url);
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        }
    }
}
