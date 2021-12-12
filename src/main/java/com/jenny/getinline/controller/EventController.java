package com.jenny.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/events")
@Controller
public class EventController {

    @GetMapping("/")
    private String events() {
        return "event/index";
    }

    @GetMapping("/{eventId}")
    private String eventDetail(@PathVariable Integer eventId) {
        return "event/detail";
    }
}
