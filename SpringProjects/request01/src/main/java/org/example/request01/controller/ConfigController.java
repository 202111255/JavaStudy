package org.example.request01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class ConfigController {

    @RequestMapping("/*")
    public String request3() {
        return "request3";
    }

//    @RequestMapping("/request/*")
//    public String request4() {
//        return "request4";
//    }

    @RequestMapping("/**")
    public String request4() {
        return "request4";
    }

//    @RequestMapping(value = {"/request2", "/request3"})
//    public String request2() {
//        return "request2";
//    }
}
