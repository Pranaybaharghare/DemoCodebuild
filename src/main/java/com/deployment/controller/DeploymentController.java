package com.deployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeploymentController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }
    
}
