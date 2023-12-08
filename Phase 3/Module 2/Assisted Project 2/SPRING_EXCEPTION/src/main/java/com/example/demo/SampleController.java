package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        if ("error".equals(name)) {
            throw new RuntimeException("Simulated error occurred");
        }
        return "Hello, " + name + "!";
    }
}
