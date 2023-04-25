package com.burntassignment.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.burntassignment.ems.entity.employee;
import com.burntassignment.ems.repository.EmployeeRepository;
import com.burntassignment.ems.service.EmployeeService;

@Service
@CrossOrigin(origins = "*")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    // public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    // this.employeeRepository = employeeRepository;
    // }

    @Override
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    @Override
    public employee saveEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeebyId(Long emp_id){
        employeeRepository.deleteById(emp_id);
    }
}
