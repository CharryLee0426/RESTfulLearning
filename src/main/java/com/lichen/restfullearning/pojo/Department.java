package com.lichen.restfullearning.pojo;

import java.util.List;

public class Department {
    private Integer id;
    private Integer name;
    private List<Employee> employees;

    // NoArgConstructor
    public Department() {
    }

    // AllArgsConstructor
    public Department(Integer id, Integer name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    // getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
