package com.baddads.entities.usermanagement.user;

import com.baddads.entities.usermanagement.user.attributes.CaseWorker;
import com.baddads.entities.usermanagement.user.attributes.Child;
import com.baddads.entities.usermanagement.user.attributes.Ethnicity;
import com.baddads.entities.usermanagement.user.attributes.MartialStatus;
import com.baddads.entities.course.Cohort;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@DynamicUpdate
@Table(name = "dads")
public class Dad {
    private @Id
    @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private Date intakeDate;
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
    @OneToOne(targetEntity = CaseWorker.class, cascade = CascadeType.PERSIST)
    private CaseWorker caseWorker;
    @OneToMany(targetEntity = Child.class, cascade = CascadeType.PERSIST)
    private List<Child> children;
    private String perChildSupportAmount;
    private MartialStatus martialStatus;
    private Ethnicity ethnicity;
    @OneToOne
    private Cohort cohort;
    private Boolean active;

    public Dad() {
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(Date intakeDate) {
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

    public void setEthnicity(String ethnicity) {
        this.ethnicity = Ethnicity.valueOf(ethnicity);
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = MartialStatus.valueOf(martialStatus);
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Cohort getCohort() {
        return cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
