package com.example.rest.controller;

import com.example.rest.dao.EmpDAO;
import com.example.rest.dto.EmpTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rest")
public class MyRestController {

    @Autowired
    private EmpDAO empDAO;

    @RequestMapping(value = "/emp/csv", produces = "text/plain;charset=utf-8")
    public String empAllCsv() {
        ArrayList<EmpTO> lists = empDAO.empAll();
        StringBuilder sbXml = new StringBuilder();

        for(EmpTO to : lists) {
            sbXml.append(to.getEmpno() + ",");
            sbXml.append(to.getEname() + ",");
            sbXml.append(to.getJob() + ",");
            sbXml.append(to.getMgr() + ",");
            sbXml.append(to.getHiredate() + ",");
            sbXml.append(to.getSal() + ",");
            sbXml.append(to.getComm() + ",");
            sbXml.append(to.getDeptno());
        }
        return sbXml.toString();
    }


    @RequestMapping(value = "/emp/xml", produces = "text/xml;charset=utf-8")
    public String empAllXML() {
        ArrayList<EmpTO> lists = empDAO.empAll();
        StringBuilder sbXml = new StringBuilder();

        sbXml.append("<emps>");
        for(EmpTO to : lists) {
            sbXml.append("<emp>");
            sbXml.append("<empno>" + to.getEmpno() + "</empno>");
            sbXml.append("<ename>" + to.getEname() + "</ename>");
            sbXml.append("<job>" + to.getJob() + "</job>");
            sbXml.append("<mgr>" + to.getMgr() + "</mgr>");
            sbXml.append("<hiredate>" + to.getHiredate() + "</hiredate>");
            sbXml.append("<sal>" + to.getSal() + "</sal>");
            sbXml.append("<comm>" + to.getComm() + "</comm>");
            sbXml.append("<deptno>" + to.getDeptno() + "</deptno>");
            sbXml.append("</emp>");
        }
        sbXml.append("</emps>");
        return sbXml.toString();
    }


    @RequestMapping( "/emp/json" )
    public ArrayList<EmpTO> empAll() {
        return empDAO.empAll();
    }

    @RequestMapping( "/emp/json/{empno}" )
    public EmpTO empByEmpno(@PathVariable String empno) {

        System.out.println( "empno = " + empno );

        return empDAO.empByEmpno( empno );
    }

//    @RequestMapping( "/emp/response" )
//    public String response() {
//        return "response";
//    }
    @GetMapping( "/emp/response" )
    public String get() {
        return "response_get";
    }

    @GetMapping( "/emp/response/{id}" )
    public String getById(@PathVariable String id, HttpServletRequest request) {
        request.setAttribute("emp", empDAO.empByEmpno(id));
        return "response_get : " + id;
    }

    @PostMapping( "/emp/response" )
    public String post(HttpServletRequest request) {
        EmpTO to = new EmpTO();
        to.setEmpno(request.getParameter("empno"));
        to.setEname(request.getParameter("ename"));
        to.setJob(request.getParameter("job"));
        to.setMgr(request.getParameter("mgr"));
        to.setHiredate(request.getParameter("hiredate"));
        to.setSal(request.getParameter("sal"));
        to.setComm(request.getParameter("comm"));
        to.setDeptno(request.getParameter("deptno"));

        int flag = empDAO.insert(to);

        return "{\"flag\" : \"" + flag + "\"}";

        //return "response_post" + data1 + " / " + data2;
    }

    @PutMapping( "/emp/response/{id}" )
    public String put(@PathVariable String id, HttpServletRequest request) {
        EmpTO to = new EmpTO();
        to.setEmpno(id);
        to.setEname(request.getParameter("ename"));
        to.setJob(request.getParameter("job"));
        to.setMgr(request.getParameter("mgr"));
        to.setHiredate(request.getParameter("hiredate"));
        to.setSal(request.getParameter("sal"));
        to.setComm(request.getParameter("comm"));
        to.setDeptno(request.getParameter("deptno"));

        int flag = empDAO.update(

                to);

        return "{\"flag\" : \"" + flag + "\"}";
    }

    @DeleteMapping( "/emp/response/{empno}" )
    public String delete(@PathVariable String empno) {
        EmpTO to = new EmpTO();
        to.setEmpno(empno);

        int flag = empDAO.delete(to);
        return "{\"flag\" : \"" + flag + "\"}";
    }
}
