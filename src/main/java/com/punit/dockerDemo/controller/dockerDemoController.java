package com.punit.dockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerDemoController {

    @GetMapping("/dockerdemo")
    public String get() {
        return "Hello-World-😄";
    }
}
