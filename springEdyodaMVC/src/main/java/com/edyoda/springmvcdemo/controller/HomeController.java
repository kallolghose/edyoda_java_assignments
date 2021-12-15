package com.edyoda.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/homepage")
    public String homePage(){
        return "homepage"; //Return the name of home
    }

}
