package com.spring_boot.SpringMVC.controllers;

import com.spring_boot.SpringMVC.pojos.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Value("${countries}")
    List<String > countries;

    @InitBinder
    public  void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/registration")
    public String employeeRegistration(Model theModel){
        //creating an instance of Employee
        Employee employee=new Employee();
        //adding employee instance to Model.
        theModel.addAttribute("employee",employee);
        theModel.addAttribute("countries",countries);
        return "employees/registration";
    }
    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindingResult,Model theModel){
        if(bindingResult.hasErrors()){
            System.out.println("******************** Error in Form Submission *******************");
            System.out.println(bindingResult.toString());
//            theModel.addAttribute("employee",employee);
            theModel.addAttribute("countries",countries);
            return "employees/registration";
        }
        return "employees/save-employee";
    }
}
