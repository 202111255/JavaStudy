package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model1.BoardDAO;
import org.example.model1.BoardTO;

import java.util.ArrayList;

public class ViewAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("ViewAction 호출");

        BoardDAO dao = new BoardDAO();
        BoardTO to = new BoardTO();
        to.setSeq(req.getParameter("seq"));
        to = dao.boardView(to);

        req.setAttribute("to", to);
    }
}
