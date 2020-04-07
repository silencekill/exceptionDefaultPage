package org.javaboy.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("get")
    public String get(){
        int i = 1 / 0;
        return "hello";
    }
}
