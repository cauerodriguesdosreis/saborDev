package com.example.azuretest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping ("/get")
    public String testeUnitario () {
        return "CI/CD via Github!";
    }
}
