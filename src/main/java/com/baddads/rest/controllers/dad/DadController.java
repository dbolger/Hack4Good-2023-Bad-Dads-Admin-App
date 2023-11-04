package com.baddads.rest.controllers.dad;

import com.baddads.entities.usermanagement.Dad;
import com.baddads.repository.DadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
class DadController {

    @Autowired
    private DadRepository dadRepository;

    @GetMapping("/getUser")
    public Dad getUser(@RequestParam Long id) {
        Optional<Dad> user = dadRepository.findById(id);
        return user.orElse(null);
    }

}