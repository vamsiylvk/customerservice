package com.prokarma.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @GetMapping("/hello")
    public  @ResponseBody String sayHello(String name) {
        return "hello mama";
    }

}
