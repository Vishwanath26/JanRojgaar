package com.rojgaar.model;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String jobTitle;

    private String jobProfession;

    private String jobLocation;

    private String jobApplicantsCount;

    private String jobPositionsCount;

    private DateTime jobPostedDate;

    private String jobDescription;

    private String jobQuestions;

    private String jobType;

    private int jobDurationInMonths;

    private String jobTimings;

    private String jobWagesType;

    private int jobMinWages;

    private String jobStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobProfession() {
        return jobProfession;
    }

    public void setJobProfession(String jobProfession) {
        this.jobProfession = jobProfession;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobApplicantsCount() {
        return jobApplicantsCount;
    }

    public void setJobApplicantsCount(String jobApplicantsCount) {
        this.jobApplicantsCount = jobApplicantsCount;
    }

    public String getJobPositionsCount() {
        return jobPositionsCount;
    }

    public void setJobPositionsCount(String jobPositionsCount) {
        this.jobPositionsCount = jobPositionsCount;
    }

    public DateTime getJobPostedDate() {
        return jobPostedDate;
    }

    public void setJobPostedDate(DateTime jobPostedDate) {
        this.jobPostedDate = jobPostedDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobQuestions() {
        return jobQuestions;
    }

    public void setJobQuestions(String jobQuestions) {
        this.jobQuestions = jobQuestions;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getJobDurationInMonths() {
        return jobDurationInMonths;
    }

    public void setJobDurationInMonths(int jobDurationInMonths) {
        this.jobDurationInMonths = jobDurationInMonths;
    }

    public String getJobTimings() {
        return jobTimings;
    }

    public void setJobTimings(String jobTimings) {
        this.jobTimings = jobTimings;
    }

    public String getJobWagesType() {
        return jobWagesType;
    }

    public void setJobWagesType(String jobWagesType) {
        this.jobWagesType = jobWagesType;
    }

    public int getJobMinWages() {
        return jobMinWages;
    }

    public void setJobMinWages(int jobMinWages) {
        this.jobMinWages = jobMinWages;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }
}
