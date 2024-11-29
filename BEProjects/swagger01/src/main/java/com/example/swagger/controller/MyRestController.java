package com.example.swagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
//    @RequestMapping("/request")
//    public String request() {
//        return "request";
//    }

    @GetMapping("/get")
    public String get() {
        return "Hello world!";
    }

    @GetMapping("/get/{id}")
    public int getById(@PathVariable int id) {
        return id;
    }

    @PostMapping("/post")
    public String post(String data1, String data2) {
        return data1 + data2;
    }
}
