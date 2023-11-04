package com.baddads.entities.usermanagement.user.attributes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "children")
public class Child {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private ContactWithChild contactWithChild;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactWithChild() {
        return contactWithChild.name();
    }

    private enum ContactWithChild {
        NO("No"),
        FULL("Full Custody"),
        SHARED("Shared Custody"),
        VISITATION("Visitation"),
        PHONE("Phone"),
        OTHER("Other");
        private final String friendlyName;
        ContactWithChild(String friendlyName) {
            this.friendlyName = friendlyName;
        }

        public String getFriendlyName() {
            return friendlyName;
        }
    }
}
