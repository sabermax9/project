package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StudentController")
public class StudentController {
    @RequestMapping(value = "findAll", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    public String findAll() {
        return "";
    }
}
