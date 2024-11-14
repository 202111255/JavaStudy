package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model1.BoardDAO;
import org.example.model1.BoardTO;

import java.util.ArrayList;

public class WriteOkAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("WriteOkAction 호출");

        BoardTO to = new BoardTO();
        to.setSubject( req.getParameter( "subject" ) );
        to.setWriter( req.getParameter( "writer" ) );
        to.setMail( req.getParameter( "mail1" ) + "@" + req.getParameter( "mail2" ) );
        to.setPassword( req.getParameter( "password" ) );
        to.setContent( req.getParameter( "content" ) );
        to.setWip( req.getRemoteAddr() );

        BoardDAO dao = new BoardDAO();
        int flag = dao.boardWriteOk( to );

        req.setAttribute( "flag", flag );
    }
}
