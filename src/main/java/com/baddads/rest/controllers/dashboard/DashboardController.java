package com.baddads.rest.controllers.dashboard;

import com.baddads.repository.CohortRepository;
import com.baddads.repository.DadRepository;
import com.baddads.repository.FacilitatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DadRepository dadRepository;

    @Autowired
    private FacilitatorRepository facilitatorRepository;

    @Autowired
    private CohortRepository cohortRepository;

    @GetMapping("/students/total")
    public ResponseEntity<Integer> getTotalNumberOfStudents(@RequestParam Boolean active) {
        return ResponseEntity.ok(dadRepository.countByActive(active));
    }

    @GetMapping("/facilitators/total")
    public ResponseEntity<Integer> getTotalNumberOfFacilitators(@RequestParam Boolean active) {
        return ResponseEntity.ok(facilitatorRepository.countByActive(active));
    }

    @GetMapping("/cohorts/total")
    public ResponseEntity<Integer> getTotalNumberOfCohorts(@RequestParam Boolean active) {
        return ResponseEntity.ok(cohortRepository.countByActive(active));
    }



}
