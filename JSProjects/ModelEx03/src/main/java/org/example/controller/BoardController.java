package org.example.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model2.*;

import java.io.IOException;

@WebServlet( urlPatterns = {"*.do"} )
public class BoardController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            String path = req.getServletPath();
            String url = "";
            Action action = null;

            if (path.equals("/*.do") || path.equals("/list.do")) {System.out.println("view1.do 호출");
                action = new ListAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_list1.jsp";
            } else if (path.equals("/view.do")) {
                action = new ViewAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_view1.jsp";
            } else if (path.equals("/modify.do")) {
                action = new ModifyAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_modify1.jsp";
            } else if (path.equals("/modify_ok.do")) {
                action = new ModifyOkAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_modify1_ok.jsp";
            } else if (path.equals("/delete.do")) {
                action = new DeleteAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_delete1.jsp";
            } else if (path.equals("/delete_ok.do")) {
                action = new DeleteOkAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_delete1_ok.jsp";
            } else if (path.equals("/write.do")) {
                action = new WriteAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_write1.jsp";
            } else if (path.equals("/write_ok.do")) {
                action = new WriteOkAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/board_write1_ok.jsp";
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

