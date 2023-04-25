package com.burntassignment.ems.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class employee {

    //initializing the variables
    
    //primary key
    @Id 
    private Long emp_id;

    //mapping column names
    @Column(name = "emp_name",nullable = false)
    private String emp_name;
    
    @Column(name = "gender",nullable = false)
    private String gender;
    
    @Column(name = "emp_email",nullable = false)
    private String emp_email;
    
    @Column(name = "emp_phone",nullable = false)
    private String emp_phone;
    
    @Column(name = "emp_dob")
    private String emp_dob;
        
    @Column(name = "emp_doj")
    private String emp_doj;     
        
    @Column(name = "desig")
    private String desig;
        
    @Column(name = "dept")
    private String dept;
    
    @Column(name = "sal")
    private String sal;

    public employee() {

    }
  
    //parameterized constructor
    public employee(Long emp_id, String emp_name, String gender, String emp_email, String emp_phone, String emp_dob,
            String emp_doj, String desig, String dept, String sal) {
        this.emp_id =emp_id;
        this.emp_name = emp_name;
        this.gender = gender;
        this.emp_email = emp_email;
        this.emp_phone = emp_phone;
        this.emp_dob = emp_dob;
        this.emp_doj = emp_doj;
        this.desig = desig;
        this.dept = dept;
        this.sal = sal;
    }

    //getter & setter for emp_id
    public Long getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    //getter & setter for emp_name
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name; 
    }

    //getter & setter for gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    //getter & setter for emp_email
    public String getEmp_email() {
        return emp_email;
    }
    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }
    
    //getter & setter for emp_phone
    public String getEmp_phone() {
        return emp_phone;
    }
    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }
    
    //getter & setter for emp_dov
    public String getEmp_dob() {
        return emp_dob;
    }
    public void setEmp_dob(String emp_dob) {
        this.emp_dob = emp_dob;
    }
    
    //getter & setter for emp_odj
    public String getEmp_doj() {
        return emp_doj;
    }
    public void setEmp_doj(String emp_doj) {
        this.emp_doj = emp_doj;
    }
    
    //getter & setter for desig
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }

    //getter & setter for dept
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    //getter & setter for sal
    public String getSal() {
        return sal;
    }
    public void setSal(String sal) {
        this.sal = sal;
    }
     
}
