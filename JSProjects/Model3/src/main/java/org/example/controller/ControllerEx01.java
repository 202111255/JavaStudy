package org.example.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model2.*;

import java.io.IOException;

public class ControllerEx01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String path = req.getParameter("path");

            Action action = null;
            String url = "";
            if (path == null || path.equals("form")) {
                //back-end controller 호출
                action = new FormAction();
                action.execute(req, resp);

                System.out.println("FormAction 호출");
                url = "/WEB-INF/views/form.jsp";
            } else if (path.equals("form_ok")) {
                //back-end controller 호출
                action = new FormOkAction();
                action.execute(req, resp);

                System.out.println("FormOkAction 호출");
                url = "/WEB-INF/views/form_ok.jsp";

            //우편번호 검색기
            } else if (path.equals("zipcode")) {
                //back-end controller 호출
                action = new ZipcodeAction();
                action.execute(req, resp);

                url = "/WEB-INF/views/zipcode.jsp";
            } else if ( path.equals("zipcode_ok")) {
                //back-end controller 호출
                action = new ZipcodeOkAction();
                action.execute(req, resp);

                url = "/WEB-INF/views/zipcode_ok.jsp";
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
