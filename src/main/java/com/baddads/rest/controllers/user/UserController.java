package com.baddads.rest.controllers.user;

import com.baddads.entities.User;
import com.baddads.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

}