package com.macd.sth.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class adminController {


    @RequestMapping("/")
    public String adminDashBoard(){
        return "adminDashboard";
    }






}
