package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServiceConsumer {

    private final String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";

    public String consumeWebService() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
