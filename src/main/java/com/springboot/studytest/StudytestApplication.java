package com.springboot.studytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StudytestApplication {
    @RequestMapping("/index")
    String index() {
        System.out.println("Hello Spring Boot study test");
        return "Hello Spring Boot study test";
    }
    public static void main(String[] args) {

        SpringApplication.run(StudytestApplication.class, args);
    }

}
