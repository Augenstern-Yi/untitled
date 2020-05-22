package com.swjd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class First {
    //@RequestMapping("/地址")：用来映射请求的地址
    @RequestMapping("/hello")
    public String helloword(){
        System.out.println("hello");
        return "Frist";
    }
}
