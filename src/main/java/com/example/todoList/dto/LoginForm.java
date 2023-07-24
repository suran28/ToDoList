package com.example.todoList.dto;

import com.example.todoList.entity.Login;
import jdk.internal.net.http.common.Log;

public class LoginData {
    private Long id;
    private String UserId; // form name 속성
    private String UserPw;
    public LoginData(Long id, String UserId, String UserPw){
        this.id = id;
        this.UserId = UserId;
        this.UserPw = UserPw;
    }
    @Override
    public String toString() {
        return "LoginData{" +
                "id='" + UserId + '\'' +
                ", pw='" + UserPw + '\'' +
                '}';
    }

    public Login toEntity(){
        return new Login(id, UserId, UserPw);
    }
}
