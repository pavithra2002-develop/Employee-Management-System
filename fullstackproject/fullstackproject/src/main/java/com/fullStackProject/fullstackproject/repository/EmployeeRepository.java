package com.fullStackProject.fullstackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullStackProject.fullstackproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
