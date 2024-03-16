package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    // http://localhost:8081 + "/first" を定義
    @GetMapping("/first")
    public String firstMethod() {
        String response = "1つめのController";
        return response;
    }
}
