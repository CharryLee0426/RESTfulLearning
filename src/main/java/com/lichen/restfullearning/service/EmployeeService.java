package com.lichen.restfullearning.service;

import com.lichen.restfullearning.pojo.Employee;

public interface EmployeeService {
    // Search employee by id
    Employee searchById(Integer id);
}
