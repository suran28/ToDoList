package com.example.todoList.service;

import com.example.todoList.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class signUpService {
    private final UserRepository signUpRepository;

    public signUpService(UserRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }


}
