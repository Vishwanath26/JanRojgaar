package com.rojgaar.repository;

import com.rojgaar.model.Employee;
import com.rojgaar.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.id = ?1")
    Employer findEmployeeById(Long id);

}
