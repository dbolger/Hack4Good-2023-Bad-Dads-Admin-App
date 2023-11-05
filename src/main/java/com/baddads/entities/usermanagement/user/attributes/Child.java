package com.baddads.entities.usermanagement.user.attributes;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "children")
public class Child {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ContactWithChild getContactWithChild() {
        return contactWithChild;
    }

    public void setContactWithChild(String contactWithChild) {
        this.contactWithChild = ContactWithChild.valueOf(contactWithChild);
    }

    public enum ContactWithChild {
        NO,
        FULL,
        SHARED,
        VISITATION,
        PHONE,
        OTHER;

    }
}
