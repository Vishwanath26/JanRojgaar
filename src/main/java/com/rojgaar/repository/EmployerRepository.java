package com.rojgaar.repository;

import com.rojgaar.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployerRepository extends JpaRepository<Employer, Long> {

    @Query("select e from Employer e where e.id = ?1")
    Employer findEmployerById(Long id);
}
