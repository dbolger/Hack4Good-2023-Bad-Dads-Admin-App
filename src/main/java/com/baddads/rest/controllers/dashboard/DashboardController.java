package com.baddads.rest.controllers.dashboard;

import com.baddads.repository.DadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DadRepository dadRepository;

    @GetMapping("/totalStudents")
    public Integer getTotalNumberOfStudents() {
        return dadRepository.countByActive(true);
    }

}
