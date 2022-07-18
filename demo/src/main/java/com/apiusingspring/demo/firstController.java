package com.apiusingspring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

/**
 * @return
 */
@GetMapping("/welcome")
    public String first_api(){

        return "Welcome to my first API";
    }
    
}
