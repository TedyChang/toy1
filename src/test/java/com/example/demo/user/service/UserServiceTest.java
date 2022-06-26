package com.example.demo.user.service;

import com.example.demo.user.repository.UserRepository;
import org.apache.catalina.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class UserServiceTest {
    private static UserRepository userRepository;
    private static UserService userService;

    @BeforeAll
    static void beforeAll(){
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
    }


    @Test
    void userName() {
        when(userRepository.FindById(10)).thenReturn("admin2");
        String userName = userService.UserName();
        assertEquals("admin2",userName);
    }
    @Test
    void isAdmin() {
        when(userRepository.IsAdmin(any())).thenReturn("------");
        String userName = userService.IsAdmin("admin");
        assertEquals("admin",userName);
    }




}