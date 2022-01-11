package com.jenny.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/sign-up")
    private String signUp() {
        return "done.";
    }

    @GetMapping("/login")
    private String login() {
        return "done.";
    }
}
