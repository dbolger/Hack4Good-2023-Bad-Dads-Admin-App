package com.baddads.rest.controllers.admin;

import com.baddads.entities.usermanagement.staff.StaffMember;
import com.baddads.repository.StaffMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffMemberController {

    @Autowired
    StaffMemberRepository staffMemberRepository;

    @GetMapping("/getStaffMemberById")
    public StaffMember getStaffMemberById(@RequestParam Long id) {
        return staffMemberRepository.findById(id).orElse(null);
    }

    @GetMapping("/getStaffMembersByFirstAndLastName")
    public List<StaffMember> getStaffMembersByFirstAndLastName(@RequestParam String firstName, @RequestParam String lastName) {
        return staffMemberRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/staff/purge")
    public void purgeStaffMembers() {
        staffMemberRepository.deleteAll();
    }

}
