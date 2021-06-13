package com.joca.oka.dto;

import java.util.Objects;

public class Employee {

   private final Long employeeId;

   private final String name;

   private final String employeeSalary;

   private final String empDesignation;

    public Employee(Long employeeId, String name, String employeeSalary, String empDesignation) {
        this.employeeId = employeeId;
        this.name = name;
        this.employeeSalary = employeeSalary;
        this.empDesignation = empDesignation;
    }

    public Long getEmployeeId() {
        return employeeId;
    }


    public String getName() {
        return name;
    }


    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }


}
