package com.example.todoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jspController {
    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
    @GetMapping("/planner")
    public String getPlanner(){
        return "planner";
    }
}
