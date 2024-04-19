package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") Double numberOne, @PathVariable("numberTwo") Double numberTwo) {

        return numberOne + numberTwo;
    }
}