package com.example.rest.controller;

import com.example.rest.dto.DeptTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyRestController2 {

    @RequestMapping("/rest3")
    public String rest3() {
        return "rest3";
    }

    @RequestMapping(value = "/xml1", produces = "text/xml;charset=utf-8")
    public String xml1() {
        return "<person><name>홍길동</name></person>";
    }

    @RequestMapping(value = "/xml2", produces = "text/xml;charset=utf-8")
    public String xml2() {
        StringBuilder sbXml = new StringBuilder();
        sbXml.append("<person>");
        sbXml.append( "<name>홍길동</name>" );
        sbXml.append("</person>");
        return sbXml.toString();
    }

    @RequestMapping(value = "/json1")
    public String json1() {
        return "{ \"name\":\"홍길동\", \"age\": \"20\" }";
    }

    @RequestMapping( value="/json2", produces = "application/json")
    public DeptTO json2() {
        DeptTO to = new DeptTO( "10", "개발부", "서울" );
        return to;
    }

    @RequestMapping( value="/json3")
    public ArrayList<DeptTO> json3() {
        ArrayList<DeptTO> lists =  new ArrayList<>();
        lists.add( new DeptTO( "10", "개발부", "서울") );
        lists.add( new DeptTO( "20", "연구부", "대전") );
        lists.add( new DeptTO( "30", "생산부", "부산") );

        return lists;
    }
}
