package org.example.zipcode03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZipcodeController {
    @RequestMapping("/zipcode.to")
    public String zipcode() {
        return "zipcode";
    }
    @RequestMapping("/zipcode_ok.to")
    public String zipcode_ok() {
        return "zipcode_ok()";
    }
}
