package com.example.demo.user.service;

import com.example.demo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String UserName(){
        return userRepository.FindById(10);
    }

    public String IsAdmin(String name) {
        if (Objects.equals(name, "admin")){
            return "admin";
        }


        return userRepository.IsAdmin(name);
    }
}
