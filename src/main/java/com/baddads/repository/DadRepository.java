package com.baddads.repository;

import com.baddads.entities.usermanagement.user.Dad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DadRepository extends CrudRepository<Dad, Long> {
    List<Dad> findByFirstNameAndLastName(String firstName, String lastName);
}
