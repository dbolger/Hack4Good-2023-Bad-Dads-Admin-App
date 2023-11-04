package com.baddads.entities.course;

import jakarta.persistence.*;

@Entity
@Table(name = "modules")
public class Module {
    private @Id @GeneratedValue Long id;
    private Integer moduleNumber;
    @OneToOne(targetEntity = Course.class)
    private Long courseId;

    Module() {

    }
    public Module(Integer moduleNumber, Long courseId) {
        this.moduleNumber = moduleNumber;
        this.courseId = courseId;
    }

    public Integer getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(Integer moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
