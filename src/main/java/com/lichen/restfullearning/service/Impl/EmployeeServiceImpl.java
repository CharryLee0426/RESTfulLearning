package com.lichen.restfullearning.service.Impl;

import com.lichen.restfullearning.dao.EmployeeDao;
import com.lichen.restfullearning.pojo.Employee;
import com.lichen.restfullearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee searchById(Integer id) {
        return employeeDao.searchById(id);
    }
}
