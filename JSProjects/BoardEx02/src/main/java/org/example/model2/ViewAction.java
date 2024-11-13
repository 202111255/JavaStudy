package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.BoardDAO;
import org.example.model.BoardTO;

public class ViewAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("ViewAction 호출");

        String seq = req.getParameter("seq");
        BoardTO to = new BoardTO();
        to.setSeq(seq);

        BoardDAO dao = new BoardDAO();
        to = dao.boardView(to);

        String subject = to.getSubject();
        String writer = to.getWriter();
        String mail = to.getMail();
        String wip = to.getWip();
        String wdate = to.getWdate();
        String hit = to.getHit();
        String content = to.getContent();

        req.setAttribute("to", to);
    }
}
