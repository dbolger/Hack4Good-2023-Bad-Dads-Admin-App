package com.baddads.rest.controllers.dad;

import com.baddads.dto.DadDTO;
import com.baddads.entities.usermanagement.Dad;
import com.baddads.repository.DadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/dad")
class DadController {

    @Autowired
    private DadRepository dadRepository;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping("/register")
    public Dad registerNewDad(@RequestBody DadDTO dadDTO) {
        Dad dad = modelMapper.map(dadDTO, Dad.class);
        dadRepository.save(dad);
        return dad;
    }
}