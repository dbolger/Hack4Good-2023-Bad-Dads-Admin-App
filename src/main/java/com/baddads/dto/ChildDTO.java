package com.baddads.dto;

import com.baddads.entities.usermanagement.user.attributes.Child;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ChildDTO {
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private Child.ContactWithChild contactWithChild;

    public Child.ContactWithChild getContactWithChild() {
        return contactWithChild;
    }

    public void setContactWithChild(Child.ContactWithChild contactWithChild) {
        this.contactWithChild = contactWithChild;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
