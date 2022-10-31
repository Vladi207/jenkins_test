package com.github.grashchenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String seyHelloswje() {
        return "helloWorld";
    }
}
