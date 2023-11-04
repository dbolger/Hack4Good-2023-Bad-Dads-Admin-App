package com.baddads.entities.usermanagement.staff;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Describes the one who runs the chapter
// One-to-many staff members
@Entity
@Table(name = "facilitators")
public class Facilitator {
    private @Id @GeneratedValue Long id;

    private String firstName;
    private String lastName;

    private String location;


    public Long getId() {
        return id;
    }
}
