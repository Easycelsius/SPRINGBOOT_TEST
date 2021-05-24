package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/hello.do")
    public String main() {
        System.out.println("hello.do 요청");
        return "helloJsp";
    }

    
}
