package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model1.BoardDAO;
import org.example.model1.BoardTO;

public class ModifyOkAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("ModifyOkAction 호출");

        BoardTO to = new BoardTO();
        to.setSeq( req.getParameter( "seq" ) );
        to.setSubject( req.getParameter( "subject" ) );
        to.setMail( req.getParameter( "mail1" ) + "@" + req.getParameter( "mail2" ) );
        to.setPassword( req.getParameter( "password" ) );
        to.setContent( req.getParameter( "content" ) );

        BoardDAO dao = new BoardDAO();
        int flag = dao.boardModifyOk( to );

        req.setAttribute( "flag", flag );
        req.setAttribute( "seq", to.getSeq() );
    }
}
