package com.baddads.entities.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    private String location; // TODO: find datatype
    private LocalDate meetingTime;
    private List<Module> modules;


}
