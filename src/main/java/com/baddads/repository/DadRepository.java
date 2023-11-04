package com.baddads.repository;

import com.baddads.entities.usermanagement.user.Dad;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DadRepository extends CrudRepository<Dad, Long> {
    List<Dad> findByFirstNameAndLastName(String firstName, String lastName);
    Integer countByActive(Boolean active);

    @Transactional
    @Modifying
    @Query(value = "update dads set cohort_id = ?1 where id = ?2", nativeQuery = true)
    void assignCohortToDad(Long cohortId, Long dadId);
}
