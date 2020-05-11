package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Book;
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

    @GetMapping("/search")
    public String getSearch(@ModelAttribute Book book) {
        return "search";
    }

    @PostMapping("/search")
    public String postSearch(@RequestParam("keyword")String keyword, Model model) {
        model.addAttribute("book", bookService.search(keyword));
        return "search";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/select";
    }
}