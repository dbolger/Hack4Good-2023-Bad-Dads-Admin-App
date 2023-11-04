package com.baddads.repository;

import com.baddads.entities.usermanagement.staff.StaffMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMemberRepository extends CrudRepository<StaffMember, Long> {
    List<StaffMember> findByFirstNameAndLastName(String firstName, String lastName);

}
