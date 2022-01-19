package com.lichen.restfullearning.pojo;

public class Employee {
    private Integer id;
    private String name;
    private Integer depId;

    // NoArgConstructor
    public Employee() {
    }

    // AllArgsConstructor
    public Employee(Integer id, String name, Integer depId) {
        this.id = id;
        this.name = name;
        this.depId = depId;
    }

    // getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }
}
