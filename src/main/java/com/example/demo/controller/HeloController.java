package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.BookService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HeloController {
	private final BookService bookService;

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/regist")
    public String regist(Model model) {
        return "regist";
    }

    @GetMapping("/select")
    public String select(Model model) {
    	model.addAttribute("book", bookService.findAll());
        return "select";
    }
}