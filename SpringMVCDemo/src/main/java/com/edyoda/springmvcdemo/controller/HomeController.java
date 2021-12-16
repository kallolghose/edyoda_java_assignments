package com.edyoda.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String pageHtml(){
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String processFormV2(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String message = "Hello There Mr : " + name;
        model.addAttribute("message", message);
        return "helloworld";
    }
}
