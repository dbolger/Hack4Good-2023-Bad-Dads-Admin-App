package com.baddads.rest.controllers.cohort;

import com.baddads.dto.CohortDTO;
import com.baddads.entities.course.Cohort;
import com.baddads.repository.CohortRepository;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cohorts")
public class CohortController {

    @Autowired
    CohortRepository cohortRepository;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/get/all")
    public ResponseEntity<Iterable<Cohort>> getAllCohorts() {
        return ResponseEntity.ok(cohortRepository.findAll());
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<Cohort> createNewCohort(@RequestBody CohortDTO cohortDTO) {
        Cohort cohort = modelMapper.map(cohortDTO, Cohort.class);
        cohortRepository.save(cohort);
        return ResponseEntity.ok(cohort);
    }

}
