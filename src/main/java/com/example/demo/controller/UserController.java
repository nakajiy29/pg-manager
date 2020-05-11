package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    @GetMapping("/userselect")
    public String select(Model model) {
        model.addAttribute("user", userService.findAll());
        return "userSelect";
    }

    @GetMapping("/userregist")
    public String userRegist(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userRegist";
    }

    @PostMapping("/userregist")
    public String userSave(@Validated @ModelAttribute User user, BindingResult result) {
    	if(result.hasErrors()) return "userRegist";
        user.setName(user.getLastname() + " " + user.getFirstname());
        user.setBirthday(user.getYear() + "-" + user.getMonth() + "-" + user.getDay());
        userService.save(user);
        return "redirect:/userregist";
    }
}