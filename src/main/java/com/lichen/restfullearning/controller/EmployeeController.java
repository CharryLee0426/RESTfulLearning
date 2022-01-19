package com.lichen.restfullearning.controller;

import com.lichen.restfullearning.pojo.Employee;
import com.lichen.restfullearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee SearchById(@PathVariable Integer id) {
        return employeeService.searchById(id);
    }
}
