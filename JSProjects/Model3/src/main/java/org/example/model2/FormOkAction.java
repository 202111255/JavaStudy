package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormOkAction implements Action{

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("FormOkAction 호출");
        //System.out.println("data : " + req.getParameter("data"));

        //view page로 데이터 전송
        //req.setAttribute("data", req.getParameter("data"));
    }
}
