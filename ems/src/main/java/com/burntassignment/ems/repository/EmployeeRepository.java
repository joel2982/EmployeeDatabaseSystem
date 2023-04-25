package com.burntassignment.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burntassignment.ems.entity.employee;


public interface EmployeeRepository extends JpaRepository<employee,Long>{
    
}
