package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/search")
    public String search(@RequestParam String username) {

        String sql =
                "SELECT * FROM users WHERE username='" + username + "'";

        return sql;
    }
}