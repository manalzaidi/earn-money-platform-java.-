
package com.earn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Earn Money backend!";
    }
}
