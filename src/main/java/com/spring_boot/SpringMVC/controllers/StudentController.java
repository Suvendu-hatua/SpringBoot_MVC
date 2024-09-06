package com.spring_boot.SpringMVC.controllers;

import com.spring_boot.SpringMVC.pojos.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    //Reading properties value from application.properties file
    @Value("${countries}")
    List<String> countries;

    @Value("${favouriteLanguage}")
    List<String>favouriteLanguage;

    @Value("${favouriteSubjects}")
    List<String> favouriteSubjects;

    @GetMapping("/registration")
    public String showRegistrationForm(Model theModel){
        //Creating an instance of Student Class
        Student student=new Student();
        //Adding instance to Model object.
        theModel.addAttribute("student",student);
        theModel.addAttribute("countries",countries);
        theModel.addAttribute("favLanguage",favouriteLanguage);
        theModel.addAttribute("favSubjects",favouriteSubjects);
//        System.out.println(countries);
        return "registration-form";
    }

    @PostMapping("/submit-form")
    public String submitRegistrationForm(@ModelAttribute("student") Student theStudent,Model theModel){
        theModel.addAttribute("student",theStudent);
        System.out.println(theStudent);
        return "submit-registration";
    }
}
