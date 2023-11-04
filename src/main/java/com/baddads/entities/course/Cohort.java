package com.baddads.entities.course;

import com.baddads.entities.usermanagement.user.Dad;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cohorts")
public class Cohort {
    private @Id @GeneratedValue Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(targetEntity = Dad.class)
    private List<Dad> members;
    private boolean active;

    Cohort() {
    }

    public Cohort(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Dad> getMembers() {
        return members;
    }

    public void setMembers(List<Dad> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
