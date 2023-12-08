package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {

    @Autowired
    private RestServiceConsumer restServiceConsumer;

    @GetMapping("/getData")
    public String getDataFromWebService() {
        return restServiceConsumer.consumeWebService();
    }
}
