package com.baddads.rest.controllers.admin;

import com.baddads.entities.usermanagement.Admin;
import com.baddads.repository.AdminRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/getAdminById")
    public Admin getAdminById(@RequestParam Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @GetMapping("/getAdminsByFirstAndLastName")
    public List<Admin> getAdminsByFirstAndLastName(@RequestParam String firstName, @RequestParam String lastName) {
        return adminRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/purge")
    public void purgeAdmins() {
        adminRepository.deleteAll();
    }

}
