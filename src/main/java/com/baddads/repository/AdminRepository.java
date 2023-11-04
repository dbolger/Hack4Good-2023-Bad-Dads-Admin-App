package com.baddads.repository;

import com.baddads.entities.usermanagement.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    List<Admin> findByFirstNameAndLastName(String firstName, String lastName);

}
