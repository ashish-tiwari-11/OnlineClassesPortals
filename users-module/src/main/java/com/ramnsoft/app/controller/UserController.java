package com.ramnsoft.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @RequestMapping("/test")
    @GetMapping
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("Welcome to user module.", HttpStatus.OK);
    }



}
