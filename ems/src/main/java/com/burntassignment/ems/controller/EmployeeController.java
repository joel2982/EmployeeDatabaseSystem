package com.burntassignment.ems.controller;

import java.util.*;
import com.burntassignment.ems.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.burntassignment.ems.service.EmployeeService;

@RestController // an combination of controller, which also has a response body
@CrossOrigin(origins = "*") // used to link springboot with the url mentioned in the @RequestMapping 
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    //handler method to handle list of employees and return a list of employees 
    @GetMapping(value = "/employees")
    public List<employee> listEmployees(){
        return employeeService.getAllEmployees();
    }

    //method to receive the new employee data from the from and add it to the database
    @PostMapping(value = "/employees")
    public employee saveEmployee(@RequestBody employee employee){ //here Request body helps to get the json values
        return employeeService.saveEmployee(employee);
    }

    //method to remove delete an employee's data, when employee id is given
    @DeleteMapping(value = "/employees/{id}")
    public String deleteEmployeebyId(@PathVariable("id") Long emp_id) { //path variable gets the emp_id that needs to be deleted
        employeeService.deleteEmployeebyId(emp_id);
        return "Employee has been deleted Successfully!!";
    }
}