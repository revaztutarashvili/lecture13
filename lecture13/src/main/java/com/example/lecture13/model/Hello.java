package com.example.lecture13.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


    @GetMapping("/Get/hello")
    public String  hi (){
        return "Hello, World";
    }
}
