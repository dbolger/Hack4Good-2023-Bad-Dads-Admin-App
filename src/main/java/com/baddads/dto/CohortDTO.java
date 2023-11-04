package com.baddads.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class CohortDTO {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private List<DadDTO> members;
    private boolean active;

    public CohortDTO(LocalDate startDate, LocalDate endDate, List<DadDTO> members, boolean active) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.members = members;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<DadDTO> getMembers() {
        return members;
    }

    public void setMembers(List<DadDTO> members) {
        this.members = members;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
