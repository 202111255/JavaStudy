package com.example.springbootdeveploper.controller;


import com.example.springbootdeveploper.service.TestService;
import com.example.springbootdeveploper.service.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllmembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
//    @GetMapping("/test")
//    public String test() {
//        return "Hello, world!";
//    }
}
