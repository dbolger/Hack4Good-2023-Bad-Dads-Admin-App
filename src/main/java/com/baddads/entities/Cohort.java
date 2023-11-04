package com.baddads.entities;

import com.baddads.entities.usermanagement.Dad;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cohorts")
public class Cohort {

    private LocalDate startDate;
    private LocalDate endDate;
    private List<Dad> members;

    Cohort() {
    }

    public Cohort(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


}
