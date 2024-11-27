package com.example.configurer.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController {

    public ConfigController() {
        System.out.println("ConfigController 생성자 호출");
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        System.out.println("login() 호출");

        System.out.println("userid : " + request.getParameter("userid"));
        System.out.println("userpw : " + request.getParameter("userpw"));
        System.out.println("newuserid : " + request.getAttribute("newuserid"));
        System.out.println("newuserpw : " + request.getAttribute("newuserpw"));

        return "login";
    }
}
