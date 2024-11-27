package org.example.param.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConfigController {
    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/form_ok1")
    public String form_ok(HttpServletRequest request) {
        System.out.println("userid : " + request.getParameter("userid"));
        System.out.println("userpw : " + request.getParameter("userpw"));
        return "form_ok";
    }

    @RequestMapping("/form_ok2")
    public String form_ok2(@RequestParam(name="userid") String id,
                           @RequestParam(name="userpw") String pw) {
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        return "form_ok";
    }

    @RequestMapping("/form_ok3") //초기값을 주기
    public String form_ok3(@RequestParam String userid,
                           @RequestParam(required = false, defaultValue = "1234") String userpw) {
        System.out.println("userid : " + userid);
        System.out.println("userpw : " + userpw);
        return "form_ok";
    }
}
