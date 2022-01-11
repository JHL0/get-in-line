package com.jenny.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AuthController {

    @GetMapping("/login")
    private String login() {
        return "auth/login";
    }

    @GetMapping("/sign-up")
    private String signUp() {
        return "auth/sign-up";
    }
}
