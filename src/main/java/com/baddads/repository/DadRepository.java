package com.baddads.repository;

import com.baddads.entities.usermanagement.user.Dad;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DadRepository extends CrudRepository<Dad, Long> {
    List<Dad> findByFirstNameAndLastName(String firstName, String lastName);
    Integer countByActive(Boolean active);

    @Modifying
    @Query(value = "update dads d set d.cohorts_id = ?1 where d.id = ?2", nativeQuery = true)
    void assignCohortToDad(Long cohortId, Long dadId);
}
