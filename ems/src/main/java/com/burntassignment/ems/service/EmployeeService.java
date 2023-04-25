package com.burntassignment.ems.service;

import java.util.List;
import com.burntassignment.ems.entity.employee;

public interface EmployeeService {

    // function for getting all employees 
    List<employee> getAllEmployees();

    // function to receive an employee and save it into the database
    employee saveEmployee(employee employee);

    // function to delete an employee using emp_id
    void deleteEmployeebyId(Long emp_id);
}

// All the above functions are implemented in EmployeeServiceImpl.java