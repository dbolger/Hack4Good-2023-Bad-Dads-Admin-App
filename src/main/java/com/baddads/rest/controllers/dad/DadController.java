package com.baddads.rest.controllers.dad;

import com.baddads.dto.DadDTO;
import com.baddads.entities.usermanagement.user.Dad;
import com.baddads.repository.CohortRepository;
import com.baddads.repository.DadRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dads")
public class DadController {

    private static final Logger log = LoggerFactory.getLogger(DadController.class);

    @Autowired
    private DadRepository dadRepository;

    @Autowired
    private CohortRepository cohortRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/get/all")
    public ResponseEntity<Iterable<Dad>> getAllDads() {
        return ResponseEntity.ok(dadRepository.findAll());
    }

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public Dad registerNewDad(@RequestBody DadDTO dadDTO) {
        Dad dad = modelMapper.map(dadDTO, Dad.class);
        dadRepository.save(dad);
        return dad;
    }

    @RequestMapping(value = "/addToCohort", method = RequestMethod.POST)
    public ResponseEntity<Dad> addDadToCohort(@RequestParam Long cohortId, @RequestParam Long dadId) {
        log.info("Adding dad to cohort, cohortId: {}, dadId: {}", cohortId, dadId);
        dadRepository.assignCohortToDad(cohortId, dadId);
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/purge", method = RequestMethod.DELETE)
    public ResponseEntity<?> purgeDads() {
        log.info("Purging dads");
        dadRepository.deleteAll();
        return ResponseEntity.ok(null);
    }
}