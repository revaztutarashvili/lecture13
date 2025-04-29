package com.example.lecture13_2.controller;

import com.example.lecture13_2.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "Person")
public class PersonController {

    @GetMapping(value = "/hello/{name}")
    public Person getName(@PathVariable("name") String name){
        Person person = new Person();
        person.setSayHi("Hello");
        person.setName(name);
        return person;
    }
}
