package com.codevui.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        // xử lý logic gì đáy.......
        return "hello";
    }

}
