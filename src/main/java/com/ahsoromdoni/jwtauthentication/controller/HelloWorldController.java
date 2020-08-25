package com.ahsoromdoni.jwtauthentication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping()
    public String firstPage(){
        return "Hello World";
    }
}
