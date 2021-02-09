package com.rojgaar.repository;

import com.rojgaar.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Query("select a from Application a where a.employeeId = ?1")
    List<Application> getAllByEmployeeId(Long id);

    @Query("select a from Application a where a.jobId = ?1")
    List<Application> getAllByJobId(Long id);




}
