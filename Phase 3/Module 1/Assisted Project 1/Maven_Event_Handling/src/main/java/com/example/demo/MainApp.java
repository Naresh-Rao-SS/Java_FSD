package com.example.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Publish custom event
        context.publishEvent(new CustomEvent("Hello, Custom Event!"));

        context.close();
    }
}