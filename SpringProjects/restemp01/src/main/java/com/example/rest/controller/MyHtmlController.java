package com.example.rest.controller;

import com.example.rest.dao.EmpDAO;
import com.example.rest.dto.EmpTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/html")
public class MyHtmlController {
    @Autowired
    private EmpDAO empDAO;

    @RequestMapping("/emp/list")
    public String empAll(Model model) {
        model.addAttribute("lists", empDAO.empAll());
        return "list";
    }

    @RequestMapping("/emp/view")
    public String view(String empno, Model model) {
        model.addAttribute("to", empDAO.empByEmpno(empno));
        return "list";
    }

    @RequestMapping("/emp/ajax01")
    public String ajax01() {
        return "ajax01";
    }

    @RequestMapping("/emp/ajax02")
    public String ajax02() {
        return "ajax02";
    }

    @RequestMapping("/emp/ajax03")
    public String ajax03() {
        return "ajax03";
    }



}
