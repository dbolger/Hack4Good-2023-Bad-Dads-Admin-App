package com.baddads.repository;

import com.baddads.entities.usermanagement.Dad;
import org.springframework.data.repository.CrudRepository;

public interface DadRepository extends CrudRepository<Dad, Long> {
}
