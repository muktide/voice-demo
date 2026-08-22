package com.example.voiceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        System.out.println("Inside Home Page...........");
        return "home";
    }

    @PostMapping("/display")
    public String display(@RequestParam String message, Model model) {
        System.out.println("Inside Display Page...........");
        model.addAttribute("originalMessage", message);
        model.addAttribute("decodedMessage", "Good: " + message);
        return "display";
    }
}