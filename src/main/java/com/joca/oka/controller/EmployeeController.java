package com.joca.oka.controller;

import com.joca.oka.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final List<Employee> EMPLOYEE= Arrays.asList(

            new Employee(1l,"rakehs","55000","se"),
            new Employee (2l,"kesh","60000","it")
    );


    @GetMapping("/getEmp/{employeeId}")
    public Employee getEmployee(@PathVariable  Long employeeId){

        return EMPLOYEE.stream()
                .filter(employee -> employeeId.equals(employee.getEmployeeId()))
                .findFirst()
                .orElseThrow(()->new IllegalStateException("employee "+employeeId+ "Not Found"));
    }
}
