package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @GetMapping("/test2")
    public void test2() {
        System.out.println("请求成功333");
    }
}
