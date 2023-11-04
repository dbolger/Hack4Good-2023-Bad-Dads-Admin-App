package com.baddads.repository;

import com.baddads.entities.course.Cohort;
import org.springframework.data.repository.CrudRepository;

public interface CohortRepository extends CrudRepository<Cohort, Long> {
    Integer countByActive(Boolean active);
}
