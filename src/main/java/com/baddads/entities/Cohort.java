package com.baddads.entities;

import com.baddads.entities.usermanagement.Dad;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cohorts")
public class Cohort {
    private @Id @GeneratedValue Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne(targetEntity = Dad.class)
    private List<Dad> members;

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
}
