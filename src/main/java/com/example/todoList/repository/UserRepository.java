package com.example.todoList.repository;

import com.example.todoList.entity.SignUpData;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

// 이름이 이게 맞을까
public interface SignUpRepository extends CrudRepository<SignUpData, Long> {
    SignUpData findByUserNameAndUserPw(String userName, String userPw);
}
