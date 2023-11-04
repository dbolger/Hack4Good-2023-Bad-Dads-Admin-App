package com.baddads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baddads.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
