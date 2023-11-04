package com.baddads.entities.usermanagement.staff;

import jakarta.persistence.*;

import java.util.List;

// Describes the one who runs the chapter
// One-to-many staff members
@Entity
@Table(name = "facilitators")
public class Facilitator {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String location;
    private Boolean active;
    @OneToMany(targetEntity = StaffMember.class)
    private List<StaffMember> reportingStaffMembers;

    Facilitator() {

    }

    public Facilitator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<StaffMember> getReportingStaffMembers() {
        return reportingStaffMembers;
    }

    public void setReportingStaffMembers(List<StaffMember> reportingStaffMembers) {
        this.reportingStaffMembers = reportingStaffMembers;
    }
}
