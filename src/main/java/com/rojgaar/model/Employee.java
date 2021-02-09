package com.rojgaar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String employeeName;

    private String employeePhone;

    private String employeeEmail;

    private String employeePassword;

    private String employeeAddress;

    private int employeeExperienceInYears;

    private String employeePreferredProfession;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeExperienceInYears() {
        return employeeExperienceInYears;
    }

    public void setEmployeeExperienceInYears(int employeeExperienceInYears) {
        this.employeeExperienceInYears = employeeExperienceInYears;
    }

    public String getEmployeePreferredProfession() {
        return employeePreferredProfession;
    }

    public void setEmployeePreferredProfession(String employeePreferredProfession) {
        this.employeePreferredProfession = employeePreferredProfession;
    }
}
