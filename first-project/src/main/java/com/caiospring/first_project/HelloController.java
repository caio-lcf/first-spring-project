package com.caiospring.first_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping ("/SpringCaio")

    public String hello() {
        return "Hello World com Spring Boot";
    }


}
