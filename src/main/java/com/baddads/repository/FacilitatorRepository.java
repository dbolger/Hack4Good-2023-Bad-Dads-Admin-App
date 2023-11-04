package com.baddads.repository;

import com.baddads.entities.usermanagement.staff.Facilitator;
import org.springframework.data.repository.CrudRepository;

public interface FacilitatorRepository extends CrudRepository<Facilitator, Long> {
    Integer countByActive(Boolean active);
}
