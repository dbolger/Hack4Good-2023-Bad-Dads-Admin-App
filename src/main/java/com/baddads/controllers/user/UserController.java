package com.baddads.controllers.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/ping")
    public String ping() {
        return "Pong!";
    }
}
