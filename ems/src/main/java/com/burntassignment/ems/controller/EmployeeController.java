package com.burntassignment.ems.controller;

import java.util.*;
import com.burntassignment.ems.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.burntassignment.ems.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    // public EmployeeController(EmployeeService employeeService) {
    //     this.employeeService = employeeService;
    // }
    
    //handler method to handle list of employees and return a list of employees
    @GetMapping(value = "/employees")
    public List<employee> listEmployees(){
        //model.addAttribute("employees", employeeService.getAllEmployees());
        return employeeService.getAllEmployees();
    }

    @PostMapping(value = "/employees")
    public employee saveEmployee(@RequestBody employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping(value = "/employees/{id}")
    public String deleteEmployeebyId(@PathVariable("id") Long emp_id) {
        employeeService.deleteEmployeebyId(emp_id);
        return "Employee has been deleted Successfully!!";
    }
}