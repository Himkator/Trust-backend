package com.example.trust.controller;

import com.example.trust.models.User;
import com.example.trust.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/")
    public String mains(){
        return "main";
    }
    @PostMapping("/buy")
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/main";
    }
}
