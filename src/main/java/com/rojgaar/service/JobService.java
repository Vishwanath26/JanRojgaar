package com.rojgaar.service;

import com.rojgaar.model.Job;
import com.rojgaar.repository.JobRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobService {

    @Autowired
    private JobRepository jobRepository;

    private void createJob(Job job){
        jobRepository.save(job);
    }

    private List<Job> getAllJobs() {
       return jobRepository.getAllActiveJobs();
    }

    private List<Job> getJobsByTitle(String title) {
       return jobRepository.getActiveJobsByTitle(title);
    }

    private List<Job> getJobsByMinWages(int minWages) {
        return jobRepository.getActiveJobsByMinWages(minWages);
    }

    private List<Job> getJobsByProfession(String profession) {
        return jobRepository.getActiveJobsByProfession(profession);
    }

    private List<Job> getJobsByJobType(String jobType) {
        return jobRepository.getActiveJobsByJobType(jobType);
    }

    private List<Job> getJobsByJobDuration(int duration) {
        return jobRepository.getActiveJobsByJobDuration(duration);
    }


}
