package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RestController
    public static class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, this is a demo Maven project for Jenkins CI/CD-2.0!";
        }
    }
}
