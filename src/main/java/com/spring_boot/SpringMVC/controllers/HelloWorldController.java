package com.spring_boot.SpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/show-form")
    public String showForm(){
        return "show-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@RequestParam String studentName, Model theModel){
        theModel.addAttribute("name",studentName);
        return "process-form";
    }
}
