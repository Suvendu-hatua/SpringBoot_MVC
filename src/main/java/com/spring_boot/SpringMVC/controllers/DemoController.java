package com.spring_boot.SpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/say-hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("data",java.time.LocalTime.now());
        return "hello-world";
    }
}
