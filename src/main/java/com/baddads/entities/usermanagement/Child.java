package com.baddads.entities.usermanagement;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Child {
    private @Id @GeneratedValue Long id;
    private LocalDate dateOfBirth;
    private ContactWithChild contactWithChild;

    enum ContactWithChild {
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
