package com.lichen.restfullearning.controller;

import com.lichen.restfullearning.pojo.Employee;
import com.lichen.restfullearning.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Employee Controller", tags = "Employee API")
@RestController
@RequestMapping("/rest/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Search employee by their id", notes = "select one")
    @GetMapping("/{id}")
    public Employee SearchById(@ApiParam(name = "Employee id", value = "id", required = true) @PathVariable Integer id) {
        return employeeService.searchById(id);
    }
}
