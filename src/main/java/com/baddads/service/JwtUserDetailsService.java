package com.baddads.service;

import com.baddads.entities.usermanagement.staff.StaffMember;
import com.baddads.repository.StaffMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    StaffMemberRepository staffMemberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        StaffMember staffMember = staffMemberRepository.findByUsername(username);
        return new User(staffMember.getUsername(), staffMember.getPassword(), new ArrayList<>());
    }
}
