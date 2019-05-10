package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class TestController {
    @Resource
    UserMapper um;

    @CrossOrigin
    @GetMapping("/listu")
    public List listUser(HttpServletRequest request) {
        return um.listUser();
    }

    @GetMapping("/test")
    public void test() {
        System.out.println("请求成功222");
    }

}