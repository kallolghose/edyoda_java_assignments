package com.edyoda.springmvcdemo.controller;

import org.apache.commons.text.CaseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/homepage")
    public String homePage(){
        return "homepage"; //Return the name of home
    }

    @RequestMapping("/studentform")
    public String studentForm(){
        return "studentform";
    }

    @RequestMapping("/displayinfo")
    public String displayinfo(){
        return "displaystudentinfo";
    }

//    @RequestMapping("/displayinfov2")
//    public String displayinfoV2(HttpServletRequest request, Model model){
//        String firstName = request.getParameter("fname");
//        String lastName = request.getParameter("lname");
//        String fullName = camelCase(String.format("%s %s", firstName, lastName));
//        model.addAttribute("fullname", fullName);
//        return "hellostudent";
//    }

    @RequestMapping("/displayinfov2")
    public String displayinfoV2(@RequestParam("fname") String firstName,
                                @RequestParam("lname") String lastName,
                                Model model){
        String fullName = camelCase(String.format("%s %s", firstName, lastName));
        model.addAttribute("fullname", fullName);
        return "hellostudent";
    }


    private String camelCase(String fullName){
        return CaseUtils.toCamelCase(fullName, true, ' ');
    }

}
