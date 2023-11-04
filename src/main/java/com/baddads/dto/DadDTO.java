package com.baddads.dto;

import com.baddads.entities.usermanagement.user.attributes.CaseWorker;
import com.baddads.entities.usermanagement.user.attributes.Child;
import com.baddads.entities.usermanagement.user.attributes.Ethnicity;
import com.baddads.entities.usermanagement.user.attributes.MartialStatus;

import java.time.LocalDate;
import java.util.List;

public class DadDTO {
    private String firstName;
    private String lastName;
    private LocalDate intakeDate;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String employer;
    private String workPhone;
    private String cellPhone;
    private String emergencyContact;
    private String emailAddress;
    private CaseWorker caseWorker;
    private List<Child> children;
    private String perChildSupportAmount;
    private MartialStatus martialStatus;
    private Ethnicity ethnicity;

    DadDTO() {
    }

    public DadDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(LocalDate intakeDate) {
        this.intakeDate = intakeDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getPerChildSupportAmount() {
        return perChildSupportAmount;
    }

    public void setPerChildSupportAmount(String perChildSupportAmount) {
        this.perChildSupportAmount = perChildSupportAmount;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public CaseWorker getCaseWorker() {
        return caseWorker;
    }

    public void setCaseWorker(CaseWorker caseWorker) {
        this.caseWorker = caseWorker;
    }

}