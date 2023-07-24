package com.example.todoList.controller;

import com.example.todoList.dto.LoginForm;
import com.example.todoList.entity.LoginData;
import com.example.todoList.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class jspController {
    @Autowired
    public LoginRepository loginRepository;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
    @GetMapping("/join")
    public String CreateAccount(){
        return "sign-up";
    }
    @GetMapping("/planner")
    public String getPlanner(){
        return "planner";
    }
    @PostMapping("/test")
    public String loginHandler(LoginForm form){
        System.out.println("dto: "+form.toString());
        // 1. dto를 entity로
        LoginData loginData = form.toEntity();
        System.out.println("entity: "+ loginData);

        // 2. repository가 일할 수 있도록
        LoginData saved = loginRepository.save(loginData);
        System.out.println("repo: "+ saved);
        return "test"; //빈 문자열을 리턴하면 왜 저 위에 코드가 실행이 안될까??
    }
}
