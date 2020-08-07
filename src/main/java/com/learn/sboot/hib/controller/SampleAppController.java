package com.learn.sboot.hib.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleAppController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
