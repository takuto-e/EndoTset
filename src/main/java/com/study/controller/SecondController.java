package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    // http://localhost:8081 + "/second" を定義
    @GetMapping("/second")
    public String secondMethod() {
        String response = "2つめのController";
        return response;
    }
}
