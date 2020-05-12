package com.macd.sth.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class employeeController {

    @RequestMapping("/dashboard")
    public String employeeDashboard(){
        return "employeeDashboard";
    }




}
