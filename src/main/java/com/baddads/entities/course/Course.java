package com.baddads.entities.course;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    private @Id @GeneratedValue Long id;
    private String location; // TODO: find datatype
    private LocalDate meetingTime;
    @ManyToOne(targetEntity = Module.class)
    private List<Module> modules;


}
