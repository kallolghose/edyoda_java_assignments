package com.edyoda.springmvcdemo.controller;

import com.edyoda.springmvcdemo.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/getInformation")
    public String getInformation(Model model){
        model.addAttribute("student", new StudentModel());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") StudentModel studentModel, BindingResult bindingResult){
        System.out.println(String.format("%s %s", studentModel.getFirstName(), studentModel.getLastName()));
        return "student-display";
    }

}
