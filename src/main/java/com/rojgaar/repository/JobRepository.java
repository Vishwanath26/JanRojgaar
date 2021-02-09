package com.rojgaar.repository;

import com.rojgaar.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    @Query("select j from Job j where j.jobStatus = 'active'")
    List<Job> getAllActiveJobs();

    @Query("select j from Job j where j.jobTitle =?1")
    List<Job> getActiveJobsByTitle(String jobTitle);

    @Query("select j from Job j where j.jobMinWages =?1")
    List<Job> getActiveJobsByMinWages(int minWages);

    @Query("select j from Job j where j.jobProfession =?1")
    List<Job> getActiveJobsByProfession(String jobProfession);

    @Query("select j from Job j where j.jobType =?1")
    List<Job> getActiveJobsByJobType(String jobType);

    @Query("select j from Job j where j.jobDurationInMonths =?1")
    List<Job> getActiveJobsByJobDuration(int jobDurationInMonths);

}
