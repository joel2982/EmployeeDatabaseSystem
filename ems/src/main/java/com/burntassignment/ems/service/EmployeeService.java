package com.burntassignment.ems.service;

import java.util.List;

import com.burntassignment.ems.entity.employee;

public interface EmployeeService {
    List<employee> getAllEmployees();

    employee saveEmployee(employee employee);

    void deleteEmployeebyId(Long emp_id);
}
