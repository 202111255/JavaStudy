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
public class AlbumController {

    @RequestMapping( "/list.do" )
    public String list(Model model) {
        return "board_list1";
    }

    @RequestMapping( value = "/view.do" )
    public String view(String seq, Model model) {
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

        return "board_write1_ok";
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
