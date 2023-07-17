package com.example.todoList.dto;

public class LoginData {
    private String id;
    private String pw;
    public LoginData(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
