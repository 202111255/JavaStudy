package com.example.rest.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyRestContoller {

    @RequestMapping("rest1")
    public String rest1() {
        // rest1.jsp 호출 => html 문서
        return "rest1";
    }

    @RequestMapping("rest2")
    @ResponseBody
    public String rest2() {
        // return 문자열 출력
        return "rest2";
    }

}
