package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeloController {
    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/regist")
    public String regist(Model model) {
        return "regist";
    }
}