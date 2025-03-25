package ru.miit.wish.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stations")
public class StationsController {

    @GetMapping
    public String stations(){
        return "TEST";
    }
}
