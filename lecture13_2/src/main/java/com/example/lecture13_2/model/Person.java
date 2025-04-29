package com.example.lecture13_2.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private String birthDate;

}
