package com.example.demo.user.repository;

import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class UserRepository {
    public String FindById(int id) {
        return "admin";
    }

    public String IsAdmin(String name) {
        return Objects.equals(name, "teddy") ? "admin" : "user";
    }
}
