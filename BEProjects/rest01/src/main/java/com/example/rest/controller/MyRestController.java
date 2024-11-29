package com.example.rest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyRestController {
    @RequestMapping("/rest1")
    public String rest1() {
        return "rest1";
    }

    @RequestMapping("/rest2")
    @ResponseBody
    public String rest2() {
        return "rest2";
    }

}
