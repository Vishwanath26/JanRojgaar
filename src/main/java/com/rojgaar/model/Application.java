package com.rojgaar.model;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Long jobId;

    private Long employeeId;

    private DateTime applicationTime;

    private int expectedWages;

    private String jobQuestionsAndResponses;

    private String additionalInformation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public DateTime getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(DateTime applicationTime) {
        this.applicationTime = applicationTime;
    }

    public int getExpectedWages() {
        return expectedWages;
    }

    public void setExpectedWages(int expectedWages) {
        this.expectedWages = expectedWages;
    }

    public String getJobQuestionsAndResponses() {
        return jobQuestionsAndResponses;
    }

    public void setJobQuestionsAndResponses(String jobQuestionsAndResponses) {
        this.jobQuestionsAndResponses = jobQuestionsAndResponses;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
