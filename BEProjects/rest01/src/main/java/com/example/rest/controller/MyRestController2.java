package com.example.rest.controller;


import com.example.rest.dto.DeptTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

//@RestController 는 파일을 부르지 않음
@RestController
public class MyRestController2 {
    @RequestMapping("/rest3")
    public String rest3() {
        return "rest3";
    }

    @RequestMapping(value = "/xml1", produces = "test/xml;charset=utf-8")
    public String xml1() {
        return "<person><name>홍길동</name></person>";
    }

    @RequestMapping(value = "/xml2", produces = "test/xml;charset=utf-8")
    public String xml2() {
        StringBuilder sbXml = new StringBuilder();
        sbXml.append("<person>");
        sbXml.append("<name>홍길동</name>");
        sbXml.append("</person>");

        return sbXml.toString();
    }

    @RequestMapping(value = "/json1", produces = "test/plain;charset=utf-8")
    public String json1() {
        return "{\"name\" : \"홍길동\", \"age\" : \"20\"}";
    }

    @RequestMapping(value = "/json3")
    public String json3() {
        ArrayList<DeptTO> deptTo = new ArrayList<>();
        deptTo.add(new DeptTO("10", "개발부", "서울"));
        deptTo.add(new DeptTO("20", "인사부", "부산"));
        deptTo.add(new DeptTO("30", "행정부", "대전"));

        return deptTo.toString();
    }
}
