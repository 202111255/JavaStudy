package com.example.album.controller;

import com.example.album.dao.AlbumDAO;
import com.example.album.dto.AlbumTO;
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
public class AlbumController {

    @Autowired
    private AlbumDAO albumDAO;

    @RequestMapping( "/list.do" )
    public String list(Model model) {
        ArrayList<AlbumTO> lists = albumDAO.boardList();

        model.addAttribute("lists", lists );
        return "board_list1";
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
        AlbumTO to = new AlbumTO();
        to.setSubject( request.getParameter( "subject" ) );
        to.setWriter( request.getParameter( "writer") );
        to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
        to.setPassword( request.getParameter( "password" ) );
        to.setContent( request.getParameter( "content" ) );
        to.setWip( request.getRemoteAddr() );

        String imagename = upload.getOriginalFilename();

        String name = imagename.substring( 0, imagename.lastIndexOf( "." ) );
        String ext = imagename.substring( imagename.lastIndexOf( "." ) );

        imagename = name + "_" + System.nanoTime() + ext;

        to.setImagename( imagename );
        to.setImagesize( upload.getSize() );

        try {
            upload.transferTo( new File("c:\\Java\\SpringProjects\\albummybatisboard01\\src\\main\\resources\\static\\upload", imagename));
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        }

        int flag = albumDAO.boardWriteOk( to );

        model.addAttribute( "flag", flag );
        return "board_write1_ok";
    }

    @RequestMapping( value = "/view.do" )
    public String view(String seq, Model model) {
        return "board_view1";
    }

    @RequestMapping( "/modify.do" )
    public String modify(String seq, Model model) {

        return "board_modify1";
    }

    @RequestMapping( "/modify_ok.do" )
    public String modify_ok(
            MultipartFile upload,
            HttpServletRequest request,
            Model model
    ) {
        return "board_modify1_ok";
    }

    @RequestMapping( "/delete.do" )
    public String delete(String seq, Model model) {

        return "board_delete1";
    }

    @RequestMapping( "/delete_ok.do" )
    public String delete_ok(HttpServletRequest request, Model model) {

        return "board_delete1_ok";
    }
}
