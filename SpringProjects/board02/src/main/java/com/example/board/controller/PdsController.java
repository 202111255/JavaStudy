package com.example.board.controller;

import com.example.board.dao.BoardDAO;
import com.example.board.dao.PdsDAO;
import com.example.board.dto.PdsTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class PdsController {

    @Autowired
    private BoardDAO boardDAO;
    @Autowired
    private PdsDAO pdsDAO;

    @RequestMapping( "/list.do" )
    public String list(Model model) {
        ArrayList<PdsTO> lists = pdsDAO.boardList();

        model.addAttribute("lists", lists );
        return "board_list1";
    }

    @RequestMapping( value = "/view.do" )
    public String view(String seq, Model model) {
        PdsTO to = new PdsTO();
        to.setSeq(seq);

        to = pdsDAO.boardView( to );

        model.addAttribute( "to", to );
        return "board_view1";
    }

    @RequestMapping( "/write.do" )
    public String write() {
        return "board_write1";
    }

    @RequestMapping( "/write_ok.do" )
    public String write_ok(
        MultipartFile upload,
        HttpServletRequest request,
        Model model
    ) {
        PdsTO to = new PdsTO();
        to.setSubject( request.getParameter( "subject" ) );
        to.setWriter( request.getParameter( "writer") );
        to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
        to.setPassword( request.getParameter( "password" ) );
        to.setContent( request.getParameter( "content" ) );
        to.setWip( request.getRemoteAddr() );

        if ( !upload.isEmpty() ) {

            try {
                String filename = upload.getOriginalFilename();

                String name = filename.substring( 0, filename.lastIndexOf( "." ) );
                String ext = filename.substring( filename.lastIndexOf( "." ) );

                filename = name + "_" + System.nanoTime() + ext;

                upload.transferTo( new File("C:\\Java\\SpringProjects\\board02\\src\\main\\resources\\static\\upload", filename));

                to.setFilename( filename );
                to.setFilesize( upload.getSize() );

                //System.out.println( to );

            } catch (IOException e) {
                System.out.println( "[에러] " + e.getMessage() );
            }

        }

        int flag = pdsDAO.boardWriteOk( to );

        //System.out.println( flag );

        model.addAttribute( "flag", flag );

        return "board_write1_ok";
    }

    @RequestMapping( "/modify.do" )
    public String modify(String seq, Model model) {
        PdsTO to = new PdsTO();
        to.setSeq( seq );

        to = pdsDAO.boardModify( to );

        model.addAttribute( "to", to );
        return "board_modify1";
    }

    @RequestMapping( "/modify_ok.do" )
    public String modify_ok(HttpServletRequest request, Model model ) {
        return "board_modify1_ok";
    }

    @RequestMapping( "/delete.do" )
    public String delete(String seq, Model model) {
        PdsTO to = new PdsTO();
        to.setSeq( seq );

        to = pdsDAO.boardDelete( to );

        model.addAttribute( "to", to );

        return "board_delete1";
    }

    @RequestMapping( "/delete_ok.do" )
    public String delete_ok(HttpServletRequest request, Model model) {
        return "board_delete1_ok";
    }
}
